package transporthub.services.impls;

import transporthub.models.Driver;
import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.DriverRepo;
import transporthub.repositiries.impls.RouteRepoImpl;
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
                return Optional.ofNullable(item);
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
        List<Transport> temporaryTransportList = new ArrayList<>();// дописать направление транспорта

        return null;
    }

    @Override
    public Boolean assignDriverToTransport(Transport transport) {
        return null;
    }
}
