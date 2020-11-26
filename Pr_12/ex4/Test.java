package ex4;

public class Test {
    public static void main(String[] args) {
        String string = "88005553535";
        TelephoneNumber telephoneNumber = new TelephoneNumber(string);
        System.out.println(telephoneNumber.toString());
    }
}
