package hw003.taskadditional001;

public class BluePrinter extends Printer {
    @Override
    void print(String value) {
        super.print(BLUE + value);
    }
}