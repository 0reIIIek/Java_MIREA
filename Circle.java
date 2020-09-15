package com.company.ex_2;

public class Circle extends Shape {
    double radius;
    public Circle(){
        this.color = "black";
        this.filled = true;
        this.radius = 1;
    }
    public Circle(double radius){
        this.color = "black";
        this.filled = true;
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.color = color;
        this.radius = radius;
        this.filled = filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "It's a Circle, Morty!\nShape: circle, radius:"+this.radius+", color: "+this.color;
    }
}
