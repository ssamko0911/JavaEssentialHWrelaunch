package transporthub.services.impls;

import transporthub.models.Driver;
import transporthub.models.DriverQualificationEnum;
import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.DriverRepo;
import transporthub.repositiries.impls.TransportRepoImpl;
import transporthub.services.DriverService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverServiceImpl implements DriverService {

    private final DriverRepo driverRepoImpl;

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
                return Optional.ofNullable(allDrivers.get(id));
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Driver> findDriverByLastName(String lastName) {
        List<Driver> allDrivers = driverRepoImpl.getAll();
        for (Driver item : allDrivers) {
            if (item.getLastName().equals(lastName)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Driver> findAllDrivers() {
        return driverRepoImpl.getAll();
    }

    @Override
    public List<Driver> findAllDriversOnRoute(Route route) {
        return null;
    }

    @Override
    public List<Transport> findTransportWithoutDrivers() {
        List<Transport> transportListWithDrivers = new ArrayList<>();
        for (Transport item : TransportRepoImpl.getInstance().getAll()) {
            if (item.getDriver().isPresent()) {
                transportListWithDrivers.add(item);
            }
        }

        List<Transport> transportListWithoutTransport = new ArrayList<>(TransportRepoImpl.getInstance().getAll());
        transportListWithDrivers.removeAll(transportListWithDrivers);
        return transportListWithDrivers;
    }

    @Override
    public Boolean assignDriverToTransport(int transportID, Driver driver) {
        List<Transport> allTransports = TransportRepoImpl.getInstance().getAll();
        for (Transport item : allTransports) {
            if (item.getId() == transportID
                    & (item.getDriverQualification().equals(driver.getDriverQualificationEnum())
                    || item.getDriverQualification().equals(DriverQualificationEnum.MULTI_DRIVING_LICENCE))) {
                item.setDriver(Optional.of(driver));
                return true;
            }
        }
        return false;
    }

}
