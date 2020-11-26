package ex3;

public class Add extends BinaryOperations implements Evaluating{
    public Add() {
    }

    @Override
    public int add(int a, int b) {
        return evaluate(a) + evaluate(b);
    }

    @Override
    public int evaluate(int a) {
        return a;
    }
}
