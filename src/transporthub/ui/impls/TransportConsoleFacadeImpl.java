package transporthub.ui.impls;

import transporthub.Main;
import transporthub.models.*;
import transporthub.repositiries.TransportRepo;
import transporthub.repositiries.impls.RouteRepoImpl;
import transporthub.repositiries.impls.TransportRepoImpl;
import transporthub.services.TransportService;
import transporthub.services.impls.TransportServiceImpl;
import transporthub.ui.ConsoleFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Optional;
import java.util.Scanner;

import static transporthub.Main.*;

public class TransportConsoleFacadeImpl implements ConsoleFacade {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    TransportService transportService = TransportServiceImpl.getInstance();
    public final TransportService TRANSPORT_SERVICE;

    public TransportConsoleFacadeImpl() {
        TRANSPORT_SERVICE = this.transportService;
    }

    @Override
    public void run() throws IOException {
        System.out.println("You're in a Transport Menu. Make your choice:");
        switch (startTransportMenu()) {
            case 1 -> executeChoiceOne();
            case 2 -> executeChoiceTwo();
            case 3 -> executeChoiceThree();
            case 4 -> executeChoiceFour();
            case 5 -> executeChoiceFive();
            case 6 -> executeChoiceSix();
            case 7 -> executeChoiceSeven();
            case 0 -> runMainMenu();
            default -> runWrongChoiceTransportMenu();
        }
    }

    public static int startTransportMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 - Show all kinds of transport in the park"); // done
        System.out.println("Press 2 - Add new transport(Bus or Tram)"); // done
        System.out.println("Press 3 - Take away transport from the park"); // done
        System.out.println("Press 4 - Show transport by ID");
        System.out.println("Press 5 - Put transport on a Route");
        System.out.println("Press 6 - Show all transport by Mark");
        System.out.println("Press 7 - Take transport out of the Route");
        System.out.println("Press 8 - Get all transport without Driver");
        System.out.println("Press 0 - back to previous menu");
        choice = in.nextInt();
        return choice;
    }

    public void runWrongChoiceTransportMenu() throws IOException {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Wrong choice.Try one more time.");
            drawLines();
            run();
        }
    }

    private void executeChoiceOne() throws IOException {
        if (TRANSPORT_SERVICE.findAllTransports().isEmpty()) {
            System.out.println("System has no transport now.");
        } else {
            printInfo(TRANSPORT_SERVICE.findAllTransports());
        }
        drawLines();
        run();
    }

    private static int getChoiceCreationMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose transport to create:\nPress 1 - Create a BUS");
        System.out.println("Press 2 - Create a TRAM");
        System.out.println("Press 0 - Previous menu");
        choice = in.nextInt();
        return choice;
    }

    private void executeChoiceTwo() throws IOException {
        switch (getChoiceCreationMenu()) {
            case 1 -> {
                System.out.println(TRANSPORT_SERVICE.addTransport(createBus()));
                drawLines();
                run();
            }
            case 2 -> {
                System.out.println(TRANSPORT_SERVICE.addTransport(createTram()));
                drawLines();
                run();
            }
            case 0 -> {
                drawLines();
                run();
            }
            default -> {
                //noinspection InfiniteLoopStatement
                while (true) {
                    System.out.println("Wrong choice.Try one more time.");
                    drawLines();
                    executeChoiceTwo();
                }
            }
        }
    }

    public Transport createTram() throws IOException {
        System.out.println("Input transport mark:");
        String mark = in.readLine();
        System.out.println("Input transport model:");
        String model = in.readLine();
        System.out.println("Input number of passengers:");
        int numberOfPassengers = Integer.parseInt(in.readLine());
        System.out.println("Input number of wagons:");
        int numberOfWagons = Integer.parseInt(in.readLine());
        return new Tram(mark, model, numberOfPassengers, numberOfWagons);
    }

    private static Transport createBus() throws IOException {
        System.out.println("Input transport mark:");
        String mark = in.readLine();
        System.out.println("Input transport model:");
        String model = in.readLine();
        System.out.println("Input number of passengers:");
        int numberOfPassengers = Integer.parseInt(in.readLine());
        System.out.println("Input transport type:");
        String type = in.readLine();
        System.out.println("Input number of doors:");
        int numberOfDoors = Integer.parseInt(in.readLine());
        return new Bus(mark, model, numberOfPassengers, type, numberOfDoors);
    }

    private void executeChoiceThree() throws IOException {
        System.out.println("Input ID of transport you'd like to delete from the park:");
        int transportID = Integer.parseInt(in.readLine());
        if (TRANSPORT_SERVICE.removeTransport(transportID)
                & TRANSPORT_SERVICE.findTransportById(transportID).flatMap(Transport::getDriver).isEmpty()) {
            System.out.println("Transport has deleted from the park.");
        } else {
            System.out.println("Impossible to delete transport with assigned Driver.");
        }
        drawLines();
        run();
    }

    private void executeChoiceFour() throws IOException {
        System.out.println("Please, enter Transport ID you would like to see:");
        int idToShow = Integer.parseInt(in.readLine());
        if (TRANSPORT_SERVICE.findTransportById(idToShow).equals(Optional.empty())) {
            System.out.println("System has no transports with such ID.");
        } else {
            System.out.println(TRANSPORT_SERVICE.findTransportById(idToShow));
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFive() throws IOException {
        System.out.println("Input ID of Route you'd like to add for Transport:");
        Route route;
        int idRoute = Integer.parseInt(in.readLine());
        if (!(RouteRepoImpl.getInstance().getAll().isEmpty()) && RouteRepoImpl.getInstance().getAll().size() > idRoute) {
            route = RouteRepoImpl.getInstance().getById(idRoute);
            System.out.println("Input ID of Transport:");
            int idTransport = Integer.parseInt(in.readLine());
            if (!(TRANSPORT_SERVICE.findAllTransports().isEmpty()) && (TRANSPORT_SERVICE.findAllTransports().size() > idTransport) && (TRANSPORT_SERVICE.findTransportById(idTransport).flatMap(Transport::getDriver).isPresent())) {
                System.out.println("Transport successfully added on a Route.");
                System.out.println(TRANSPORT_SERVICE.assignTransportOnRoute(idTransport, route));
            } else {
                System.out.println("Impossible to assign Transport on a Route (check Transport ID or Driver obligatory assigned to transport).");
            }
        } else {
            System.out.println("System has no such ID for Route");
        }
        drawLines();
        run();
    }


    private void executeChoiceSix() throws IOException {
        System.out.println("Please, enter Mark of Transport you would like to find in Park:");
        String mark = in.readLine();
        if (TRANSPORT_SERVICE.findAllTransportByMark(mark).isEmpty()) {
            System.out.println("No transport with such mark in the park has found.");
        } else {
            System.out.println(TRANSPORT_SERVICE.findAllTransportByMark(mark));
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceSeven() {
    }
}
