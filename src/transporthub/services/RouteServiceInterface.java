package transporthub.services;

import transporthub.models.Route;
import java.util.List;
import java.util.Optional;

public interface RouteServiceInterface {
    Route addRoute(Route route);
    Boolean removeRoute(Route route);
    Optional<Route> findRouteById(int someId);
    List<Route> findAllRoutes();
    List<Route> findAllRoutesWithoutTransport();
}
