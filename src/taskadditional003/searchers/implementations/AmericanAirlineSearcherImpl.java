package taskadditional003.searchers.implementations;

import taskadditional003.models.Ticket;
import taskadditional003.searchers.FlightSearcher;

public class AmericanAirlineSearcherImpl implements FlightSearcher {

    private void convertFromCSV(Ticket[] someTickets) {
        System.out.println("Convert data from CSV...");
    }

    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "https://americananairlines.com/find";
        System.out.println("Go to website " + URL);
        Ticket[] tickets = new Ticket[2];
        tickets[0] = new Ticket(1, "London - Paris", 500);
        tickets[1] = new Ticket(2, "Dublin - Paris", 700);
        convertFromCSV(tickets);
        return tickets;
    }

    @Override
    public boolean bookTickets(long id) {
        System.out.println("Passenger visa check ...");
        Ticket[] tickets = getAllAvailableFlights();
        for (Ticket item : tickets) {
            if (item.getId() == id) {
                System.out.println("The ticket has booked.");
                return true;
            }
        }
        return false;
    }
}
