/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD05;

/**
 *
 * @author g55315
 */
public class MagicSquare {
    private int n;
    public int[][] t; 
   
    public MagicSquare() {
        this.n = 3;
        t = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    }

    public MagicSquare(int n) {
        if (n < 3 || n % 2 == 0) {
            throw new IllegalArgumentException("not possible");
        }
        this.n = n;
        t = new int[n][n];
        int ligne = n - 1;
        int col = n / 2;
        int i = 1;
        t[ligne][col] = 1;
        while(i < n*n){
            int oldL = ligne;
            int oldC = col;
            ligne = (ligne + 1) % n;
            col = (col + 1) % n;

            if (t[ligne][col] != 0) {
                ligne = oldL - 1;
                col = oldC;
            }

            t[ligne][col] = ++i;
        }

    }
    
    public int sumLine(int num) {
        if (num < 0 || num > this.n){
            throw new IllegalArgumentException("n'est pas une ligne valable !");
        }
        int res = 0;
        for(int i = 0; i < this.n; i++){
            res += t[num][i];
        }
        return res;
    }
    
    public int sumColumn(int num) {
        if (num < 0 || num > this.n){
            throw new IllegalArgumentException("n'est pas une ligne valable !");
        }
        int res = 0;
        for (int i = 0; i < this.n; i++) {
            res += t[i][num];
        }
        return res;
    }

    public int sumDiag(int num) {
        if (num != 1 && num != 2) {
            throw new IllegalArgumentException("n'est pas un attribut valable !");
        }
        int res = 0;
        if (num == 1) {
            for (int i = 0; i < n; i++) {
                res += t[i][i];
            }
        } else {
            for (int i = n - 1, j = 0; i >= 0 && j < n ; i--, j++) {
                    res += t[j][i];
                }
        }
        return res;
    }
    
    public boolean isMagicSquare(){
        int sum = sumLine(0);
        boolean magic = true;
        for (int i = 0; i<n;i++){
            magic = (sumLine(i) == sum) && magic;
            magic = (sumColumn(i) == sum) && magic;
        }
        magic = (sumDiag(1) == sumDiag(2)) && magic;
        return magic;
    }
    
    public void displayMagicSquare() {
        System.out.printf("Square order : %d \n", this.n);
        int lg = 0;
        int col = 0;
        for (int i = 0; i < n * n; i++) {
            System.out.printf("%d   ", t[lg][col]);
            col++;
            if (col == t[0].length) {
                System.out.printf("-> %d \n", sumLine(lg));
                col = 0;
                lg++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("____ ");
        }
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d   ", sumColumn(i));
        }
    }
}
