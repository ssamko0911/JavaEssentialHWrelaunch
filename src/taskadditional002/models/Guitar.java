package taskadditional002.models;

public class Guitar extends Instrument {
    private int quantityOfStrings;

    public Guitar(long id, String type, int quantityOfStrings) {
        super(id, type);
        this.quantityOfStrings = quantityOfStrings;
    }

    public int getQuantityOfStrings() {
        return quantityOfStrings;
    }

    public void setQuantityOfStrings(int quantityOfStrings) {
        this.quantityOfStrings = quantityOfStrings;
    }

    public static void doGuitarActions() {
        System.out.println("Guitar sounds like this: guitar G chord!");
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", quantityOfStrings - %d", quantityOfStrings);
    }
}
