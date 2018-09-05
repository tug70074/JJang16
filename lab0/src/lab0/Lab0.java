/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab0;

import java.util.Scanner;
/**
 *
 * @author joelj
 */
public class Lab0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // ask for sides of circle, square, tri, eqtri
        // print out in nice format, Name, Sides, Area
        
        Square square = new Square("Square1");
        Circle circle = new Circle("Circle1");
        Triangle tri = new Triangle("Triangle1");
        EquilateralTriangle et = new EquilateralTriangle("EqTri");
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello, please decide the length of your first shape, Square: ");
        int lengthsquare = reader.nextInt();
        System.out.println("Thank you, please decide the height of your first shape, Square: ");
        int heightsquare = reader.nextInt();
        square.setDimensions(lengthsquare, heightsquare);
        System.out.println();
        
        System.out.println("Thank you, please decide the radius of your second shape, Circle: ");
        int radiuscirc = reader.nextInt();
        circle.setDimensions(radiuscirc);
        System.out.println();
        
        
        System.out.println("Thank you, please decide the first side of your third shape, Triangle: ");
        int tri1 = reader.nextInt();
        System.out.println("Thank you, please decide the second side of your third shape, Triangle: ");
        int tri2 = reader.nextInt();
        System.out.println("Thank you, please decide the third side of your third shape, Triangle: ");
        int tri3 = reader.nextInt();
        tri.setDimensions(tri1, tri2, tri3);
        System.out.println();
        
        System.out.println("Thank you, please decide the side of your fourth shape, EquilateralTriangle: ");
        int equside = reader.nextInt();
        et.setDimensions(equside);
        System.out.println();
        
        
        System.out.println("Name: " + square.getName());
        square.printDimensions();
        System.out.println("Area: " + square.getArea() + "\n") ;
        
        
        System.out.println("Name: " + circle.getName());
        circle.printDimensions();
        System.out.println("Area: " + circle.getArea() + "\n");
        
        System.out.println("Name: " + tri.getName());
        tri.printDimensions();
        System.out.println("Area: " + tri.getArea() + "\n");
        
        System.out.println("Name: " + et.getName());
        et.printDimensions();
        System.out.println("Area: " + et.getArea() + "\n");
              
        
        System.out.println();
    }
    
}
