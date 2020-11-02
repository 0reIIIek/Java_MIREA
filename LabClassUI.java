package com.company;
import java.lang.*;
import java.util.Scanner;

public class LabClassUI extends LabClass{
    public static String[] arr = new String[5];
    public static void test() {
        try {
            Scanner str;
            for(int i =0;i<arr.length;i++){
                str = new Scanner(arr[i]);
                if (arr[i] == ""){
                    throw new EmptyStringException("Empty string!");
                }
                if (lineSearch(arr, arr[i])){
                    System.out.println("Founded!");
                }
                else
                {
                    throw new StudentNotFoundException("Student not found!");
                }
            }
        } catch (EmptyStringException err) {
            err.addSuppressed(err);
        } catch (StudentNotFoundException err){
            err.addSuppressed(err);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
