package taskadditional003.searchers;

import taskadditional003.models.Ticket;

public interface FlightSearcher {
    Ticket[] getAllAvailableFlights();

    boolean bookTickets(long id);
}
