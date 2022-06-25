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

import static transporthub.Main.runMainMenu;

public class RouteConsoleFacadeImpl implements ConsoleFacade {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    RouteRepo routeRepo = new RouteRepoImpl();
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
            //case 5 -> executeChoiceFive();
            case 0 -> runMainMenu();
            default -> runWrongChoiceRouteMenu();
        }
    }

    public static int startRouteMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose an option:\nPress 1 - Show all routes");
        System.out.println("Press 2 - Add new route");
        System.out.println("Press 3 - Cancel existing route");
        System.out.println("Press 4 - Show route by ID");
        System.out.println("Press 5 - Show all routes without transport");
        System.out.println("Press 0 - back to previous menu");
        choice = in.nextInt();
        return choice;
    }

    public void runWrongChoiceRouteMenu() throws IOException {
        while (true) {
            System.out.println("Wrong choice.Try one more time.");
            Main.drawLines();
            run();
        }
    }

    private void executeChoiceOne() throws IOException {
        if (ROUTE_SERVICE.findAllRoutes().isEmpty()) {
            System.out.println("System has no routes now.");
        } else {
            System.out.println(ROUTE_SERVICE.findAllRoutes());
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
        System.out.println("Please, enter departure point:");
        String startRoutePoint = in.readLine();
        System.out.println("Please, enter arrival point:");
        String endRoutePoint = in.readLine();
        return new Route(startRoutePoint, endRoutePoint);
    }

    private void executeChoiceThree() throws IOException {
        System.out.println("Please, enter route ID you would like to cancel:");
        int idToCancel = Integer.parseInt(in.readLine());
        if (ROUTE_SERVICE.removeRoute(idToCancel)) {
            System.out.println("Route with ID #" + idToCancel + " has cancelled.");
        } else {
            System.out.println("No routes with such ID has found.");
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFour() throws IOException {
        System.out.println("Please, enter route ID you would like to see:");
        int idToShow = Integer.parseInt(in.readLine());
        if (ROUTE_SERVICE.findRouteById(idToShow).equals(Optional.empty())) {
            System.out.println("System has no routes with such ID.");
        } else {
            System.out.println(ROUTE_SERVICE.findRouteById(idToShow));
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFive() {

    }
}
