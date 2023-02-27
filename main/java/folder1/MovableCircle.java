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
public class MovableCircle implements Movable {
    private int             radius;
    private MovablePoint    center;
    
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center      = new MovablePoint(x, y, xSpeed, ySpeed) {};
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;        
    }
    
    @Override
    public String toString() {
        return String.format("MovableCircle at point %1$s with radius = %2$d"
                            , center.toString(), radius);
    }
}
