package taskadditional001.models;

public class Mouse extends Animal {

    public Mouse() {
    }

    public Mouse(String type, boolean isTale, double weight, int legsQuantity) {
        super(type, isTale, weight, legsQuantity);
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my PI-PI-PI voice!\n", getClass().getSimpleName());
    }
}
