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
public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    
    double getArea(){
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    
}
