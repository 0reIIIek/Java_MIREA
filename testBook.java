package ru.mirea.inbo0519;

public class testBook {
    public static void main(String[] args) {
        Book b1 = new Book("ABC", 26);
        Book b2 = new Book(32);
        Book b3 = new Book("Wolf");
        Book b4 = new Book();
        b2.setName("Cat");
        b3.setpNum(60);
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b4.toString());
    }
}
