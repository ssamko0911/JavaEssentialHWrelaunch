package hw003.task003;

/*
Задание 3
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создать класс Vehicle.
В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
выпуска).
Создайте 3 производных класса Plane, Саг и Ship.
Для класса Plane должна быть определена высота и количество пассажиров.
Для класса Ship – количество пассажиров и порт приписки.
Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Car(20000, 185, 2011);
        Vehicle vehicleTwo = new Plane(300000.85, 547, 2018, 25, 400);
        Vehicle vehicleThree = new Ship(400000.55, 200, 2019, "UK", 800);
        System.out.println(vehicleOne);
        System.out.println(vehicleTwo);
        System.out.println(vehicleThree);
    }
}