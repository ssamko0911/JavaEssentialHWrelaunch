package taskadditional001.models;

public class Mouse extends Dog {
    private String color;

    public Mouse() {
    }

    public Mouse(String name, boolean isTail, double weight, String color) {
        super(name, isTail, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my PI-PI-PI voice!\n", getClass().getSimpleName());
    }

    @Override
    public void voice(String message) {
        System.out.printf("%s said: %s!\n", getClass().getSimpleName(), message);
    }
}