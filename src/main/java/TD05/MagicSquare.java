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
        t = new int[][]{{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
    }

    public MagicSquare(int n) {
        if (n < 3 || n % 2 == 0) {
            throw new IllegalArgumentException("not possible");
        }
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
}
