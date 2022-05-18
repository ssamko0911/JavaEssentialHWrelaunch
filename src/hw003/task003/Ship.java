package hw003.task003;

public class Ship extends Vehicle {
    private String port;
    private int passengerQuantity;

    public Ship(double price, int speed, int year, String port, int passengerQuantity) {
        super(price, speed, year);
        this.port = port;
        this.passengerQuantity = passengerQuantity;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public int getPassengerQuantity() {
        return passengerQuantity;
    }

    public void setPassengerQuantity(int passengerQuantity) {
        this.passengerQuantity = passengerQuantity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n4) port - %s;\n5) Number of passengers - %d.", port, passengerQuantity);
    }
}