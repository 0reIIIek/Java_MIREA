package ex3;

public class Variable extends BinaryOperations implements Evaluating{
    public String var;
    public int varInt;
    public Variable(String v) {
        var = v;
    }
    public Variable(int a){
        varInt = a;
        evaluate(varInt);
    }
    @Override
    public int evaluate(int a) {
        return a;
    }
}
