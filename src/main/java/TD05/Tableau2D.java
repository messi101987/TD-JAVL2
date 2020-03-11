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
public class Tableau2D {
    public static void afficher(int[][] tab){
        for(int i = 0; i<tab.length; i++){
            for(int j = 0; j<tab[0].length; j++){
                System.out.print(tab[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static double proportionNuls(int[][] tab){
        double nbNuls = 0;
        for(int i = 0; i<tab.length; i++){
            for(int j = 0; j<tab[0].length; j++){
                if (tab[i][j] == 0){
                    nbNuls++;
                }
            }
        }
        return nbNuls / (tab.length * tab[0].length);
    }
    
    public static boolean tousPositifs(int[][] tab){
        boolean tous = true;
        for(int i = 0; i<tab.length && tous; i++){
            for(int j = 0; j<tab[0].length && tous ; j++){
                if (tab[i][j] < 0){
                    tous = false;
                }
            }
        }
        return tous;
    }
    
    
}
