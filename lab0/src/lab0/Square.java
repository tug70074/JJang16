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
public class Square extends Shape{
    public double height;
    public double length;
    
    public void setDimensions(double height, double length) {
        this.height = height;
        this.length = length;
    }

    public Square(String name) {
        super(name);
    }
    
    @Override
    public double getArea() {
        return (height*length);
    }
    
    @Override
    public void printDimensions(){
        System.out.println("height: " + height);
        System.out.println("length: "+ length);
    }
    
    
}
