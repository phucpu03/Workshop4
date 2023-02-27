/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder2;

/**
 *
 * @author HOANG PHUC
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Object 1: ");
        GeometricObject s1 = new Circle(3.0);
        System.out.println(s1);
        System.out.println("Perimeter value: " + s1.getPerimeter());
        System.out.println("Area value: " + s1.getArea());
        
        System.out.println("----------------------------------------");
       
        System.out.println("Object 2: ");
        GeometricObject s2 = new ResizableCircle(6.0);
        s2.resize(20);
        
        System.out.println("----------------------------------------");
        System.out.println("Object 3: ");
        GeometricObject s3 = (GeometricObject) s2;
        System.out.println("Perimeter value: " + s3.getPerimeter());
        System.out.println("Area value: " + s3.getArea());
    }
}
