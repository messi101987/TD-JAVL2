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
public class Square extends Rectangle{
    public Square(double side) {
        super(side,side);
    }

    @Override
    public double getWidth() {
        throw new UnsupportedOperationException("Not possible on a square");
    }

    @Override
    public double getLength() {
        throw new UnsupportedOperationException("Not possible on a square");
    }
    
    public double getSideByLength(){
        return super.getLength();
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
   
    
}
