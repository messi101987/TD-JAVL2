/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD01;

import java.util.Scanner;

/**
 * Classes facilitant la gestion de l'affichage console du <code>Memory</code>.
 */
public class MemoryUtil {

    /**
     * Affiche l'état actuel des cartes. Une carte ramassées est indiquée par sa
     * valeur. Un "?" indique une carte pas encore ramassée.
     *
     * @param cards les cartes.
     * @param collectedCards indique quelles cartes ont été ramassées.
     */
    public static void displayCards(int[] cards, boolean[] collectedCards) {
        System.out.print("Les cartes: ");
        for (int i = 0; i < collectedCards.length; i++) {
            System.out.print((collectedCards[i] ? cards[i] : "?") + " ");
        }
        System.out.println();
    }
    
    public static int[] initCards(int n) {
        if (n < 3 || n > 20) {
            throw new IllegalArgumentException("le nombre n'est pas inclus entre 3 et 20");
        }
        int[] tab = new int[2*n];
        int j = 1;
        for(int i = 0; i < tab.length ; i += 2){
            tab[i] = j;
            tab[i+1] = j;
            j++;
        } 
        
        return tab;
    }
    
    public static void printTab(int[] tab) {
        for(int i =0; i<tab.length; i++) {
            System.out.print(tab[i]);
        }
        System.out.println(""); 
    }
    
    public static int askPosition(int[] cards, boolean[] collectedCards){
        Scanner clavier = new Scanner(System.in);
        int pos = 0;
        boolean joué = false;
        while(!joué){
            System.out.print("Entrez une position : ");
            pos = clavier.nextInt();
            if (!collectedCards[pos]) {
                
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        printTab(initCards(8));
    }
}