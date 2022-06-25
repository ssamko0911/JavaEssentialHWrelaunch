package transporthub;

import transporthub.ui.impls.RouteConsoleFacadeImpl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        runMainMenu();
    }

    public static int startMainMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("You are in a main Transport station menu");
        System.out.println("Press 1 for Route Menu");
        System.out.println("Press 2 for Driver Menu");
        System.out.println("Press 3 for Transport Menu");
        System.out.println("Press 0 to leave menu");
        choice = in.nextInt();
        return choice;
    }

    public static void drawLines() {
        System.out.println("-".repeat(50));
    }

    public static void runWrongChoiceMenu() {
        while (startMainMenu() < 0 || startMainMenu() > 3) {
            System.out.println("Wrong choice.Try one more time.");
            drawLines();
            runMainMenu();
        }
    }

    public static void runMainMenu() {
        try {
            switch (startMainMenu()) {
                case 1 -> new RouteConsoleFacadeImpl().run();
                case 2 -> System.out.println("You're in a Transport Menu. Make your choice:");
                case 3 -> System.out.println("You're in a Driver Menu. Make your choice:");
                case 0 -> System.out.println("Thank you for using our Transport Station menu.");
                default -> runWrongChoiceMenu();
            }
        } catch (InputMismatchException | IOException exception) {
            System.err.println("Sorry, program has finished running.");
        }
    }
}
