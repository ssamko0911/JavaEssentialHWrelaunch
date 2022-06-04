package taskadditional003;

import taskadditional003.searchers.FlightSearcher;
import taskadditional003.searchers.implementations.AmericanAirlineSearcherImpl;
import taskadditional003.searchers.implementations.TurkishAirlinesSearcherImpl;
import taskadditional003.services.implementations.AdminTicketsServiceImpl;

public class Main {
    public static void main(String[] args) {
        FlightSearcher flightSearcherAmerica = new AmericanAirlineSearcherImpl();
        FlightSearcher flightSearcherTurkish = new TurkishAirlinesSearcherImpl();
        FlightSearcher[] flightSearchers = {flightSearcherAmerica, flightSearcherTurkish};
        AdminTicketsServiceImpl adminTicketsService = new AdminTicketsServiceImpl(flightSearchers);
        adminTicketsService.printAllFlights();
        System.out.println("<--------------------------- HOMEWORK RESULT --------------------------->");
        System.out.println("The Cheapest is " + adminTicketsService.getCheapestTicket(flightSearchers));
    }
}
