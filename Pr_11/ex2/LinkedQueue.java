package ex2;

import java.util.LinkedList;

public class LinkedQueue implements Queue{

    public LinkedQueue() {
    }

    @Override
    public void enqueue(Object el, LinkedList q) {
        q.push(el);
    }

    @Override
    public Object element(LinkedList q) {
        return q.peek();
    }

    @Override
    public Object dequeue(LinkedList q) {
        Object temp = q.peek();
        q.pop();
        return temp;
    }

    @Override
    public int size(LinkedList q) {
        return q.size();
    }

    @Override
    public boolean isEmpty(LinkedList q) {
        return q.isEmpty();
    }

    @Override
    public void clear(LinkedList q) {
        q.clear();
    }
}
