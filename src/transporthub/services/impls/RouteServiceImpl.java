package transporthub.services.impls;

import transporthub.models.Route;
import transporthub.repositiries.RouteRepo;
import transporthub.services.RouteService;

import java.util.List;
import java.util.Optional;

public class RouteServiceImpl implements RouteService {
    private final RouteRepo routeRepoImpl;

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
    public Optional<Route> findRouteById(int someId) {
        List<Route> allRoutes = routeRepoImpl.getAll();
        for (Route item : allRoutes) {
            if (item.getId() == someId) {
                return Optional.ofNullable(allRoutes.get(someId));
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
        return null;
    }
}
