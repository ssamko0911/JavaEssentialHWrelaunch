package hw003.taskadditional001;

public class RedPrinter extends Printer {
    @Override
    void print(String value) {
        super.print(RED + value);
    }
}