package transporthub.repositiries.impls;

import transporthub.models.Driver;
import transporthub.repositiries.DriverRepo;

import java.util.ArrayList;
import java.util.List;

public class DriverRepoImpl implements DriverRepo {
    private static DriverRepoImpl instance;
    private final List<Driver> drivers;

    public static DriverRepoImpl getInstance() {
        if (instance == null) {
            instance = new DriverRepoImpl();
        }
        return instance;
    }

    public DriverRepoImpl() {
        this.drivers = new ArrayList<>();
    }

    @Override
    public Driver add(Driver driver) {
        drivers.add(driver);
        return driver;
    }

    @Override
    public Driver getById(int id) {
        return drivers.get(id);
    }

    @Override
    public List<Driver> getAll() {
        return drivers;
    }

    @Override
    public Boolean delete(Driver driver) {
        return drivers.remove(driver);
    }
}
