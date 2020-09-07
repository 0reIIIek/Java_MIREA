package ru.mirea.inbo0519;
import java.lang.*;

public class Ball {
    private String color;
    private float diameter;

    public Ball(String c, float d){
        color = c;
        diameter = d;
    }
    public Ball(String c){
        color = c;
        diameter = 0f;
    }
    public Ball(float d){
        color = "black";
        diameter = d;
    }
    public Ball(){
        color = "white";
        diameter = 15.6f;
    }

    public String getColor() {
        return color;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString(){
        return this.color + " ball's diameter is " + this.diameter;
    }
}
