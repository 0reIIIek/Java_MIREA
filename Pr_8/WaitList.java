package com.company;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList{
    public ConcurrentLinkedQueue<E> content;
    WaitList(){};

    public WaitList(ConcurrentLinkedQueue<E> c) {
        this.content = c;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void add(Object element) {

    }

    @Override
    public Object remove() {
        return null;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
