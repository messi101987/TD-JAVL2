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
        Rectangle r1 = new Rectangle(55, 55);
        Square s1 = new Square(55);
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
        System.out.println(s1.getSideByLength());

        Square square = new Square(42);
        Square square2 = new Square(42);
        System.out.println(square.equals(square2));
        Rectangle rectangle = new Rectangle(42, 42);
        System.out.println(square.getClass() == rectangle.getClass());
        System.out.println(square instanceof Rectangle);
    }
    
    
}
