package ex4;

import ex2.Dish;
import ex2.Item;

public interface Order {
    public boolean addElement(Item item);

    public boolean remove(String dishName);

    public int removeAll(String dishName);

    public int dishQuantity();

    public int dishQuantity(String dishName);

    public Dish[] getDishes();

    public double costTotal();

    public String[] dishesNames();

    public Dish[] sortedDishesByCostDesc();
}
