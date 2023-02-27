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
public class Circle implements GeometricObject{
    protected double radius = 1.0;
    
    public Circle(double radius){
    this.radius = radius;
    }
    
    @Override
    public double getPerimeter(){
    return 2 * radius * 3.14;
    }

    @Override
    public double getArea(){
    return radius * radius * 3.14;
    }

   
}
