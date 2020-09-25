package com.company;
import java.lang.*;

public class Ex5 {
    public static int sumSym(int n){
        if (n < 10){
            return n;
        }
        return n % 10 + sumSym(n / 10);
    }

    public static void main(String[] args) {
        System.out.print(sumSym(876));
    }
}