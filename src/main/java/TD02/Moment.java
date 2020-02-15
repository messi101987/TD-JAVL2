/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD02;

/**
 *
 * @author g55315
 */

public class Moment {
    private int hour;
    private int minute;
    private int second;
    

    public Moment(int hour, int minute, int second) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("L'heure doit etre comprise entre 0 et 23");
        }
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Les minutes doivent etre comprises entre 0 et 60");
        }        
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Les secondes doivent etre comprises entre 0 et 60");
        } 
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public Moment(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    
    public boolean equals(Moment other){
        return this.hour == other.hour && this.minute == other.minute && this.second == other.second ; 
    }
    
    public int toSeconds(){
        return (this.hour * 3600) + (this.minute * 60) + this.second;
    }
    
    public int compareTo(Moment other){
        int positive = -1;
        if (this.toSeconds() == other.toSeconds()){
            positive = 0;
        } else if (this.toSeconds() > other.toSeconds()){
            positive = 1;
        }
        return positive;
    }
}
