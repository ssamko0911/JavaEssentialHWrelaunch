package hw006;

/*
Задание 2
Создайте проект, используя IntelliJ IDEA.
Требуется:
Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicleOne = new Vehicle("Ferrari F50", "car");
        Vehicle.Wheel wheelOne = new Vehicle.Wheel(17);
        Vehicle.Door doorOne = new Vehicle.Door(45);
        vehicleOne.print();
        wheelOne.print();
        doorOne.print();
        Vehicle vehicleTwo = new Vehicle("Opel Astra", "car");
        Vehicle.Wheel wheelTwo = new Vehicle.Wheel(16);
        Vehicle.Door doorTwo = new Vehicle.Door(19);
        vehicleTwo.print();
        wheelTwo.print();
        doorTwo.print();
    }
}
