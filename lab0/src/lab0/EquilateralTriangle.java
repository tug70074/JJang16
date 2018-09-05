/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

/**
 *
 * @author joelj
 */
public class EquilateralTriangle extends Triangle{
    
    public double OneSide;
    
    public void setDimensions(double OneSide){
        this.OneSide = OneSide;
    }
    
    public EquilateralTriangle(String name) {
        super(name);
    }
    
    @Override
    public double getArea() {
        double s = 0.5*(OneSide*3);
        return Math.sqrt(s*(s-OneSide)*(s-OneSide)*(s-OneSide));
    }
    
    @Override
    public void printDimensions(){
        System.out.println("OneSide: " + OneSide);
    
    }
    
    
}
