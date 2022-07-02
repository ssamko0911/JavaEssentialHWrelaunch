package transporthub.models;

public class Route {
    private static int idCounter;
    private int id;
    private String startOfRoutePoint;
    private String endOfRoutePoint;

    public Route(String startOfRoutePoint, String endOfRoutePoint) {
        this.id = idCounter++;
        this.startOfRoutePoint = startOfRoutePoint;
        this.endOfRoutePoint = endOfRoutePoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartOfRoutePoint(String someNewStartPoint) {
        return startOfRoutePoint;
    }

    public void setStartOfRoutePoint(String startOfRoutePoint) {
        this.startOfRoutePoint = startOfRoutePoint;
    }

    public String getEndOfRoutePoint() {
        return endOfRoutePoint;
    }

    public void setEndOfRoutePoint(String endOfRoutePoint) {
        this.endOfRoutePoint = endOfRoutePoint;
    }

    @Override
    public String toString() {
        return String.format("Route: id - %d, startOfRoutePoint - %s, endOfRoutePoint - %s",
                id, startOfRoutePoint, endOfRoutePoint);
    }
}
