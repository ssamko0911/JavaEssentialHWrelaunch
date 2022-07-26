package transporthub.models;

public class Bus extends Transport {
    private String type;
    private int numberOfDoors;

    public Bus(String mark, String model, int numberOfPassengers, DriverQualificationEnum driverQualification, String type, int numberOfDoors) {
        super(mark, model, numberOfPassengers, driverQualification);
        this.type = type;
        this.numberOfDoors = numberOfDoors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", type - %s, number of doors - %d.", type, numberOfDoors);
    }
}
