package hw002.task003;

/*
Задание 3
Используя Intelij IDEA создать проект, пакет.
(Заново!) Создать класс Машина с полями год(int), скорость(double), вес(int) цвет(String).
Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
Перегрузить конструкторы.
Создать класс Main, в котором создать экземпляры класса Машина с разными параметрами.
 */

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car();
        Car carTwo = new Car(2021);
        Car carThree = new Car(2019, "Blue");
        Car carFour = new Car(2018, "Green", 210.00);
        Car carFive = new Car(2016, "Ocean blue", 200.00, 1500);
        printObjectData(carOne);
        printObjectData(carTwo);
        printObjectData(carThree);
        printObjectData(carFour);
        printObjectData(carFive);
    }

    public static void printObjectData(Car someCar) {
        System.out.printf("\nObject data:\n1) year - %d;\n2) color - %s;\n3) speed - %.2f;\n4) weight - %d.",
                someCar.getYear(), someCar.getColor(), someCar.getSpeed(), someCar.getWeight());
    }
}