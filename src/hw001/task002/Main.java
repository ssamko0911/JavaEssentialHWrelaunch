package hw001.task002;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Input sizes of rectangle's length and width (after each digit press Enter)");
        Scanner in = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        rectangle.setSideOne(in.nextDouble());
        rectangle.setSideTwo(in.nextDouble());
        System.out.printf("The square of rectangle is %.2f.", rectangle.areaCalculator(rectangle.getSideOne(), rectangle.getSideTwo()));
        System.out.printf("\nThe perimeter of rectangle is %.2f.", rectangle.perimeterCalculator(rectangle.getSideOne(), rectangle.getSideTwo()));
        in.close();
    }
}