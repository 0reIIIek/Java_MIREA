package com.company;

public class MergingInfo extends SortingStudentsByGPA{
    static Comparable[] arr = new Comparable[iDNumber.length + gpa.length];
    public static void createArr(Comparable[] a, Comparable[] b, Comparable[] c){
        int j = 0;
        //c = new Comparable[a.length + b.length];
        for (int i = 0; i < (a.length + b.length); i+=2){
            c[i] = a[j];
            c[i+1] = b[j];
            j++;
        }
    }

    public static void test1(Comparable[] a){
        createArr(iDNumber, gpa, a);
        mergeSort(a, 0, a.length-1);
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        test1(arr);
    }
}
