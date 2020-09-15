package com.company.ex_1;
import java.lang.*;
import java.math.*;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius){
        this.filled = false;
        this.color = "red";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    public String toString(){
        return "It's a Circle, Morty!\nShape: circle, radius:"+this.radius+", color: "+this.color;
    }
}
