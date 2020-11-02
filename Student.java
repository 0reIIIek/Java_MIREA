package com.company;
import java.lang.*;

public class Student extends LabClass {
    static Comparable[] iDNumber = {3, 2, 6, 3, 8, 2, 90, 23, 26, 17};
    public static void test(Comparable[] a) {
        quickSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {;
        test(iDNumber);
    }
}