package hw003.taskadditional001;

public class Printer {
    public static final String GREEN = "\u001B[32m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";

    void print(String value) {
        System.out.printf("%s", value);
    }
}