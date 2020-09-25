package com.company;
import java.lang.*;

public class Ex3 {
    public static void fromAtoB(int A, int B){
        if (B == A){
            System.out.print(A);
            return;
        }
        fromAtoB(A, B-1);
        System.out.print(B);
    }
    public static void fromBtoA(int A, int B){
        System.out.print(A);
        if (A == B){
            return;
        }
        fromBtoA(A-1, B);
    }

    public static void main(String[] args) {
        fromAtoB(3, 8);
        System.out.println();
        fromBtoA(8, 3);
    }
}
