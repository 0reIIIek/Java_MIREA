package ru.mirea.inbo0519;

public class Book {
    public String name;
    public int pNum;

    public Book(String n) {
        name = n;
    }
    public Book(){
        name = "New Book";
        pNum = 0;
    }

    public Book(String n, int pN) {
        name = n;
        pNum = pN;
    }

    public Book(int pN) {
        pNum = pN;
    }

    public String getName() {
        return name;
    }

    public int getpNum() {
        return pNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpNum(int pNum) {
        this.pNum = pNum;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", pNum=" + pNum +
                '}';
    }
}
