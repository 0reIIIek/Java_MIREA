package ru.mirea.inbo0519;

public class testBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("BLACK", 15.32f);
        Ball b2 = new Ball("RED");
        Ball b3 = new Ball(12f);
        Ball b4 = new Ball();
        b3.setColor("BLUE");
        b2.setDiameter(45f);
        b4.getColor();
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
    }
}
