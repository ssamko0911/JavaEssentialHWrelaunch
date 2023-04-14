package transporthub.services;

import transporthub.models.Route;
import transporthub.models.Transport;

import java.util.List;
import java.util.Optional;

public interface TransportService {
    Transport addTransport(Transport transport);

    Boolean removeTransport(int id); // (нельзя удалить если на транспорт назначен водитель);

    Optional<Transport> findTransportById(int id);

    List<Transport> findAllTransports();

    List<Transport> findAllTransportByMark(String mark);

    List<Transport> findTransportWithoutDrivers();

    Transport assignTransportOnRoute(int idTransport, Route route);

    Boolean takeTransportOfRoute(int id);
}
