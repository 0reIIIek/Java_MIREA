package com.company;
import java.util.Scanner;
import java.util.Stack;

public class myInterface {
    static Stack<Integer> f = new Stack<>(); // first
    static Stack<Integer> s = new Stack<>(); // second
    static int countSteps = 0; // счетчик шагов до победы

    public static void fillStack(Stack<Integer> stack){ // заполнение стека начальными значениями
        Scanner in = new Scanner(System.in);
        int inpNum;
        for (int i = 0; i < 5; i++) {
            inpNum = in.nextInt();
            stack.push(inpNum);
        }
    }
    public static Stack<Integer> reverse(Stack<Integer> oldStack){ // переворот стека
        Stack<Integer> newStack = new Stack<>();
        while(!(oldStack.empty())){ // пока в стеке есть необработанные эл-ты
            newStack.push(oldStack.peek());
            oldStack.pop();
        }
        return newStack;
    }
    public static Stack<Integer> addToBottom(Stack<Integer> oldStack, int val1, int val2){
        Stack<Integer> temp = new Stack<>();
        temp.push(val1);
        temp.push(val2);
        oldStack = reverse(oldStack);
        while(!(oldStack.empty())){
            temp.push(oldStack.peek());
            oldStack.pop();
        }
        return temp;
    }
    public static void ex5() {
        System.out.println("Заполнение первой колоды: ");
        fillStack(f); // заполнение первого стека
        System.out.println("Заполнение второй колоды: ");
        fillStack(s); // заполнение второго стека
        f = reverse(f); // переворот первого стека
        s = reverse(s); // переворот второго стека

        while(!(f.empty()) && !(s.empty()) && countSteps < 107) {
            if (f.peek() == 0 && s.peek() == 9){
                // 0 берет
                f = addToBottom(f, f.peek(), s.peek());
            }
            else if (f.peek() == 9 && s.peek() == 0){
                // 0 берет
                s = addToBottom(s, f.peek(), s.peek());
            }
            else if (f.peek() > s.peek()) {
                // добавить к низу f 2 карты
                f = addToBottom(f, f.peek(), s.peek());
            }
            else {
                // добавить к низу s 2 карты
                s = addToBottom(s, f.peek(), s.peek());
            }
            f.pop();
            s.pop();
            countSteps++;
        }
        if (countSteps == 106){
            System.out.println("botva");
        }
        else{
            if (f.empty()){
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
        ex5();
    }
}
