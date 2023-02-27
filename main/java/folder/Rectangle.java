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
public abstract class Rectangle extends Shape{
    protected double width;
    protected double length;
    
    public Rectangle(){
    
    }
    
    public Rectangle(double width, double length, String color, boolean filled ){
    super(color,filled);
    this.width = width;
    this.length = length;
    }
    
    public double getWidth(){
    return width;
    }
    
    public void setWidth(double width){
    this.width = width;
    }
    
    public abstract double getLength();
    
    public void setLength(double length){
    this.length = length;
    }
    @Override
    public double getArea(){
    return width*length;
    }
    @Override
    public double getPerimeter(){
    return (width + length) * 2;
    }
    @Override
    public boolean equals(Object otherObj){
    if(this == otherObj){
    return true;
    }
    
    if(this == null){
    return false;
    }
    
    if(!(this.getClass() == other.getClass())){
    return false;
    }
    
        Rectangle other = (Rectangle)otherObj;
    return Objects.equals(this.width, other.width) 
            && Objects.equals(this.length, other.length)
            && Objects.equals(super.color, other.color)
            && Objects.equals(super.filled, other.filled);
    
    }
}
