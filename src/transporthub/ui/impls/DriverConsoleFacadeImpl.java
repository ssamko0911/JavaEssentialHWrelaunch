package transporthub.ui.impls;

import transporthub.Main;
import transporthub.models.Driver;
import transporthub.models.DriverQualificationEnum;
import transporthub.models.Transport;
import transporthub.services.DriverService;
import transporthub.services.impls.DriverServiceImpl;
import transporthub.services.impls.TransportServiceImpl;
import transporthub.ui.ConsoleFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static transporthub.Main.*;

public class DriverConsoleFacadeImpl implements ConsoleFacade {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DriverService driverService = DriverServiceImpl.getInstance();
    public final DriverService DRIVER_SERVICE;

    public DriverConsoleFacadeImpl() {
        DRIVER_SERVICE = this.driverService;
    }

    @Override
    public void run() throws IOException {
        System.out.println("You're in a Driver control panel.");
        switch (startTransportMenu()) {
            case 1 -> executeChoiceOne();
            case 2 -> executeChoiceTwo();
            case 3 -> executeChoiceThree();
            case 4 -> executeChoiceFour();
            case 5 -> executeChoiceFive();
            case 6 -> executeChoiceSix();
            case 7 -> executeChoiceSeven();
            case 8 -> executeChoiceEight();
            case 0 -> runMainMenu();
            default -> runWrongChoiceDriverMenu();
        }
    }

    public static int startTransportMenu() {
        int choice;
        Scanner in = new Scanner(System.in);
        System.out.println("Press 1 - Show all Drivers in the park");
        System.out.println("Press 2 - Add a new Driver"); // done
        System.out.println("Press 3 - Assign Driver on Transport"); // +- done
        System.out.println("Press 4 - Show Driver info by ID"); // done
        System.out.println("Press 5 - Show All Drivers by surname"); // done
        System.out.println("Press 6 - Quit Driver from park"); // done
        System.out.println("Press 7 - Get all drivers assigned on a Route");
        System.out.println("Press 8 - Get all transports without Drivers");
        System.out.println("Press 0 - back to previous menu");
        choice = in.nextInt();
        return choice;
    }

    public void runWrongChoiceDriverMenu() throws IOException {
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("Wrong choice.Try one more time.");
            drawLines();
            run();
        }
    }

    private void executeChoiceOne() throws IOException {
        if (DRIVER_SERVICE.findAllDrivers().isEmpty()) {
            System.out.println("System has no Drivers now.");
        } else {
            printInfo(DRIVER_SERVICE.findAllDrivers());
        }
        drawLines();
        run();
    }

    private void executeChoiceTwo() throws IOException {
        System.out.println(DRIVER_SERVICE.addDriver(createDriver()));
        System.out.println("Driver has joined Park crew.");
        drawLines();
        run();
    }

    private Driver createDriver() throws IOException {
        System.out.println("Input driver's first name:");
        String firstName = in.readLine();
        System.out.println("Input driver's last name:");
        String lastName = in.readLine();
        System.out.println("Input driver's cell number:");
        String cell = in.readLine();
        System.out.println("Input Driver license qualification:\npress 1 - BUS license\npress 2 - TRAM license\npress 3 - multi license.");
        Driver driver = null;
        int licenseChoice = Integer.parseInt(in.readLine());
        switch (licenseChoice) {
            case 1 -> driver = new Driver(firstName, lastName, cell, DriverQualificationEnum.BUS_DRIVING_LICENCE);
            case 2 -> driver = new Driver(firstName, lastName, cell, DriverQualificationEnum.TRAM_DRIVING_LICENCE);
            case 3 -> driver = new Driver(firstName, lastName, cell, DriverQualificationEnum.MULTI_DRIVING_LICENCE);
        }
        return driver;
    }

    private void executeChoiceThree() throws IOException {
        System.out.println("Please, enter Transport ID you would like to assign Driver on:");
        int transportId = Integer.parseInt(in.readLine());
        if (TransportServiceImpl.getInstance().findTransportById(transportId).isPresent()) {
            System.out.println("Please, enter Driver ID you would like to assign:");
            int driverId = Integer.parseInt(in.readLine());
            if (DRIVER_SERVICE.findDriverById(driverId).isPresent()) {
                if (DRIVER_SERVICE.assignDriverToTransport(transportId, DRIVER_SERVICE.findDriverById(driverId).get())) {
                    System.out.println("Driver has assigned on Transport.");
                } else {
                    System.out.println("Driver has no right qualification to be assigned on Transport.");
                }
            } else {
                System.out.println("No Driver with such ID has found.");
            }
        } else {
            System.out.println("No Transport with such ID has found.");
        }
        drawLines();
        run();
    }

    private void executeChoiceFour() throws IOException {
        System.out.println("Please, enter Driver ID you would like to see:");
        int idToShow = Integer.parseInt(in.readLine());
        if (DRIVER_SERVICE.findDriverById(idToShow).isPresent()) {
            System.out.println(DRIVER_SERVICE.findDriverById(idToShow).get());
        } else {
            System.out.println("System has no drivers with such ID.");
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFive() throws IOException {
        System.out.println("Please, enter Driver's surname to get information:");
        String surname = in.readLine();
        if (!DRIVER_SERVICE.findDriverByLastName(surname).isEmpty()) {
            System.out.println("Full driver's info:".toUpperCase(Locale.ROOT));
            printInfo(DRIVER_SERVICE.findDriverByLastName(surname));
        } else {
            System.out.println("System has no drivers with such Lastname.");
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceSix() throws IOException {
        System.out.println("Input ID of Driver you'd like to quit from the park:");
        int driverId = Integer.parseInt(in.readLine());
        if (DRIVER_SERVICE.findDriverById(driverId).isPresent()) {
            List<Transport> transportList = TransportServiceImpl.getInstance().findAllTransports();
            if (transportList.isEmpty()) {
                DRIVER_SERVICE.removeDriver(driverId);
                System.out.println("Driver has fired from the park.");
            } else { // delete - rewrite;
                for (Transport item : transportList) {
                    if (item.getDriver().isEmpty() & item.getDriver().get().getId() != driverId) {
                        DRIVER_SERVICE.removeDriver(driverId);
                        System.out.println("Driver has fired from the park.");
                    } else {
                        System.out.println("Impossible to resign Driver (assigned on Transport).");
                    }
                }
            }
        } else {
            System.out.println("No Driver with such ID in the Park.");
        }
        drawLines();
        run();
    }

    private void executeChoiceSeven() throws IOException {
        System.out.println("Input ID of Route you'd like to get all Drivers:");
        int routeId = Integer.parseInt(in.readLine());
        if (!DRIVER_SERVICE.findAllDriversOnRoute(routeId).isEmpty()) {
            System.out.println("List of Drivers on chosen Route:".toUpperCase(Locale.ROOT));
            printInfo(DRIVER_SERVICE.findAllDriversOnRoute(routeId));
        } else {
            System.out.println("There is no such specific Route in th system or there are no Drivers on the Route.");
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceEight() throws IOException {
        if (DRIVER_SERVICE.findTransportWithoutDrivers().isEmpty()) {
            System.out.println("There are no Transport without Drivers in the system.");
        } else {
            System.out.println("List of Transports without Drivers:");
            printInfo(DRIVER_SERVICE.findTransportWithoutDrivers());
        }
        Main.drawLines();
        run();
    }
}
