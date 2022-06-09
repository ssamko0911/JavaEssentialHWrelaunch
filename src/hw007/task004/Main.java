package hw007.task004;

import hw007.task004.models.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Задание 5

Создайте проект, используя IntelliJ IDEA.
Создайте класс Calculator. В теле класса создайте четыре метода для арифметических действий:
(add – сложение, sub – вычитание, mul – умножение, div – деление).
Метод деления должен делать проверку деления на ноль, если проверка не проходит, сгенерировать исключение.
Пользователь вводит значения, над которыми хочет произвести операцию и выбрать саму операцию.
При возникновении ошибок должны выбрасываться исключения.
 */
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double valueOne;
        double valueTwo;
        try {
            valueOne = getValue();
            valueTwo = getValue();
            switch (getMathSign()) {
                case "+" -> System.out.println(Calculator.add(valueOne, valueTwo));
                case "-" -> System.out.println(Calculator.sub(valueOne, valueTwo));
                case "*" -> System.out.println(Calculator.mul(valueOne, valueTwo));
                case "/" -> System.out.println(Calculator.div(valueOne, valueTwo));
                default -> System.out.println("Oops, something went wrong.");
            }
        } catch (InputMismatchException exception) {
            exception.printStackTrace();
            System.err.println("Incorrect data. Calculator has stopped.");
        }
    }

    public static double getValue() {
        System.out.println("Input value:");
        return in.nextDouble();
    }

    public static String getMathSign() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input math operation sign (+, -, * , /):");
        return in.nextLine();
    }
}
