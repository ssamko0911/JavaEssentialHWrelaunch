package hw006.taskadditional001;

public class Calculator {
    public static double calculateSum(double someValueOne, double someValueTwo) {
        return someValueOne + someValueTwo;
    }

    public static double calculateSub(double someValueOne, double someValueTwo) {
        return someValueOne - someValueTwo;
    }

    public static double calculateMultiply(double someValueOne, double someValueTwo) {
        return someValueOne * someValueTwo;
    }

    public static double calculateDiv(double someValueOne, double someValueTwo) {
        // тип данных дабл принимает деление на нуль, поэтому не проводил проверку.
        return someValueOne / someValueTwo;
    }
}
