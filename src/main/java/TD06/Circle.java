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
public class Circle extends Figure {
    protected double radius;
    
    public Circle(double radius){
        this.radius  = radius;
    }
    
    @Override
    public double getArea(){
        return 2 * Math.PI * radius * radius;
    }
}
