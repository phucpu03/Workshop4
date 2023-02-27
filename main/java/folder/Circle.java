/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder;

import java.util.Objects;

/**
 *
 * @author HOANG PHUC
 */
public abstract class Circle extends Shape {
    private double radius;
    
    public Circle(){
    
    }
    
    public Circle(double radius){
    this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    
    public double getRadius(){
    return radius;
    }
    
    public void setRadius(double radius){
    this.radius = radius;
    }
    @Override
    public double getArea(){
    return radius * radius * 3.14;
    }
    @Override
    public double getPerimeter(){
    return 2 * 3.14 * radius;
    }
    @Override
    public boolean equals(Object otherObj){
    
    if(this == otherObj){
        return true;
    }
    
    if(otherObj == null){
        return false;
    }
    
    if(!(this.getClass() == otherObj.getClass())){
        return false;
    }
    
    Circle other = (Circle)otherObj;
    return Objects.equals(this.radius,other.radius )
            && Objects.equals(super.color ,other.color) && Objects.equals(super.filled, other.filled) ;
    
    }
    @Override
    public String toString(){
    return  "[Shape: Circle" + ", radius " + this.radius 
            + ", color " + super.color + ", filled " + super.filled + ", area value "
            + getArea() + ", perimeter value " + getPerimeter();
    }
    
}
