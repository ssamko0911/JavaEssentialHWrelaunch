package transporthub.repositiries.impls;

import transporthub.models.Driver;
import transporthub.repositiries.DriverRepoInterface;

import java.util.ArrayList;
import java.util.List;

public class DriverRepoImpl implements DriverRepoInterface {
    private final List<Driver> drivers;

    public DriverRepoImpl() {
        this.drivers = new ArrayList<>();
    }

    @Override
    public Driver add(Driver driver) {
        drivers.add(driver);
        return getById(driver.getId());
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
