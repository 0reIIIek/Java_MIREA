package ex2;

public class Dish implements Item{
    private double price;
    private String name;
    private String description;
    private int ZERO = 0;

    public Dish(String name, String description){
        this.name = name;
        this.description = description;
        this.price = ZERO;
    }

    public Dish(double price, String name, String description){
        this.price = price;
        this.name = name;
        this.description = description;
    }

    public double getPrice(){
        return this.price;
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    @Override
    public String toString() {
        return "Price: " + this.price + "\nName: " + this.name +
                "\nDescription: " + this.description + "\n";
    }
}
