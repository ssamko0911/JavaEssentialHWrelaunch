package taskadditional001.models;

public class Dog extends Cat {
    private double weight;

    public Dog() {
    }

    public Dog(String name, boolean isTail, double weight) {
        super(name, isTail);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my BARK - voice!\n", getClass().getSimpleName());
    }

    @Override
    public void voice(String message) {
        System.out.printf("%s said: %s!\n", getClass().getSimpleName(), message);
    }
}