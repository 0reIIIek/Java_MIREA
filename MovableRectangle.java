package com.company.ex_4;
import java.lang.*;

public class MovableRectangle implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    protected boolean isCorrectCoordinates(){
        return topLeft.xSpeed == bottomRight.xSpeed &&
                topLeft.ySpeed == bottomRight.ySpeed;
    }
    @Override
    public String toString(){
        return "Rectangle's coordinates: \ntopLeft: "+topLeft.toString()+
                "\nbottomRight: "+bottomRight.toString();
    }
    @Override
    public void moveUp() {
        if (isCorrectCoordinates()){
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }
    @Override
    public void moveDown() {
        if (isCorrectCoordinates()){
            topLeft.moveDown();
            bottomRight.moveDown();
        }
    }
    @Override
    public void moveLeft() {
        if (isCorrectCoordinates()){
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }
    @Override
    public void moveRight() {
        if (isCorrectCoordinates()){
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }
}
