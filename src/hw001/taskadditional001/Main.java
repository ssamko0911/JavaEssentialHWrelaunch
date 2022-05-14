package hw001.taskadditional001;
/*
Задание
Используя IDEA, создайте проект c пакетом.
Требуется: Создать класс с именем Address. В теле класса требуется создать поля: index, country, city,
street, house, apartment.
Для каждого поля, создать метод с двумя методами доступа (get, set)
Создать экземпляр класса Address.
В поля экземпляра записать информацию о почтовом адресе.
Выведите на экран значения полей, описывающих адрес.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give data about your full address. Input index:");
        Address address = new Address();
        address.setIndex(in.nextLine());
        System.out.println("Input country:");
        address.setCountry(in.nextLine());
        System.out.println("Input city:");
        address.setCity(in.nextLine());
        System.out.println("Input street:");
        address.setStreet(in.nextLine());
        System.out.println("Input house:");
        address.setHouse(in.nextLine());
        System.out.println("Input apartment:");
        address.setApartment(in.nextLine());
        System.out.printf("The full address is:\n1) index: %s;\n2) country: %s;\n3) city: %s;\n4) street: %s;\n5) house: %s;\n6) apartment: %s.",
                address.getIndex(), address.getCountry(), address.getCity(), address.getStreet(), address.getHouse(),
                address.getApartment());
    }
}