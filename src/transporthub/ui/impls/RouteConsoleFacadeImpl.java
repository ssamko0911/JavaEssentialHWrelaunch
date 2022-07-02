package transporthub.ui.impls;

import transporthub.Main;
import transporthub.models.Route;
import transporthub.repositiries.RouteRepo;
import transporthub.repositiries.impls.RouteRepoImpl;
import transporthub.services.RouteService;
import transporthub.services.impls.RouteServiceImpl;
import transporthub.ui.ConsoleFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Scanner;

import static transporthub.Main.printInfo;
import static transporthub.Main.runMainMenu;

public class RouteConsoleFacadeImpl implements ConsoleFacade {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    RouteRepo routeRepo = RouteRepoImpl.getInstance();
    RouteService routeService = new RouteServiceImpl(routeRepo);
    public final RouteService ROUTE_SERVICE;

    public RouteConsoleFacadeImpl() {
        ROUTE_SERVICE = this.routeService;
    }

    @Override
    public void run() throws IOException {
        System.out.println("You are in a Route control panel.");
        switch (startRouteMenu()) {
            case 1 -> executeChoiceOne();
            case 2 -> executeChoiceTwo();
            case 3 -> executeChoiceThree();
            case 4 -> executeChoiceFour();
            case 5 -> executeChoiceFive();
            case 0 -> runMainMenu();
            default -> runWrongChoiceRouteMenu();
        }
    }

    public static int startRouteMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 - Show all Routes");
        System.out.println("Press 2 - Add new Route");
        System.out.println("Press 3 - Cancel existing Route");
        System.out.println("Press 4 - Show Route by ID");
        System.out.println("Press 5 - Show all Routes without Transport");
        System.out.println("Press 0 - Back to previous menu");
        choice = in.nextInt();
        return choice;
    }

    public void runWrongChoiceRouteMenu() throws IOException {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Wrong choice. Try one more time.");
            Main.drawLines();
            run();
        }
    }

    private void executeChoiceOne() throws IOException {
        if (ROUTE_SERVICE.findAllRoutes().isEmpty()) {
            System.out.println("System has no Routes now.");
        } else {
            printInfo(ROUTE_SERVICE.findAllRoutes());
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceTwo() throws IOException {
        System.out.println(ROUTE_SERVICE.addRoute(createRoute()));
        Main.drawLines();
        run();
    }

    private Route createRoute() throws IOException {
        System.out.println("Please, enter departure point of the Route:");
        String startRoutePoint = in.readLine();
        System.out.println("Please, enter arrival point of the Route:");
        String endRoutePoint = in.readLine();
        return new Route(startRoutePoint, endRoutePoint);
    }

    private void executeChoiceThree() throws IOException {
        System.out.println("Please, enter Route ID you would like to cancel:");
        int idToCancel = Integer.parseInt(in.readLine());
        if (ROUTE_SERVICE.removeRoute(idToCancel)) {
            System.out.println("Route with ID #" + idToCancel + " has cancelled.");
        } else {
            System.out.println("No Routes with such ID has found.");
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFour() throws IOException {
        System.out.println("Please, enter Route ID you would like to find:");
        int idToShow = Integer.parseInt(in.readLine());
        if (ROUTE_SERVICE.findRouteById(idToShow).equals(Optional.empty())) {
            System.out.println("System has no Routes with such ID.");
        } else {
            System.out.println(ROUTE_SERVICE.findRouteById(idToShow).get());
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFive() throws IOException {
        if (ROUTE_SERVICE.findAllRoutesWithoutTransport().isEmpty()) {
            System.out.println("There are no Routes without Transport/no Routes at all in the system.");
        } else {
            System.out.println("List of Routes without Transport:");
            printInfo(ROUTE_SERVICE.findAllRoutesWithoutTransport());
        }
        Main.drawLines();
        run();
    }
}
