package com.company.ex_1;
import java.lang.String;

public abstract class Shape {
    public boolean filled;
    public String color;
    public abstract double getRadius();
    public abstract void setRadius(double radius);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}