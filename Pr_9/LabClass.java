package com.company;
import java.lang.*;

public class LabClass implements Comparable<LabClass> {

    @Override
    public int compareTo(LabClass o) {
        return 0;
    }

    public static void quickSort(Comparable[] arr, int first, int last) {
        if (first < last) {
            int left = first;
            int right = last;
            Comparable middle = arr[(left + right) / 2];
            do {
                while (arr[left].compareTo(middle) > 0) left++; // <
                while (arr[right].compareTo(middle) < 0) right--; // >
                if (left <= right) {
                    Comparable temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }
            } while (left <= right);
            quickSort(arr, first, right);
            quickSort(arr, left, last);
        }
    }

    public static boolean lineSearch(Comparable[] arr, Comparable value) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
