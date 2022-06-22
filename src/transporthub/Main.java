package transporthub;

import transporthub.models.Driver;
import transporthub.models.DriverQualificationEnum;
import transporthub.models.Route;
import transporthub.repositiries.DriverRepoInterface;
import transporthub.repositiries.RouteRepoInterface;
import transporthub.repositiries.impls.DriverRepoImpl;
import transporthub.repositiries.impls.RouteRepoImpl;
import transporthub.services.DriverServiceInterface;
import transporthub.services.RouteServiceInterface;
import transporthub.services.impls.DriverServiceImpl;
import transporthub.services.impls.RouteServiceImpl;
import transporthub.ui.impls.RouteConsoleFacadeImpl;

public class Main {
    public static void main(String[] args) {
//        Route routeOne = new Route(0, "Kyiv", "Krakov");
//        Route routeTwo = new Route(1, "Lvov", "Krakov");
//        Route routeThree = new Route(2, "Dnipro", "Barcelona");
//        Route routeFour = new Route(3, "Paris", "Lisbon");
//        Route routeFive = new Route(4, "London", "Glasgow");
//        Driver driverOne = new Driver(0, "John", "Doe", "0991235678", DriverQualificationEnum.BUS_DRIVING_LICENCE);
//        Driver driverTwo = new Driver(1, "Mary", "Swan", "0991236777", DriverQualificationEnum.BUS_DRIVING_LICENCE);
//        Driver driverThree = new Driver(2, "John", "Doe", "0991235678", DriverQualificationEnum.MULTI_DRIVING_LICENCE);
//
//        DriverRepoInterface driverRepoInterface = new DriverRepoImpl();
//        DriverServiceInterface driverServiceInterface = new DriverServiceImpl(driverRepoInterface);
//        driverServiceInterface.addDriver(driverOne);
//        driverServiceInterface.addDriver(driverTwo);
//        System.out.println(driverServiceInterface.findAllDrivers());
//        System.out.println(driverServiceInterface.findDriverById(1));
//
//
//        RouteRepoInterface routeRepoInterface = new RouteRepoImpl();
//        RouteServiceInterface routeServiceInterface = new RouteServiceImpl(routeRepoInterface);
//        routeServiceInterface.addRoute(routeOne);
//        routeServiceInterface.addRoute(routeTwo);
//
//        System.out.println(routeServiceInterface.findAllRoutes());
//        System.out.println(routeServiceInterface.findRouteById(1));

        RouteRepoInterface routeRepoInterface = new RouteRepoImpl();
        RouteServiceInterface routeServiceInterface = new RouteServiceImpl(routeRepoInterface);
        RouteConsoleFacadeImpl routeConsoleFacade = new RouteConsoleFacadeImpl(routeServiceInterface);
        routeConsoleFacade.run();
    }
}
