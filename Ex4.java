package com.company;
import java.lang.*;

public class Ex4 {
    public static void countOfNum(int k, int s){ // поиск кол-ва чисел, сумма цифр которых == s
        int count = 0; // счетчик кол-ва чисел, удовлетворяющих условию
        for (int i = (int) Math.pow(10, k-1); i < Math.pow(10, k); i++){ // проход по всем подряд числам
            if (sumSym(i) == s){
                count++;
            }
        }
        System.out.println(count);
    }
    public static int sumSym(int n) { // поиск суммы цифр числа
        if (n < 10) {
            return n;
        }
        return n % 10 + sumSym(n/10);
    }

    public static void main(String[] args) {
        countOfNum(2, 10); // 19 28 37 46 55 ... 91
        //System.out.print(sumSym(125));
    }
}
