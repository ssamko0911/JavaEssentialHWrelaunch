package hw008.taskadditional001;

import hw008.taskadditional001.models.Animal;

import java.util.ArrayList;
import java.util.List;

/*
Используя Intelij IDEA создать проект, пакет. Создать класс Animal с именем String, возрастом int,
хвостом Boolean. В классе переопределить метод toString, что бы вывод был следующим «Имя:
Васька, возраст: 45, хвост: нет». В классе Animal переопределить методы equals & hashCode.
 */
public class Main {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Dog", 2, false));
        animalList.add(new Animal("Cat", 3, true));
        animalList.add(new Animal("Cat", 3, true));
        animalList.add(new Animal("Lion", 6, true));

        for (Animal tempAnimal : animalList) {
            System.out.printf("\n%s", tempAnimal);
            System.out.printf("\nObject hashcode is %s", tempAnimal.hashCode());
            System.out.println();
        }

        for (int i = 0; i < animalList.size(); i++) {
            if (i != animalList.size() - 1) {
                System.out.printf("\nResult of equal method comparing object[%d] and object[%d] is %s.",
                        i, i + 1, animalList.get(i).equals(animalList.get(i + 1)));
            } else {
                System.out.printf("\nResult of equal method comparing object[%d] and object[%d] is %s.",
                        i, 0, animalList.get(i).equals(animalList.get(0)));
            }
        }
    }
}
