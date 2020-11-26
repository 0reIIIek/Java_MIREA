package ex1;

import java.util.ArrayList;

public class ArrayQueueADT {
    public static int m_size;

    public ArrayQueueADT() {
    }

    public ArrayQueueADT(int size) {
        m_size = size;
    }

    public void enqueue(int el, ArrayList arr) {
        if (arr.size() < m_size){
            arr.add(el);
        }
        else{
            arr.add(0, el);
        }
    }

    public Object element(ArrayList arr) {
        return arr.get(0);
    }

    public Object dequeue(ArrayList arr) {
        return arr.remove(0);
    }

    public int size(ArrayList arr) {
        return arr.size();
    }

    public boolean isEmpty(ArrayList arr) {
        if (arr.size() == 0) {
            return true;
        }
        return false;
    }

    public void clear(ArrayList arr) {
        arr.removeAll(arr);
        m_size = 0;
    }
}
