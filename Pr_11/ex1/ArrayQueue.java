package ex1;

import java.util.ArrayList;

public class ArrayQueue {
    public static int m_size;
    public static ArrayList<Object> arr;

    public ArrayQueue() {
    }

    public ArrayQueue(int size) {
        arr = new ArrayList<>(size);
        m_size = size;
    }

    public void enqueue(Object el) {
        if (arr.size() < m_size){
            arr.add(el);
        }
        else{
            arr.add(0, el);
        }
    }

    public Object element() {
        return arr.get(0);
    }

    public Object dequeue() {
        return arr.remove(0);
    }

    public int size() {
        return arr.size();
    }

    public boolean isEmpty() {
        if (arr.size() == 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        arr.removeAll(arr);
        m_size = 0;
    }
}
