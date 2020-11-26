package ex1;


public class ArrayQueueModule{
    protected static int m_size;
    protected static int[] arr;

    public ArrayQueueModule() {
    }

    public ArrayQueueModule(int size) {
        m_size = size;
        arr = new int [m_size];
    }

    public void enqueue(int el) {
        if (arr.length < m_size){
            arr[arr.length-1] = el;
        }
        else{
            arr[m_size-1] = el;
        }
    }

    public int element() {
        return arr[0];
    }

    public int dequeue() {
        int temp = arr[0];
        for (int i = 1; i < m_size; i++){
            arr[i-1] = arr[i];
        }
        return temp;
    }

    public int size() {
        return arr.length;
    }

    public boolean isEmpty() {
        if (arr.length == 0) {
            return true;
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        m_size = 0;
    }
}
