package com.company;
import java.util.Comparator;

public class SortingStudentsByGPA extends Student implements Comparator {
    static Comparable[] gpa = {2, 4, 3, 5, 1, 0, 3, 4, 4, 5};

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    public static void test(Comparable[] a){
        quickSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        test(gpa);
    }
}
