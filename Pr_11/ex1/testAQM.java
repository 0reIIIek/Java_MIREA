package ex1;

public class testAQM {
    public static void main(String[] args) {
        ArrayQueueModule a = new ArrayQueueModule(5);
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        System.out.println(a.element());
        System.out.println(a.size());
        System.out.println(a.isEmpty());
        a.clear();
        System.out.println(a.isEmpty());
    }
}
