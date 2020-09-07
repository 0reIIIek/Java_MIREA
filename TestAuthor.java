package ru.mirea.inbo0519;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Alex", "abc@doIt.com", 'm');
        Author a2 = new Author("Kate", "abc@doIt.com", 'f');
        Author a3 = new Author("Konchita","abc@doIt.com", 'u');
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());
    }
}
