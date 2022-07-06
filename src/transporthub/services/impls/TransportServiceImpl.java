package transporthub.services.impls;

import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.TransportRepo;
import transporthub.repositiries.impls.TransportRepoImpl;
import transporthub.services.TransportService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransportServiceImpl implements TransportService {
    private final TransportRepo transportRepoImpl;
    private static TransportServiceImpl instance;

    public static TransportServiceImpl getInstance() {
        if (instance == null) {
            instance = new TransportServiceImpl(TransportRepoImpl.getInstance());
        }
        return instance;
    }

    public TransportServiceImpl(TransportRepo transportRepoImpl) {
        this.transportRepoImpl = transportRepoImpl;
    }

    @Override
    public Transport addTransport(Transport transport) {
        return transportRepoImpl.add(transport);
    }

    @Override
    public Boolean removeTransport(int id) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        for (Transport item : allTransports) {
            if (item.getId() == id) {
                if (item.getDriver().isPresent()) {
                    return transportRepoImpl.delete(item);
                }
            }
        }
        return false;
    }

    @Override
    public Optional<Transport> findTransportById(int id) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        for (Transport item : allTransports) {
            if (item.getId() == id) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Transport> findAllTransports() {
        return transportRepoImpl.getAll();
    }

    @Override
    public List<Transport> findAllTransportByMark(String mark) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        List<Transport> result = new ArrayList<>();
        for (Transport item : allTransports) {
            if (item.getMark().equals(mark)) {
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public List<Transport> findTransportWithoutDrivers() {
        List<Transport> transportListWithoutDrivers = new ArrayList<>();
        for (Transport item : transportRepoImpl.getAll()) {
            if (item.getDriver().isEmpty()) {
                transportListWithoutDrivers.add(item);
            }
        }
        return transportListWithoutDrivers;
    }

    @Override
    public Transport assignTransportOnRoute(int idTransport, Route route) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        for (Transport item : allTransports) {
            if (item.getId() == idTransport) {
                item.setRoute(route);
                return item;
            }
        }
        return null;
    }

    @Override
    public Boolean takeTransportOfRoute(int id) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        for (Transport item : allTransports) {
            if (item.getId() == id) {
                item.setRoute(null);
            }
        }
        return false;
    }
}
