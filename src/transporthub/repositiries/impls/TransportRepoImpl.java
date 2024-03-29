package transporthub.repositiries.impls;

import transporthub.models.Transport;
import transporthub.repositiries.TransportRepo;

import java.util.ArrayList;
import java.util.List;

public class TransportRepoImpl implements TransportRepo {
    private static TransportRepoImpl instance;
    private final List<Transport> transports;

    public static TransportRepoImpl getInstance() {
        if (instance == null) {
            instance = new TransportRepoImpl();
        }
        return instance;
    }

    public TransportRepoImpl() {
        this.transports = new ArrayList<>();
    }

    @Override
    public Transport add(Transport transport) {
        transports.add(transport);
        return transport;
    }

    @Override
    public Transport getById(int id) {
        return transports.get(id);
    }

    @Override
    public List<Transport> getAll() {
        return transports;
    }

    @Override
    public Boolean delete(Transport transport) {
        return transports.remove(transport);
    }
}
