package transporthub.services.impls;

import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.RouteRepo;
import transporthub.repositiries.impls.RouteRepoImpl;
import transporthub.services.RouteService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class RouteServiceImpl implements RouteService {
    private final RouteRepo routeRepoImpl;
    private static RouteServiceImpl instance;

    public static RouteServiceImpl getInstance() {
        if (instance == null) {
            instance = new RouteServiceImpl(RouteRepoImpl.getInstance());
        }
        return instance;
    }

    public RouteServiceImpl(RouteRepo routeRepoImpl) {
        this.routeRepoImpl = routeRepoImpl;
    }

    @Override
    public Route addRoute(Route route) {
        return routeRepoImpl.add(route);
    }

    @Override
    public Boolean removeRoute(int someId) {
        List<Route> allRoutes = routeRepoImpl.getAll();
        for (Route item : allRoutes) {
            if (item.getId() == someId) {
                return routeRepoImpl.delete(item);
            }
        }
        return false;
    }

    @Override
    public Optional<Route> findRouteById(int id) {
        List<Route> allRoutes = routeRepoImpl.getAll();
        for (Route item : allRoutes) {
            if (item.getId() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Route> findAllRoutes() {
        return routeRepoImpl.getAll();
    }

    @Override
    public List<Route> findAllRoutesWithoutTransport() {
        List<Transport> transportListWithRoutes = new ArrayList<>();
        for (Transport item : TransportServiceImpl.getInstance().findAllTransports()) {
            if (item.getRoute() != null) {
                transportListWithRoutes.add(item);
            }
        }
        List<Route> routesResult = new ArrayList<>();
        for (Transport transportListWithRoute : transportListWithRoutes) {
            routesResult.add(transportListWithRoute.getRoute());
        }
        List<Route> routesWithoutTransport = new ArrayList<>(RouteServiceImpl.instance.findAllRoutes());
        routesWithoutTransport.removeAll(routesResult);
        return routesWithoutTransport;
    }
}
