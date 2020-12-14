package ex1;

public final class Drink {
    private double price;
    private String name;
    private String description;
    private int ZERO = 0;

    public Drink(String name, String description){
        this.name = name;
        this.description = description;
        this.price = ZERO;
    }

    public Drink(double price, String name, String description){
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
