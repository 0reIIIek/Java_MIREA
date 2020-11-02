package com.company;
import java.lang.*;

public class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String errMsg) {
        super(errMsg);
    }
}