package com.company;
import java.lang.*;
import java.util.Arrays;

public class Sorts implements Comparable<Sorts>{

    @Override
    public int compareTo(Sorts o) {
        return 0;
    }

    public static void insertionSort(Comparable[] arr) {
        Comparable temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1].compareTo(arr[j]) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void quickSort(Comparable[] arr, int first, int last)
    {
        if (first < last)
        {
            int left = first;
            int right = last;
            Comparable middle = arr[(left + right) / 2];
            do
            {
                while (arr[left].compareTo(middle) > 0) left++; // <
                while (arr[right].compareTo(middle) < 0) right--; // >
                if (left <= right)
                {
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

    public static void mergeSort(Comparable[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        mergeSort(a, lo, mid);
        mergeSort(a, mid + 1, hi);

        Comparable[] buf = Arrays.copyOf(a, a.length);

        for (int k = lo; k <= hi; k++) {
            buf[k] = a[k];
        }

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j].compareTo(buf[i]) < 0) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

}
