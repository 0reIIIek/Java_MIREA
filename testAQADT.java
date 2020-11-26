package ex1;

import java.util.ArrayList;

public class testAQADT extends ArrayQueueADT{
    public static void main(String[] args) {
        ArrayList<Object> arr = new ArrayList<>(5);
        ArrayQueueADT a = new ArrayQueueADT(5);
        a.enqueue(1, arr);
        a.enqueue(2, arr);
        a.enqueue(3, arr);
        System.out.println(a.element(arr));
        System.out.println(a.size(arr));
        System.out.println(a.isEmpty(arr));
        a.clear(arr);
        System.out.println(a.isEmpty(arr));
    }
}
