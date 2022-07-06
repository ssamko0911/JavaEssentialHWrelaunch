package transporthub.models;

import java.util.Optional;

/*
	Transport (id, марка, модель, вместимость пассажиров, водитель(Driver),
 маршрут (Route), уровень квалификации для управления ТС (DriverQualificationEnum )),
 НЕ ясно зачем дублировать уровень квалификации водителя).
 */
public abstract class Transport {
    private static int idCounter;
    private int id;
    private String mark;
    private String model;
    private int numberOfPassengers;
    private Optional<Driver> driver;
    private Route route;
    private DriverQualificationEnum driverQualification;

    public Transport(String mark, String model, int numberOfPassengers) {
        this.id = idCounter++;
        this.mark = mark;
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
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
        return driver;
    }

    public void setDriver(Optional<Driver> driver) {
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
