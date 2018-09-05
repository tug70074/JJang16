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
public class Circle extends Shape {
    
    public double radius;

    public Circle(String name) {
        super(name);
    }
    
    public void setDimensions(int radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return (3.1416*radius*radius);
    }
   
    @Override
    public void printDimensions(){
        System.out.println("Radius: " + radius);
    
    }
    
}
