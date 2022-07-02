package transporthub.services.impls;

import transporthub.models.Route;
import transporthub.models.Transport;
import transporthub.repositiries.TransportRepo;
import transporthub.services.TransportService;

import java.util.ArrayList;
import java.util.List;

public class TransportServiceImpl implements TransportService {
    private final TransportRepo transportRepoImpl;

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
                if (item.getDriver() != null) { // так не годится
                    return transportRepoImpl.delete(item);
                }
            }
        }
        return false;
    }

    @Override
    public Transport findTransportById(int id) {
        List<Transport> allTransports = transportRepoImpl.getAll();
        for (Transport item : allTransports) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
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
