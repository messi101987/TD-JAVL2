/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD06;

/**
 *
 * @author otison
 */
public class Colorizer {
    
    static String color (Color color, String text){
        switch(color){
            case RED:
                text = "\033[31m" + text + "\033[31m" ;
                break;
            case BLUE:
                text = "\033[34m" + text + "\033[34m" ;
                break;
            case GREEN:
                text = "\033[32m" + text + "\033[32m" ;
                break;
        }
        return  text;
    }
}
