package hw003.task003;

public class Plane extends Vehicle {
    private int height;
    private int passengerQuantity;

    public Plane(double price, int speed, int year, int height, int passengerQuantity) {
        super(price, speed, year);
        this.height = height;
        this.passengerQuantity = passengerQuantity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n4) height - %d;\n5) Number of passengers - %d.", height, passengerQuantity);
    }
}