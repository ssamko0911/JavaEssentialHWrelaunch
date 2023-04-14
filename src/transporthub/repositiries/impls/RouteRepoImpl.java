package transporthub.repositiries.impls;

import transporthub.models.Route;
import transporthub.repositiries.RouteRepo;

import java.util.ArrayList;
import java.util.List;

public class RouteRepoImpl implements RouteRepo {
    private static RouteRepoImpl instance;
    private final List<Route> routes;

    private RouteRepoImpl() {
        this.routes = new ArrayList<>();
    }

    public static RouteRepoImpl getInstance() {
        if (instance == null) {
            instance = new RouteRepoImpl();
        }
        return instance;
    }

    @Override
    public Route add(Route route) {
        routes.add(route);
        return route;
    }

    @Override
    public Route getById(int id) {
        return routes.get(id);
    }

    @Override
    public List<Route> getAll() {
        return routes;
    }

    @Override
    public Boolean delete(Route route) {
        return routes.remove(route);
    }
}
