package taskadditional001.models;

public class Animal {

    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.printf("%s: this is my voice!\n", getClass().getSimpleName());
    }

    public void voice(String message) {
        System.out.printf("%s said: %s!\n", getClass().getSimpleName(), message);
    }
}