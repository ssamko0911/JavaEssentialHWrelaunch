package hw008.task002;

import hw008.task002.models.Device;
import hw008.task002.models.EthernetAdapter;
import hw008.task002.models.Monitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
Задание 2
Создать классы:
1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
2) Сабкласс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
Добавить методы доступа. Конструктор.

Задание 3
Смотреть задание 2.
В обоих классах переопределить метод toString, что бы вывод был следующим:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024

Задание 4
Смотреть задание 2.
Переопределить методы equals & hashCode в каждом классе.
Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные
методы.
 */
public class Main {
    public static void main(String[] args) {
        List<Device> devices = new ArrayList<>();
        devices.add(new Device("DELL", 8000f, generateSerialNumber()));
        devices.add(new Monitor("SAMSUNG", 1000f, generateSerialNumber(), 1024, 768));
        devices.add(new Monitor("SAMSUNG", 1000f, devices.get(1).getSerialNumber(), 1024, 768));
        devices.add(new EthernetAdapter("TP LINK", 560f, generateSerialNumber(), 70, "AD:67:TR:TY"));
        for (Device tempDevice : devices) {
            System.out.printf("\n%s", tempDevice);
            System.out.printf("\nObject hashcode is %s", tempDevice.hashCode());
            System.out.println();
        }

        for (int i = 0; i < devices.size(); i++) {
            if (i != devices.size() - 1) {
                System.out.printf("\nResult of equal method comparing object[%d] and object[%d] is %s.",
                        i, i + 1, devices.get(i).equals(devices.get(i + 1)));
            } else {
                System.out.printf("\nResult of equal method comparing object[%d] and object[%d] is %s.",
                        i, 0, devices.get(i).equals(devices.get(0)));
            }
        }
    }

    public static String generateSerialNumber() {
        return new Random().nextInt(100000) + "-" + String.class.getModifiers();
    }
}
