package com.company;
import java.lang.*;

public class EmptyStringException extends Exception{
    public EmptyStringException(String errMsg){
        super(errMsg);
    }
}
