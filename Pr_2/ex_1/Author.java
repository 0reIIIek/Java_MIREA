package ru.mirea.inbo0519;
import java.lang.*;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String em, char g) {
        this.name = n;
        this.email = em;
        if (g == 'm') {
            this.gender = g;
        }
        else if (g == 'f'){
            this.gender = g;
        }
        else{
            this.gender = 'u';
        }
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
}
