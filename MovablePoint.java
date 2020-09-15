package com.company.ex_4;
import java.lang.*;

public class MovablePoint implements Movable {
    int x,
        y,
        xSpeed,
        ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override
    public String toString(){
        return "x: "+this.x+", y: "+this.y+", xSpeed: "+this.xSpeed+", ySpeed: "+this.ySpeed;
    }
    @Override
    public void moveUp() {
        y += ySpeed;
    }
    @Override
    public void moveDown() {
        y -= ySpeed;
    }
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }
    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
