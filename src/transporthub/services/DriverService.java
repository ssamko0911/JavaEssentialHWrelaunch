package transporthub.services;

import transporthub.models.Driver;
import transporthub.models.Transport;

import java.util.List;
import java.util.Optional;

public interface DriverService {
    Driver addDriver(Driver driver);

    Boolean removeDriver(int id);

    Optional<Driver> findDriverById(int id);

    List<Driver> findDriverByLastName(String lastName);

    List<Driver> findAllDrivers();

    List<Driver> findAllDriversOnRoute(int id);

    List<Transport> findTransportWithoutDrivers();

    Boolean assignDriverToTransport(int transportId, Driver driver); // (нельзя назначить если у водителя уровень квалификации прав не соответствует транспорту);
}
