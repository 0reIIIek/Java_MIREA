package com.company;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Deque;

public class myDeque {
    static Deque<Integer> f = new LinkedList<>(); // first
    static Deque<Integer> s = new LinkedList<>(); // second
    static int countSteps = 0; // счетчик шагов до победы

    public static void fillQueue(Deque<Integer> q){
        Scanner in = new Scanner(System.in);
        int inpNum;
        for (int i = 0; i < 5; i++){
            inpNum = in.nextInt();
            q.add(inpNum);
        }
    }

    public static void ex3(){
        System.out.println("Заполнение первой колоды: ");
        fillQueue(f); // заполнение первой очереди
        System.out.println("Заполнение второй колоды: ");
        fillQueue(s); // заполнение второй очереди

        while(!(f.isEmpty()) && !(s.isEmpty()) && countSteps < 107) {
            if (f.peek() == 0 && s.peek() == 9){
                // 0 берет
                f.offer(f.peek());
                f.offer(s.peek());
            }
            else if (f.peek() == 9 && s.peek() == 0){
                // 0 берет
                s.offer(f.peek());
                s.offer(s.peek());
            }
            else if (f.peek() > s.peek()) {
                // добавить к низу f 2 карты
                f.offer(f.peek());
                f.offer(s.peek());
            }
            else {
                // добавить к низу s 2 карты
                s.offer(f.peek());
                s.offer(s.peek());
            }
            f.poll();
            s.poll();
            countSteps++;
        }
        if (countSteps == 106){
            System.out.println("botva");
        }
        else{
            if (f.isEmpty()){
                System.out.println("second " + countSteps);
            }
            else{
                System.out.println("first " + countSteps);
            }
        }
    }
    public static void main(String[] args) {
        /*
        ===============
        ТЕСТЫ
        ===============

        1) { 3 4 5 7 9 }
        2) { 2 1 6 8 0 }
        ответ: second 9

        1) { 2 1 6 8 0 }
        2) { 3 4 5 7 9 }
        ответ: first 9

        1) { 1 3 5 7 9 }
        2) { 2 4 6 8 0 }
        ответ: second 5

        1) { 2 4 6 8 0 }
        2) { 1 3 5 7 9 }
        ответ: first 5

        */
        ex3();
    }
}
