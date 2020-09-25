package com.company;
import java.lang.*;

public class Ex1 {
    public static void ryadIt(int n) { // итеративно
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
        }
    }
    public static void ryadRec(int n){
        if (n == 1){
            System.out.print(1);
            return;
        }
        ryadRec(n-1);
        for (int i = 1; i <= n; i++){
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        ryadIt(5);
        ryadRec(5);
    }
}
