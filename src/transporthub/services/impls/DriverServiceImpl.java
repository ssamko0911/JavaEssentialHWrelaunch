package transporthub.services.impls;

import transporthub.models.Driver;
import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.DriverRepo;
import transporthub.services.DriverService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DriverServiceImpl implements DriverService {
    public final DriverRepo driverRepoImpl;

    public DriverServiceImpl(DriverRepo driverRepo) {
        this.driverRepoImpl = driverRepo;
    }

    @Override
    public Driver addDriver(Driver driver) {
        return driverRepoImpl.add(driver);
    }

    @Override
    public Boolean removeDriver(Driver driver) {
        return driverRepoImpl.delete(driver);
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
