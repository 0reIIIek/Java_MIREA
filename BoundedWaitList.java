package com.company;

public class BoundedWaitList extends WaitList{
    public int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(Object element) {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
