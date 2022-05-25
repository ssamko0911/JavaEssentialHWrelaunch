package hw003.task003;

public class Vehicle {
    private double price;
    private int speed;
    private int year;

    public Vehicle(double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return String.format("Vehicle info(%s):\n1) price - %.2f;\n2) speed - %d;\n3) year - %d;",
                this.getClass().getSimpleName(), price, speed, year);
    }
}