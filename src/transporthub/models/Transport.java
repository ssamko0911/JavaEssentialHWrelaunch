package transporthub.models;

import java.util.Optional;

public abstract class Transport {
    private static int idCounter;
    private int id;
    private String mark;
    private String model;
    private int numberOfPassengers;
    private Driver driver;
    private Route route;
    private DriverQualificationEnum driverQualification;

    public Transport(String mark, String model, int numberOfPassengers, DriverQualificationEnum driverQualification) {
        this.id = idCounter++;
        this.mark = mark;
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
        this.driverQualification = driverQualification;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public Optional<Driver> getDriver() {
        return Optional.ofNullable(driver);
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public DriverQualificationEnum getDriverQualification() {
        return driverQualification;
    }

    public void setDriverQualification(DriverQualificationEnum driverQualification) {
        this.driverQualification = driverQualification;
    }

    @Override
    public String toString() {
        return String.format("Transport: id - %d, mark - %s, model - %s, number of passengers - %d, driver - %s, driver license - %s",
                id, mark, model, numberOfPassengers, Optional.ofNullable(driver), driverQualification);
    }
}
