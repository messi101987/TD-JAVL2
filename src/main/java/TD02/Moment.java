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
}
