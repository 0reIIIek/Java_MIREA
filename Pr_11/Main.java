package ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Const c = new Const(2);
        Variable v = new Variable("x");
        Multiply multi = new Multiply();
        multi.multiply(c.evaluate(2), v.evaluate(5));
        Substract sub = new Substract();
        c = new Const(3);
        sub.substract(multi.evaluate(multi.multiply(c.evaluate(2), v.evaluate(5))), c.evaluate(3));
        System.out.println(sub.substract(multi.evaluate(multi.multiply(c.evaluate(2), v.evaluate(5))), c.evaluate(3)));

        // x*x-2x+1
        System.out.println("x^2 - 2x + 1");
        Scanner scanner = new Scanner(System.in);
        System.out.print("x = ");
        int x = scanner.nextInt();
        c = new Const(2);
        v = new Variable("x");
        multi = new Multiply();
        sub = new Substract();
        c = new Const(2);
        Add add = new Add();
        System.out.println(
                add.evaluate(add.add(sub.substract(multi.evaluate(multi.multiply(v.evaluate(x), v.evaluate(x))),
                multi.evaluate(multi.multiply(c.evaluate(2), v.evaluate(x)))), c.evaluate(1))));
    }
}
