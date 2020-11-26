package ex5;

public class Test {
    public static void main(String[] args) {
        String string = "Jon Yad Nancy Kex Dave";
        FileName fileName = new FileName(string);
        fileName.getLine();
        System.out.println(fileName);
    }
}
