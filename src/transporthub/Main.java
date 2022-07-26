package transporthub;

import transporthub.ui.ConsoleFacade;
import transporthub.ui.impls.DriverConsoleFacadeImpl;
import transporthub.ui.impls.RouteConsoleFacadeImpl;
import transporthub.ui.impls.TransportConsoleFacadeImpl;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
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
        System.out.println("Wrong choice.Try one more time.");
        drawLines();
        runMainMenu();
    }

    public static void runMainMenu() {
        ConsoleFacade routeConsoleFacade = new RouteConsoleFacadeImpl();
        ConsoleFacade transportConsoleFacade = new TransportConsoleFacadeImpl();
        ConsoleFacade driverConsoleFacade = new DriverConsoleFacadeImpl();
        try {
            switch (startMainMenu()) {
                case 1 -> routeConsoleFacade.run();
                case 2 -> driverConsoleFacade.run();
                case 3 -> transportConsoleFacade.run();
                case 0 -> System.out.println("Thank you for using our Transport Station menu.");
                default -> runWrongChoiceMenu();
            }
        } catch (InputMismatchException | IOException exception) {
            System.err.println("Sorry, program has finished running.");
        }
    }

    public static <T> void printInfo(List<T> someArray) {
        for (T item : someArray) {
            System.out.println(item);
        }
    }
}
