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
public class MainFigure {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(55, 26);
        Square s1 = new Square(10);
        System.out.println(s1.getArea());
        Rectangle[] liste = {
            new Rectangle(20, 0.55),
            new Rectangle(56, 22),
            new Square(55),
            new Rectangle(10, 20)
        };
        for(Rectangle elt: liste){
            System.out.println(elt.getArea());
        }
    }
    
    
}
