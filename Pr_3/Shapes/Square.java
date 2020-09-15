package com.company.ex_2;
import java.lang.*;
import java.math.*;

public class Square extends Rectangle{
    protected double side;
    public Square(){
        this.side = 1;
        this.color = "Black";
        this.filled = true;
    }
    public Square(double side) {
        this.side = side;
        this.color = "Black";
        this.filled = true;
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    @Override
    public void setWidth(double side) {
        this.side = side;
    }
    @Override
    public void setLength(double side){
        this.side = side;
    }
    @Override
    public String toString(){
        return "It's a Square, Morty!\nShape: square, color: "+this.color
                +", side: "+this.side;
    }
}
