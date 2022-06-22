package transporthub.models;

public class Bus extends Transport {
    public static final DriverQualificationEnum DRIVER_LICENCE_LEVEL = DriverQualificationEnum.BUS_DRIVING_LICENCE;
    private String type;
    private int numberOfDoors;

    public Bus(long id, String mark, String model, int numberOfPassengers, Driver driver, Route route,
               DriverQualificationEnum driverQualification, String type, int numberOfDoors) {
        super(id, mark, model, numberOfPassengers, driver, route, driverQualification);
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
        return "Bus{" +
                "type='" + type + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
