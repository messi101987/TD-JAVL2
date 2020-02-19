/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD03;

/**
 *
 * @author g55315
 */
public class Card {
    private int value;
    private boolean hidden = true;
    
    public Card(int value){
        if (value < 0){
            throw new IllegalArgumentException("La valeur de la carte ne peut pas être negative");
        }
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public boolean isHidden(){
        return hidden;
    }
    
    public void reveal(){
        hidden = false;
    }
    
    @Override
    public String toString() {
        return hidden?"?":Integer.toString(value);
    }
    
    @Override
    public boolean equals(Object obj ){
        if ( this == obj) return true;
        if (obj == null || getClass () != obj. getClass ()) return false ;
        Card p = (Card) obj;
        return this.value == p.value;
    }
    
    public int hashCode(){
        return value;
    }
}
