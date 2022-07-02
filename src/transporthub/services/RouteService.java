package transporthub.services;

import transporthub.models.Route;
import transporthub.repositiries.TransportRepo;

import java.util.List;
import java.util.Optional;

public interface RouteService {
    Route addRoute(Route route);
    Boolean removeRoute(int id);
    Optional<Route> findRouteById(int someId);
    List<Route> findAllRoutes();
    List<Route> findAllRoutesWithoutTransport();
}
