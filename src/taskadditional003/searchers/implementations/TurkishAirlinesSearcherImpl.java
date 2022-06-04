package taskadditional003.searchers.implementations;

import taskadditional003.models.Ticket;
import taskadditional003.searchers.FlightSearcher;

public class TurkishAirlinesSearcherImpl implements FlightSearcher {

    private void convertFromJSON(Ticket[] someTickets) {
        System.out.println("Converting data from JSON");
    }

    @Override
    public Ticket[] getAllAvailableFlights() {
        String URL = "https://turkishairlines.com/find";
        System.out.println("Go to website " + URL);
        Ticket[] tickets = new Ticket[2];
        tickets[0] = new Ticket(3, "Rome - Milan", 200);
        tickets[1] = new Ticket(4, "Lisbon - Rome", 300);
        convertFromJSON(tickets);
        return tickets;
    }

    @Override
    public boolean bookTickets(long id) {
        System.out.println("Documents check execution ...");
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
