package ex2;

import java.util.LinkedList;

public interface Queue {
    public void enqueue(Object el, LinkedList q);
    public Object element(LinkedList q);
    public Object dequeue(LinkedList q);
    public int size(LinkedList q);
    public boolean isEmpty(LinkedList q);
    public void clear(LinkedList q);
}
