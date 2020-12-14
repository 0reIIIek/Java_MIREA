package ex3;

import ex2.Item;


public class InternetOrder implements Item {
    public class LinkedList{
        LinkedList prev;
        LinkedList next;
        Item item;
    }
    LinkedList linkedList;

    public InternetOrder(){
        this.linkedList = new LinkedList();
    }

    public InternetOrder(int N){
        this.linkedList = new LinkedList();
        LinkedList temp = new LinkedList();
        for (int i = 0; i < N; i++){
            temp.prev = this.linkedList;
            this.linkedList.next = temp;
            temp = new LinkedList();
        }
        if (N > 1) {
            temp.next = this.linkedList;
        }
    }

    public boolean addElement(Item item){
        LinkedList current = new LinkedList();
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            temp = temp.next;
        }
        current.prev = temp;
        temp.next = current;
        current.next = this.linkedList;
        current.item = item;
        return true;
    }

    public boolean delElement(String orderName){
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            if (temp.item.getName() == orderName){
                temp = null;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int delAll(String orderName){
        int count = 0;
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            if (temp.item.getName() == orderName){
                temp = null;
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public int getSize(){
        int count = 0;
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public String[] getOrders(){
        String[] orders = new String[getSize()];
        LinkedList temp = this.linkedList;
        int pos = 0;
        while (temp.next != this.linkedList){
            orders[pos] = temp.item.getName();
            pos++;
            temp = temp.next;
        }
        return orders;
    }

    public double getCost(){
        double result = 0;
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            result += temp.item.getPrice();
            temp = temp.next;
        }
        return result;
    }

    public int getNumberOfOrder(String orderName){
        int count = 0;
        LinkedList temp = this.linkedList;
        while (temp.next != this.linkedList){
            if (temp.item.getName() == orderName){
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
