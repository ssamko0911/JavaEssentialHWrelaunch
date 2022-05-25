package taskadditional001.models;

public class Dog extends Animal {
    public Dog() {
    }

    public Dog(String type, boolean isTale, double weight, int legsQuantity) {
        super(type, isTale, weight, legsQuantity);
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my BARK - voice!\n", getClass().getSimpleName());
    }
}
