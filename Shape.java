package com.company.ex_2;
import java.lang.*;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        this.color = "Black";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
