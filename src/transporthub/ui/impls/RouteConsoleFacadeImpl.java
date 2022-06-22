package transporthub.ui.impls;

import transporthub.models.Route;
import transporthub.services.RouteServiceInterface;
import transporthub.ui.ConsoleFacadeInterface;

public class RouteConsoleFacadeImpl implements ConsoleFacadeInterface {
    private static final String MAIN_MENU = "You are in a Route control panel.\nChoose an option:\n 1 - Show all routes\n" +
            "2 - Add new route\n3 - Delete existing route\n4 - Show route by ID\n5 - Show all routes without transport";

    public final RouteServiceInterface ROUTE_SERVICE;

    public RouteConsoleFacadeImpl(RouteServiceInterface route_service) {
        ROUTE_SERVICE = route_service;
    }


    @Override
    public void run() {
        executeChoiceTwo();
        executeChoiceTwo();
        executeChoiceOne();
    }

    private void executeChoiceOne() {
        System.out.println(ROUTE_SERVICE.findAllRoutes());
    }

    private void executeChoiceTwo() {
        System.out.println(ROUTE_SERVICE.addRoute(createRoute(0, "Start", "End")));
    }

    private Route createRoute(int id, String start, String end) {
        return new Route(id, start, end);
    }

}
