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
public class MainExoBase {
    public static void main(String[] args) {
        int[][] tab = {{1,0,3,4},{5,6,7,0},{-1,10,0,12}};
        Tableau2D.afficher(tab);
        System.out.println(Tableau2D.proportionNuls(tab));
        System.out.println(Tableau2D.tousPositifs(tab));
        
    }
    
}
