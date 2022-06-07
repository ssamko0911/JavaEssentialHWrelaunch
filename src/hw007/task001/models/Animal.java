package hw007.task001.models;

public enum Animal {
    CAT(2),
    DOG(3),
    BULL(5),
    BADGER(1),
    LION(3);

    private int animalAge;

    Animal(int animalAge) {
        this.animalAge = animalAge;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return String.format("\nAnimal %s age is %d.", this.name(), animalAge);
    }
}
