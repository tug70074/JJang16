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
public class Triangle extends Shape {
    
    public double Side1;
    public double Side2;
    public double Side3;
    
    public void setDimensions(double Side1, double Side2, double Side3) {
        this.Side1 = Side1;
        this.Side2 = Side2;
        this.Side3 = Side2;
       
    }
    
    public Triangle(String name) {
        super(name);
    }
    
    @Override
    public double getArea() {
        double s = 0.5*(Side1 + Side2 + Side3);
        return Math.sqrt(s*(s-Side1)*(s-Side2)*(s-Side3));
    }
    
    @Override
    public void printDimensions(){
        System.out.println("Side1: " + Side1);
        System.out.println("Side2: " + Side2);
        System.out.println("Side3: " + Side3);
    
    }
    
}
