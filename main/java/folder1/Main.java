/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folder1;

/**
 *
 * @author HOANG PHUC
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Object 1:");
        
        Movable s1 = new MovablePoint(2,5,6,9) {};
        
        System.out.println(s1);
        s1.moveDown();
        System.out.println(s1);
        
        System.out.println("------------------------");
        
        System.out.println("Object 2:");
        
        Movable s2 = new MovableCircle(2,5,6,9,12);
        
        System.out.println(s2);
        s2.moveLeft();
        System.out.println(s2);
    }
}
