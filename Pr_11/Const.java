package ex3;

public class Const extends BinaryOperations implements Evaluating{
    public int c;
    public Const(int a){
        c = a;
        evaluate(c);
    }
    @Override
    public int evaluate(int a) {
        return a;
    }
}
