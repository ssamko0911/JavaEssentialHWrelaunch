package hw003.taskadditional001;

/*
Задание
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создайте класс Printer.
В теле класса создайте метод void print(String value), который выводит на экран значение аргумента.
Реализуйте возможность того, чтобы в случае наследования от данного класса других классов, и вызове
соответствующего метода их экземпляра, строки, переданные в качестве аргументов методов,
выводились разными цветами.
Обязательно используйте приведение типов.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose color for console output:\n0 - white,\n1 - green,\n2 - red,\n3 - blue.");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 0 -> {
                Printer printer = new Printer();
                printer.print("White output is chosen.");
            }
            case 1 -> {
                Printer greenPrinter = new GreenPrinter();
                greenPrinter.print("Green output is chosen.");
            }
            case 2 -> {
                Printer redPrinter = new RedPrinter();
                redPrinter.print("Red output is chosen.");
            }
            case 3 -> {
                Printer bluePrinter = new BluePrinter();
                bluePrinter.print("Blue output is chosen.");
            }
            default -> System.out.println("Wrong choice. Program has closed.");
        }
        in.close();
    }
}