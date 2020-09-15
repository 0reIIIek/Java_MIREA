package com.company.ex_2;
import java.lang.*;
import java.math.*;

public class Rectangle extends Shape {
    public double width;
    public double length;
    public Rectangle(){
        this.length = 1;
        this.width = 1;
        this.color = "black";
        this.filled = true;
    }
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        this.color = "black";
        this.filled = true;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return "It's a Rectangle, Morty!\nShape: rectangle, color: "+this.color
                +", width: "+this.width+", length: "+this.length;
    }

}
