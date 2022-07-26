package transporthub.services.impls;

import transporthub.models.Driver;
import transporthub.models.DriverQualificationEnum;
import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.DriverRepo;
import transporthub.repositiries.impls.DriverRepoImpl;
import transporthub.services.DriverService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverServiceImpl implements DriverService {
    private static DriverServiceImpl instance;
    private final DriverRepo driverRepoImpl;

    public static DriverServiceImpl getInstance() {
        if (instance == null) {
            instance = new DriverServiceImpl(DriverRepoImpl.getInstance());
        }
        return instance;
    }

    public DriverServiceImpl(DriverRepo driverRepo) {
        this.driverRepoImpl = driverRepo;
    }

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepoImpl.add(driver);
    }

    @Override
    public Boolean removeDriver(int id) {
        List<Driver> allDrivers = driverRepoImpl.getAll();
        for (Driver item : allDrivers) {
            if (item.getId() == id) {
                return driverRepoImpl.delete(item);
            }
        }
        return false;
    }

    @Override
    public Optional<Driver> findDriverById(int id) {
        List<Driver> allDrivers = driverRepoImpl.getAll();
        for (Driver item : allDrivers) {
            if (item.getId() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Driver> findDriverByLastName(String lastName) {
        List<Driver> allDrivers = driverRepoImpl.getAll();
        List<Driver> driversLastNameList = new ArrayList<>();
        for (Driver item : allDrivers) {
            if (item.getLastName().equals(lastName)) {
                driversLastNameList.add(item);
            }
        }
        return driversLastNameList;
    }

    @Override
    public List<Driver> findAllDrivers() {
        return driverRepoImpl.getAll();
    }

    @Override
    public List<Driver> findAllDriversOnRoute(int id) {
        List<Driver> driversOnRoute = new ArrayList<>();
        Optional<Route> route = RouteServiceImpl.getInstance().findRouteById(id);
            for (Transport item : TransportServiceImpl.getInstance().findAllTransports()) {
                if (item.getRoute().equals(route.get()) && item.getDriver().isPresent()){
                   driversOnRoute.add(item.getDriver().get());
                }
            }
        return driversOnRoute;
    }

    @Override
    public List<Transport> findTransportWithoutDrivers() {
        List<Transport> transportListWithDrivers = new ArrayList<>();
        for (Transport item : TransportServiceImpl.getInstance().findAllTransports()) {
            if (item.getDriver().isPresent()) {
                transportListWithDrivers.add(item);
            }
        }
        List<Transport> transportListWithoutDrivers = new ArrayList<>(TransportServiceImpl.getInstance().findAllTransports());
        transportListWithoutDrivers.removeAll(transportListWithDrivers);
        return transportListWithoutDrivers;
    }

    @Override
    public Boolean assignDriverToTransport(int transportID, Driver driver) {
        List<Transport> allTransports = TransportServiceImpl.getInstance().findAllTransports();
        for (Transport item : allTransports) {
            if (item.getId() == transportID
                    & (item.getDriverQualification().equals(driver.getDriverQualificationEnum())
                    || item.getDriverQualification().equals(DriverQualificationEnum.MULTI_DRIVING_LICENCE))) {
                item.setDriver(driver);
                return true;
            }
        }
        return false;
    }

}
