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
public class MainMagicSquare {
    public static void main(String[] args) {
        MagicSquare a1 = new MagicSquare(7);
        Tableau2D.afficher(a1.t);
        System.out.println(a1.sumLine(4));
        System.out.println(a1.sumColumn(2));
        System.out.println(a1.sumDiag(2));
        System.out.println(a1.isMagicSquare());
        a1.displayMagicSquare();
    }
}
