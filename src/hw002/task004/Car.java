package hw002.task004;

public class Car {
    private int year;
    private String color;
    private double speed;
    private int weight;

    public Car() {

    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this(year, color);
        this.speed = speed;
    }

    public Car(int year, String color, double speed, int weight) {
        this(year, color, speed);
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}