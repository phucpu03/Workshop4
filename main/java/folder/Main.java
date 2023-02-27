/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

/**
 *
 * @author HOANG PHUC
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Object 1:");
        Shape s1 = new Circle(12, "red", true) {
            @Override
            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println(s1.toString());
        
        System.out.println("---------------------------------------");
        System.out.println("Object 2:");
        Shape s2 = new Circle(12, "blue", true) {
            @Override
            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        s2.equals(s1);
        System.out.println(s2.equals(s1));
        
        System.out.println("---------------------------------------");
        System.out.println("Object 3:");
        Shape s3 = new Rectangle(3, 4, "red", true) {
            @Override
            public double getLength() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean equals() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String toString() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        System.out.println("Area value: " + s3.getArea());
        System.out.println("Perimeter value: " + s3.getPerimeter());
        
        System.out.println("---------------------------------------");
        System.out.println("Object 4:");
        Shape s4 = new Square(3.0, "red", true);
        System.out.println(s4.equals(s3));
    }
}