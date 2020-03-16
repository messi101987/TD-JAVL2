/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD06;

import TD06.Colorv2;

/**
 *
 * @author oscartison
 */
public class MainColorv2 {
    public static void main(String[] args) {
        System.out.println(Colorv2.YELLOW.color("bonjour"));
        
        Colorv2[] liste = Colorv2.values();
        for (Colorv2 col: liste){
            System.out.println(col.color(col.toString()));

        }

    }
}
