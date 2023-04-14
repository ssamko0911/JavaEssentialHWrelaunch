package transporthub.models;

public class Tram extends Transport {
    private int numberOfWagons;

    public Tram(String mark, String model, int numberOfPassengers, DriverQualificationEnum driverQualification, int numberOfWagons) {
        super(mark, model, numberOfPassengers, driverQualification);
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
        return super.toString() + String.format(", number of wagons - %d.", numberOfWagons);
    }
}
