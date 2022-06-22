package transporthub.models;
/*
	Transport (id, марка, модель, вместимость пассажиров, водитель(Driver),
 маршрут (Route), уровень квалификации для управления ТС (DriverQualificationEnum )),
 НЕ ясно зачем дублировать уровень квалификации водителя).
 */
public abstract class Transport {
    private long id;
    private String mark;
    private String model;
    private int numberOfPassengers;
    private Driver driver;
    private Route route;
    private DriverQualificationEnum driverQualification;

    public Transport(long id, String mark, String model, int numberOfPassengers, Driver driver, Route route, DriverQualificationEnum driverQualification) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.numberOfPassengers = numberOfPassengers;
        this.driver = driver;
        this.route = route;
        this.driverQualification = driverQualification;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Driver getDriver() {
        return driver;
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
        return "Transport{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", numberOfPassengers=" + numberOfPassengers +
                ", driver=" + driver +
                ", route=" + route +
                ", driverQualification=" + driverQualification +
                '}';
    }
}
