package ex3;

public class Divide extends BinaryOperations implements Evaluating{
    public Divide() {
    }

    @Override
    public int divide(int a, int b) {
        return evaluate(a) / evaluate(b);
    }

    @Override
    public int evaluate(int a) {
        return a;
    }
}
