package com.company;

public class UnfairWaitList<E> extends WaitList {
    public UnfairWaitList(){};

    public Object remove(E element) {
        return content.remove(element);
    }
    public void moveToBack(E element){
        content.offer(element);
    }
}
