package taskadditional004.models;

import taskadditional004.exceptions.PizzaNotFoundException;

public enum PizzaSize {
    SMALL("Small", 30),
    MEDIUM("Medium", 40),
    LARGE("Large", 50);

    private final String sizeName;
    private final int size;

    PizzaSize(String sizeName, int size) {
        this.sizeName = sizeName;
        this.size = size;
    }

    public String getSizeName() {
        return sizeName;
    }

    public int getSize() {
        return size;
    }

    public static PizzaSize getPizzaSizeByName(int size) throws PizzaNotFoundException {
        for (int i = 0; i < PizzaSize.values().length - 1; i++) {
            if ((i == PizzaSize.values().length - 1) && (size <= PizzaSize.values()[i].size)) {
                return PizzaSize.values()[i];
            }

            if (size >= PizzaSize.values()[i].size && size <= PizzaSize.values()[i + 1].size) {
                return PizzaSize.values()[i];
            }

            if (size == PizzaSize.LARGE.getSize()) {
                return PizzaSize.LARGE;
            }
        }
        throw new PizzaNotFoundException("Sorry, such pizza isn't present at menu.");
    }
}
