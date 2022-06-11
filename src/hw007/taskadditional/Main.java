package hw007.taskadditional;

import hw007.taskadditional.models.Vehicles;

/*
Задание
Создайте проект, используя IntelliJ IDEA.
Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать
целочисленное значение (стоимость автомобиля), содержать метод getColor(), который возвращает
строку с цветом автомобиля, и содержать перегруженный метод toString(), который должен возвращать
строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public class Main {
    public static void main(String[] args) {
        Vehicles vehicleOne = Vehicles.CAR;
        System.out.printf("Color of this car is %s.", vehicleOne.getColor());
        System.out.println(vehicleOne);
        Vehicles vehicleTwo = Vehicles.TRUCK;
        System.out.printf("Color of this car is %s.", vehicleTwo.getColor());
        System.out.println(vehicleTwo);
    }
}
