package taskadditional001.models;

public class Cat extends Animal {
    private String breed;

    public Cat() {

    }
    public Cat(String type, boolean isTale, double weight, int legsQuantity, String breed) {
        super(type, isTale, weight, legsQuantity);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void voice() {
        System.out.printf("%s: this is my MEOW - voice!\n", getClass().getSimpleName());
    }
}
