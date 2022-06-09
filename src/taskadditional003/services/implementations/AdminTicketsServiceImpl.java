package taskadditional003.services.implementations;

import taskadditional003.models.Ticket;
import taskadditional003.searchers.FlightSearcher;
import taskadditional003.services.AdminTicketsService;

import java.util.*;

public class AdminTicketsServiceImpl implements AdminTicketsService {
    private FlightSearcher[] flightSearchers;

    public AdminTicketsServiceImpl(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }

    public FlightSearcher[] getFlightSearchers() {
        return flightSearchers;
    }

    public void setFlightSearchers(FlightSearcher[] flightSearchers) {
        this.flightSearchers = flightSearchers;
    }


    @Override
    public void printAllFlights() {
        for (FlightSearcher item : flightSearchers) {
            System.out.println(Arrays.toString(item.getAllAvailableFlights()));
        }
    }

    public Ticket getCheapestTicket(FlightSearcher[] flightSearchers) {
        List<Ticket> ticketList = new ArrayList<>();
        for (FlightSearcher flightSearcher : flightSearchers) {
            ticketList.addAll(Arrays.asList(flightSearcher.getAllAvailableFlights()));
        }
        Comparator<Ticket> ticketComparator = Comparator.comparing(Ticket::getPrice);
        return ticketList.stream().min(ticketComparator).get();
    }
}
