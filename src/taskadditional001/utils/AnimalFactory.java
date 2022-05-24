package taskadditional001.utils;

import taskadditional001.models.Animal;
import taskadditional001.models.Cat;
import taskadditional001.models.Dog;
import taskadditional001.models.Mouse;

public class AnimalFactory {
    public Animal createAnimal (int creationAnimalItem) {
        return switch (creationAnimalItem) {
            case 1 -> new Cat();
            case 2 -> new Dog();
            case 3 -> new Mouse();
            default -> new Animal();
        };
    }
}