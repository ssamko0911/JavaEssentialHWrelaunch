package hw007.task004.models;

public class Calculator {
    public static String add(double someValueOne, double someValueTwo) {
        return String.format("%.2f + %.2f = %.2f", someValueOne, someValueTwo, someValueOne + someValueTwo);
    }

    public static String sub(double someValueOne, double someValueTwo) {
        return String.format("%.2f - %.2f = %.2f", someValueOne, someValueTwo, someValueOne - someValueTwo);
    }

    public static String mul(double someValueOne, double someValueTwo) {
        return String.format("%.2f * %.2f = %.2f", someValueOne, someValueTwo, someValueOne * someValueTwo);
    }

    public static String div(double someValueOne, double someValueTwo) {
        try {
            if (someValueTwo == 0) {
                // т.к. double не реагирует на деление на нуль, то здесь вброс ошибки по условию;
                throw new ArithmeticException();
            } else {
                return String.format("%.2f / %.2f = %.2f", someValueOne, someValueTwo, someValueOne / someValueTwo);
            }
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
        }
        return "Division by zero is prohibited. Calculator has stopped.";
    }
}
