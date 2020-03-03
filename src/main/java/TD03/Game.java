/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD03;

import java.util.Random;
/**
 *
 * @author g55315
 */
public class Game {
    private Card[] cards;
    
    public Game(int n){
        if (n < 3 || n > 20) {
            throw new IllegalArgumentException("Le nombre de carte doit etre inclus entre 3 et 20");
        }
        cards = new Card[2 * n];
        for(int i = 0; i<n;i++){
            cards[i * 2]= new Card(i + 1);
            cards[(i * 2) + 1] = new Card(i + 1);
        }
    }
    
    public void shuffle() {
        int index;
        Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            swap(cards, i, index);
        }
    }
    
    static void swap(Card[] array, int pos1, int pos2) {
        if (pos1 < 0 || pos2 < 0) {
            throw new IllegalArgumentException("Les positions doivent être des "
                    + "entiers positifs " + pos1 + " " + pos2);
        }
        Card savedValue = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = savedValue;
    }
    
    public int getSize() {
        return cards.length;
    }
    
    public boolean isHidden(int pos){
        return cards[pos].isHidden();
    }
    
    public int getCardValue(int pos){
        return cards[pos].getValue();
    }
    
    public boolean checkPositions(int pos1, int pos2){
        if(pos1 == pos2){
            throw new IllegalArgumentException("Vous avez tiré 2 fois la meme carte");
        }
        return getCardValue(pos1) == getCardValue(pos2);
    }
    
    public boolean isGameOver(){
        boolean over = true;
        for(int i = 0; i<cards.length;i++){
            over = isHidden(i) && over;
        }
        return over;
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Card card : cards) {
            result = result + " " + card.toString();
        }
        return result;
    }
    
    
}
