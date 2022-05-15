package hw002.task002;

/*
Задание 2
Используя Intelij IDEA создать проект, пакет.
Создать класс Машина с полями год(int), цвет(String).
Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами.
Создать класс Main в котором создать экземпляры вызывая разные конструкторы.
 */

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car(2011);
        Car carThree = new Car(2012, "Red");
        System.out.printf("\nObject data:\n1) year - %d;\n2) color - %s.", carOne.getYear(), carOne.getColor());
        System.out.printf("\nObject data:\n1) year - %d;\n2) color - %s.", carTwo.getYear(), carTwo.getColor());
        System.out.printf("\nObject data:\n1) year - %d;\n2) color - %s.", carThree.getYear(), carThree.getColor());
    }
}