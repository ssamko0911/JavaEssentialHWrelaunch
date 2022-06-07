package hw007.taskadditional.models;

public enum Vehicles {
    CAR(70000, "RED"),
    CYCLE(800, "GREEN"),
    BIKE(2600, "BLUE"),
    TRUCK(250000, "BLACK"),
    VAN(150000, "YELLOW");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("\nVehicle is %s, price - %d USD and color - %s.", this.name(), price, color);
    }
}
