package taskadditional004.models;

public class Pizza {
    private String name;
    private double price;
    private PizzaSize size;

    public Pizza(String name, double price, PizzaSize size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("%s: name - %s, price - %.2f UAH, size - %s.",
                Pizza.class.getSimpleName(), name, price, size);
    }
}
