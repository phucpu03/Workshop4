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
public class ResizableCircle extends Circle implements Resizable{

  
    public ResizableCircle(double radius){
        super(radius);
    }
    
    @Override
    public void resize(int percent){
     radius *= percent/100.0;
    }
}
