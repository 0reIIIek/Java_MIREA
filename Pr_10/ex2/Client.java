package ex2;

public class Client implements Chair{
    public static Chair chair;
    public static void sit(){}

    public static void setChair(Chair chair) {
        Client.chair = chair;
    }
}
