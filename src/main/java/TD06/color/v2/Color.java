/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD06.color.v2;

/**
 *
 * @author oscartison
 */
public enum Color {
    BLACK("\033[30m"), RED("\033[31m"), GREEN("\033[32m"), YELLOW("\033[33m"), BLUE("\033[34m"), MAGENTA("\033[35m"), CYAN("\033[36m"), WHITE("\033[37m"), 
    BRIGHT_BLACK("\033[90m"), BRIGHT_RED("\033[91m"), BRIGHT_GREEN("\033[92m"), BRIGHT_YELLOW("\033[903"), BRIGHT_BLUE("\033[94m"), BRIGHT_MAGENTA("\033[95m"), BRIGHT_CYAN("\033[96m"), BRIGHT_WHITE("\033[97m");
    
    private final String code;
    
    private Color(String code){
        this.code = code;
    }
    
    public String color(String text){
        return this.code + text + this.code;
    }
    
}
