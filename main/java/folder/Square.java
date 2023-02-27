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
public class Square extends Rectangle{
    protected double side;
    public Square(){
        super();
    }
    
    public Square(double side, String color, boolean filled){
        super(side,side, color, filled);
    }
    
    public double getSide(){
    return side;
    }
    
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
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
    Square other = (Square)otherObj;
    return Objects.equals(this.side, other.side) && Objects.equals(super.color, other.color)
            && Objects.equals(super.filled, other.filled);
    }
    @Override
    public double getLength(){
    return getLength();
    }
    
}
