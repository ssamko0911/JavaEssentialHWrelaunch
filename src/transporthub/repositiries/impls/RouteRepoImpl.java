package transporthub.repositiries.impls;

import transporthub.models.Route;
import transporthub.repositiries.RouteRepoInterface;

import java.util.ArrayList;
import java.util.List;

public class RouteRepoImpl implements RouteRepoInterface {
    private final List<Route> routes;

    public RouteRepoImpl() {
        this.routes = new ArrayList<>();
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
