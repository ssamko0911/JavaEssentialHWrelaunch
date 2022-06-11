package hw007.task001;

import hw007.task001.models.Animal;

/*
Задание 2
Создайте проект, используя IntelliJ IDEA.
Создайте перечислительный тип (enum) Animals, содержащий конструктор, который должен принимать
целочисленное значение (возраст животного), и содержать перегруженный метод toString(), который
должен возвращать название экземпляра и возраст животного.
 */
public class Main {
    public static void main(String[] args) {
        Animal animalOne = Animal.CAT;
        System.out.println(animalOne);
        Animal animalTwo = Animal.BADGER;
        System.out.println(animalTwo);
    }
}
