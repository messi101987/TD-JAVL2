/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TD06;

/**
 *
 * @author oscartison
 */
public class MainPersonnage {
    public static void main(String[] args) {
        Personnage[] personnages = { new Personnage("foo"), 
                                     new Personnage("bar"), 
                                     new Personnage("foobar"),
        };
        
        for (Personnage p: personnages) { 
            System.out.println(p.hashCode());
        }
    }
}
