package ex3;

public class Substract extends BinaryOperations{
    public Substract() {
    }

    @Override
    public int substract(int a, int b) {
        return evaluate(a) - evaluate(b);
    }

    @Override
    public int evaluate(int a) {
        return a;
    }
}
