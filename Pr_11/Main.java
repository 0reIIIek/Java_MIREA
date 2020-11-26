package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
/*------------------------------------------------------------------
* PARSER RULES
*------------------------------------------------------------------*/

//    expr : plusminus* EOF ;
//
//    plusminus: multdiv ( ( '+' | '-' ) multdiv )* ;
//
//    multdiv : factor ( ( '*' | '/' ) factor )* ;
//
//    factor : NUMBER | '(' expr ')' ;

    public static int x;
    public static int y;
    public static int z;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("f(x, y, z) = ");
        String expressionText = in.nextLine();
        //String expressionText = "-(x*2+y)+-z";
        System.out.print("x = ");
        x = in.nextInt();
        System.out.print("y = ");
        y = in.nextInt();
        System.out.print("z = ");
        z = in.nextInt();

        List<Lexeme> lexemes = lexAnalyze(expressionText);

        lexemes = checkVariables(lexemes);
        lexemes = chekUnarMinuses(lexemes);

        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        System.out.print("f(" + x + ", " + y + ", " + z + ") = ");
        System.out.println(expr(lexemeBuffer));
    }

    public static List<Lexeme> checkVariables(List<Lexeme> lexemes){
        int pos = 0;
        while (pos < lexemes.size()){
            if (lexemes.get(pos).type == LexemeType.VAR_X){
                lexemes.get(pos).type = LexemeType.NUMBER;
                lexemes.get(pos).value = Integer.toString(x);
            }
            else if (lexemes.get(pos).type == LexemeType.VAR_Y){
                lexemes.get(pos).type = LexemeType.NUMBER;
                lexemes.get(pos).value = Integer.toString(y);
            }
            else if (lexemes.get(pos).type == LexemeType.VAR_Z){
                lexemes.get(pos).type = LexemeType.NUMBER;
                lexemes.get(pos).value = Integer.toString(z);
            }
            pos++;
        }
        return lexemes;
    }

    public static List<Lexeme> chekUnarMinuses(List<Lexeme> lexemes){
        int pos = 1;
        while (pos < lexemes.size()){
            if (lexemes.get(pos).type == LexemeType.NUMBER && lexemes.get(pos-1).type == LexemeType.OP_UNAR_MIN){
                pos--;
                lexemes.remove(pos);
                String str = "-";
                str = str.concat(lexemes.get(pos).value);
                lexemes.set(pos, new Lexeme(LexemeType.NUMBER, str));
            }
            else if (lexemes.get(pos).type == LexemeType.LEFT_BRACKET && lexemes.get(pos-1).type == LexemeType.OP_UNAR_MIN){
                pos--;
                lexemes.remove(pos);
                lexemes.get(pos).type = LexemeType.LEFT_BRACKET_AFTER_UNAR_MIN;
            }
            pos++;
        }
        return lexemes;
    }

    public enum LexemeType {
        LEFT_BRACKET, RIGHT_BRACKET, LEFT_BRACKET_AFTER_UNAR_MIN,
        OP_PLUS, OP_MINUS, OP_MUL, OP_DIV, OP_UNAR_MIN,
        NUMBER,
        VAR_X, VAR_Y, VAR_Z,
        EOF;
    }

    public static class Lexeme {
        LexemeType type;
        String value;

        public Lexeme(LexemeType type, String value) {
            this.type = type;
            this.value = value;
        }

        public Lexeme(LexemeType type, Character value) {
            this.type = type;
            this.value = value.toString();
        }

        @Override
        public String toString() {
            return "Lexeme{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class LexemeBuffer {
        private int pos;

        public List<Lexeme> lexemes;

        public LexemeBuffer(List<Lexeme> lexemes) {
            this.lexemes = lexemes;
        }

        public Lexeme next() {
            return lexemes.get(pos++);
        }

        public void back() {
            pos--;
        }

        public int getPos() {
            return pos;
        }
    }

    public static List<Lexeme> lexAnalyze(String expText) {
        ArrayList<Lexeme> lexemes = new ArrayList<>();
        int pos = 0;
        while (pos< expText.length()) {
            char c = expText.charAt(pos);
            switch (c) {
                case '(':
                    lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET, c));
                    pos++;
                    continue;
                case ')':
                    lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET, c));
                    pos++;
                    continue;
                case '+':
                    lexemes.add(new Lexeme(LexemeType.OP_PLUS, c));
                    pos++;
                    continue;
                case '-':
                    if (pos == 0){
                        lexemes.add(new Lexeme(LexemeType.OP_UNAR_MIN, c));
                    }
                    else{
                        if (lexemes.get(lexemes.size()-1).type == LexemeType.OP_PLUS ||
                                lexemes.get(lexemes.size()-1).type == LexemeType.OP_MINUS ||
                                lexemes.get(lexemes.size()-1).type == LexemeType.OP_MUL ||
                                lexemes.get(lexemes.size()-1).type == LexemeType.OP_DIV){
                            lexemes.add(new Lexeme(LexemeType.OP_UNAR_MIN, c));
                        }
                        else{
                            lexemes.add(new Lexeme(LexemeType.OP_MINUS, c));
                        }
                    }
                    //lexemes.add(new Lexeme(LexemeType.OP_MINUS, c));
                    pos++;
                    continue;
                case '*':
                    lexemes.add(new Lexeme(LexemeType.OP_MUL, c));
                    pos++;
                    continue;
                case '/':
                    lexemes.add(new Lexeme(LexemeType.OP_DIV, c));
                    pos++;
                    continue;
                default:
                    if (c <= '9' && c >= '0') {
                        StringBuilder sb = new StringBuilder();
                        do {
                            sb.append(c);
                            pos++;
                            if (pos >= expText.length()) {
                                break;
                            }
                            c = expText.charAt(pos);
                        } while (c <= '9' && c >= '0');
                        lexemes.add(new Lexeme(LexemeType.NUMBER, sb.toString()));
                    } else {
                        if (c == 'x'){
                            lexemes.add(new Lexeme(LexemeType.VAR_X, c));
                        }
                        else if (c == 'y'){
                            lexemes.add(new Lexeme(LexemeType.VAR_Y, c));
                        }
                        else if (c == 'z'){
                            lexemes.add(new Lexeme(LexemeType.VAR_Z, c));
                        }
                        else if (c != ' ') {
                            throw new RuntimeException("Unexpected character: " + c);
                        }
                        pos++;
                    }
            }
        }
        lexemes.add(new Lexeme(LexemeType.EOF, ""));

        for (int i = 2; i < lexemes.size(); i++){
            if (lexemes.get(i-2).type == LexemeType.LEFT_BRACKET &&
                    lexemes.get(i-1).type == LexemeType.OP_MINUS &&
                    lexemes.get(i).type == LexemeType.NUMBER){
                lexemes.get(i-1).type = LexemeType.OP_UNAR_MIN;
            }
        }

        return lexemes;
    }

    public static int expr(LexemeBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        if (lexeme.type == LexemeType.EOF) {
            return 0;
        } else {
            lexemes.back();
            return plusminus(lexemes);
        }
    }

    public static int plusminus(LexemeBuffer lexemes) {
        int value = multdiv(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_PLUS:
                    value += multdiv(lexemes);
                    break;
                case OP_MINUS:
                    value -= multdiv(lexemes);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                    lexemes.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
            }
        }
    }

    public static int multdiv(LexemeBuffer lexemes) {
        int value = factor(lexemes);
        while (true) {
            Lexeme lexeme = lexemes.next();
            switch (lexeme.type) {
                case OP_MUL:
                    value *= factor(lexemes);
                    break;
                case OP_DIV:
                    value /= factor(lexemes);
                    break;
                case EOF:
                case RIGHT_BRACKET:
                case OP_PLUS:
                case OP_MINUS:
                    lexemes.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
            }
        }
    }

    public static int factor(LexemeBuffer lexemes) {
        Lexeme lexeme = lexemes.next();
        switch (lexeme.type) {
            case NUMBER:
                return Integer.parseInt(lexeme.value);
            case LEFT_BRACKET:
                int value = plusminus(lexemes);
                lexeme = lexemes.next();
                if (lexeme.type != LexemeType.RIGHT_BRACKET) {
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
                }
                return value;
            case LEFT_BRACKET_AFTER_UNAR_MIN:
                value = plusminus(lexemes);
                lexeme = lexemes.next();
                if (lexeme.type != LexemeType.RIGHT_BRACKET) {
                    throw new RuntimeException("Unexpected token: " + lexeme.value
                            + " at position: " + lexemes.getPos());
                }
                return -1*value;
            default:
                throw new RuntimeException("Unexpected token: " + lexeme.value
                        + " at position: " + lexemes.getPos());
        }
    }

}
