package hw006.taskadditional001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator program has started. Input first value:");
        Scanner in = new Scanner(System.in);
        double valueOne = in.nextDouble();
        System.out.println("Input second value:");
        double valueTwo = in.nextDouble();
        System.out.println("Math operation sign (+, -, * , / allowed):");
        String mathSign = new Scanner(System.in).nextLine();
        switch (mathSign) {
            case "+" -> System.out.printf("%.2f plus %.2f is %.2f", valueOne, valueTwo,Calculator.calculateSum(valueOne, valueTwo));
            case "-" -> System.out.printf("%.2f take away from %.2f is %.2f", valueOne, valueTwo, Calculator.calculateSub(valueOne, valueTwo));
            case "*" -> System.out.printf("%.2f multiplied by %.2f is %.2f", valueOne, valueTwo, Calculator.calculateMultiply(valueOne, valueTwo));
            case "/" -> System.out.printf("%.2f divided by %.2f is %.2f", valueOne, valueTwo, Calculator.calculateDiv(valueOne, valueTwo));
            default -> System.err.println("Error, undetectable sign. Program has stopped.");
        }
        in.close();
    }
}
