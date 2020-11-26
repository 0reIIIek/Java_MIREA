package ex3;

public class Multiply extends BinaryOperations{
    public Multiply() {
    }

    @Override
    public int multiply(int a, int b) {
        return evaluate(a) * evaluate(b);
    }

    @Override
    public int evaluate(int a) {
        return a;
    }
}
