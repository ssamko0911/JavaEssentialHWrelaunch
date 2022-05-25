package hw003.taskadditional001;

public class GreenPrinter extends Printer {
    @Override
    void print(String value) {
        super.print(GREEN + value);
    }
}