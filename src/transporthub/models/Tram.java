package transporthub.models;

public class Tram extends Transport {
    private int numberOfWagons;

    public Tram(long id, String mark, String model, int numberOfPassengers, Driver driver, Route route,
                DriverQualificationEnum driverQualification, int numberOfWagons) {
        super(id, mark, model, numberOfPassengers, driver, route, driverQualification);
        this.numberOfWagons = numberOfWagons;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public String toString() {
        return "Tram{" +
                "numberOfWagons=" + numberOfWagons +
                "} " + super.toString();
    }
}
