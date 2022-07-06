package transporthub.models;

import java.util.Optional;

public class Tram extends Transport {
    private int numberOfWagons;

    public Tram(String mark, String model, int numberOfPassengers, int numberOfWagons) {
        super(mark, model, numberOfPassengers);
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
