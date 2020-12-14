package ex2;

import java.util.Arrays;

public class RestaurantOrder implements Item{
    int size;
    Dish[] dishes;

    public void add(Dish dish){
        dishes = Arrays.copyOf(dishes, dishes.length + 1);
        dishes[dishes.length - 1] = dish;
    }

    public boolean remove(String dishName){
        for (int i = 0; i < dishes.length; i++){
            if (dishes[i].getName() == dishName){
                dishes[i] = null;
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName){
        int count = 0;
        for (int i = 0; i < dishes.length; i++){
            if (dishes[i].getName() == dishName){
                dishes[i] = null;
                count++;
            }
        }
        return count;
    }

    public int dishQuantity(){
        return dishes.length;
    }

    public int dishQuantity(String dishName){
        int count = 0;
        for (int i = 0; i < dishes.length; i++){
            if (dishes[i].getName() == dishName){
                count++;
            }
        }
        return count;
    }

    public Dish[] getDishes(){
        return dishes;
    }

    public double costTotal(){
        int price = 0;
        for (int i = 0; i < dishes.length; i++){
            price += dishes[i].getPrice();
        }
        return price;
    }

    public String[] dishesNames(){
        String[] strings = new String[dishes.length];
        for (int i = 0; i < dishes.length; i++){
            strings[i] = dishes[i].getName();
        }
        return strings;
    }

    public Dish[] sortedDishesByCostDesc(){
        for(int i = dishes.length-1 ; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (dishes[j].getPrice() > dishes[j + 1].getPrice()) {
                    Dish tmp = dishes[j];
                    dishes[j] = dishes[j + 1];
                    dishes[j + 1] = tmp;
                }
            }
        }
        return dishes;
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
