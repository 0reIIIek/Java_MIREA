package ru.mirea.inbo0519;
import java.lang.*;

public class Dog {
    private String name;
    private int age;

    public Dog(String n) {
        name = n;
        age = 0;
    }
    public Dog(String n, int a){
        name = n;
        age = a;
    }
    public Dog(){
        name = "Chester";
        age = 1;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }

    public void setAge(int a) {
        this.age = a;
    }
    public int getAge() {
        return age;
    }

    public String toString() {
        return this.name + ", age " + this.age;
    }
    public void inHumanAge(){
        System.out.println(name+ "'s age as a human is " + age*7 + " years");
    }
}
