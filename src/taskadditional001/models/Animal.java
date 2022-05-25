package taskadditional001.models;

public class Animal {

    private String type;
    private boolean isTale;
    private double weight;
    private int legsQuantity;

    public Animal() {
    }

    public Animal(String type, boolean isTale, double weight, int legsQuantity) {
        this.type = type;
        this.isTale = isTale;
        this.weight = weight;
        this.legsQuantity = legsQuantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isTale() {
        return isTale;
    }

    public void setTale(boolean tale) {
        isTale = tale;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLegsQuantity() {
        return legsQuantity;
    }

    public void setLegsQuantity(int legsQuantity) {
        this.legsQuantity = legsQuantity;
    }

    public void voice() {
        System.out.printf("%s: this is my voice!\n", getClass().getSimpleName());
    }

    public void voice(String message) {
        System.out.printf("%s said: %s!\n", getClass().getSimpleName(), message);
    }
}
