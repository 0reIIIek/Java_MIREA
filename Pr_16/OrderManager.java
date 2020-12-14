package ex2;

import ex4.Order;

import java.util.Arrays;
import java.util.HashMap;

public class OrderManager {
    public RestaurantOrder[] restaurantOrders;
    public HashMap<String, Order> hashMap = new HashMap<String, Order>();



    public void add(HashMap<String, Order> hashMap){
        this.hashMap = hashMap;
    }

    public void add(RestaurantOrder restaurantOrder){
        restaurantOrders = Arrays.copyOf(restaurantOrders, restaurantOrders.length + 1);
        restaurantOrders[restaurantOrders.length - 1] = restaurantOrder;
    }

    public RestaurantOrder getOrder(int tableNumber){
        return restaurantOrders[tableNumber];
    }

    public void addDish(Dish dish, int tableNumber){
        restaurantOrders[tableNumber].dishes = Arrays.copyOf(restaurantOrders[tableNumber].dishes, restaurantOrders[tableNumber].dishes.length + 1);
        restaurantOrders[tableNumber].dishes[restaurantOrders[tableNumber].dishes.length - 1] = dish;
    }

    public void removeOrder(int tableNumber){
        restaurantOrders[tableNumber] = null;
    }

    public RestaurantOrder[] getOrders(){
        return restaurantOrders;
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (int i = 0; i < restaurantOrders[i].dishes.length; i++) {
            if (restaurantOrders[i].dishes[i].getName() == dishName) {
                count++;
            }
        }
        return count;
    }

    public double ordersCostSummary(){
        int price = 0;
        for (int i = 0; i < restaurantOrders.length; i++){
            price += restaurantOrders[i].dishes[i].getPrice();
        }
        return price;
    }
}