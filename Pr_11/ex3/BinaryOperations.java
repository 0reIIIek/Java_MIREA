package ex3;

public abstract class BinaryOperations extends Main implements Evaluating{

    public Evaluating left;
    public Evaluating right;

    public int add(int a, int b){
        return left.evaluate(a) + right.evaluate(b);
    }
    public int substract(int a, int b){
        return left.evaluate(a) - right.evaluate(b);
    }
    public int divide(int a, int b){
        return left.evaluate(a) / right.evaluate(b);
    }
    public int multiply(int a, int b){
        return left.evaluate(a) * right.evaluate(b);
    }
}
