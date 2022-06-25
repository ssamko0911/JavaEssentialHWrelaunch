package transporthub.services;

import transporthub.models.Driver;
import transporthub.models.Route;
import transporthub.models.Transport;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    Driver addDriver(Driver driver);
    Boolean removeDriver(Driver driver);
    Optional<Driver> findDriverById(int id);
    Optional<Driver> findDriverByLastName(String lastName);
    List<Driver> findAllDrivers();
    List<Driver> findAllDriversOnRoute(Route route);
    List<Transport> findTransportWithoutDrivers();
    Boolean assignDriverToTransport(Transport transport);

}
