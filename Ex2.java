package com.company;
import java.lang.*;

public class Ex2 {
    public static void outPut(int n){
        if (n == 1){
            System.out.print(1);
            return;
        }
        outPut(n-1);
        System.out.print(n);
    }

    public static void main(String[] args) {
        outPut(10);
    }
}
