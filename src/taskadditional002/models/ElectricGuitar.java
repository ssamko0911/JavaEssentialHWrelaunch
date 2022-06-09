package taskadditional002.models;

public class ElectricGuitar extends Guitar {
    private int power;

    public ElectricGuitar(long id, String type, int quantityOfStrings, int power) {
        super(id, type, quantityOfStrings);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    void doElectricGuitarActions() {
        System.out.println("Guitar sounds like this: guitar F chord!?!?!?!?");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", power - %d.", power);
    }
}
