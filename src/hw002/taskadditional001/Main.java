package hw002.taskadditional001;

import java.util.Scanner;
import static hw002.taskadditional001.MyArea.calculateSquare;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input radius of the circle to calculate it's square:");
        Scanner in = new Scanner(System.in);
        calculateSquare(in.nextDouble());
        in.close();
    }
}