package ru.mirea.inbo0519;

public class testDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Nick", 2);
        Dog d2 = new Dog("Helen");
        Dog d3 = new Dog();
        d2.setAge(5);
        System.out.println(d1);
        d1.inHumanAge();
        d2.inHumanAge();
        d3.inHumanAge();
    }
}
