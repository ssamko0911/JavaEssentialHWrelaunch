package taskadditional003.services;

import taskadditional003.models.Ticket;
import taskadditional003.searchers.FlightSearcher;

public interface AdminTicketsService {
    void printAllFlights();

    Ticket getCheapestTicket(FlightSearcher[] flightSearchers);
}
