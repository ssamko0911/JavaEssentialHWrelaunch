package transporthub.ui.impls;

import transporthub.Main;
import transporthub.models.Driver;
import transporthub.models.DriverQualificationEnum;
import transporthub.repositiries.DriverRepo;
import transporthub.repositiries.impls.DriverRepoImpl;
import transporthub.services.DriverService;
import transporthub.services.impls.DriverServiceImpl;
import transporthub.ui.ConsoleFacade;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

import static transporthub.Main.*;

public class DriverConsoleFacadeImpl implements ConsoleFacade {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    DriverRepo driverRepo = DriverRepoImpl.getInstance();
    DriverService driverService = new DriverServiceImpl(driverRepo);
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
        System.out.println("Press 2 - Add a new Driver");
        System.out.println("Press 3 - Assign Driver on transport");
        System.out.println("Press 4 - Show Driver info by ID");
        System.out.println("Press 5 - Show Driver info by surname");
        System.out.println("Press 6 - Quit Driver from park");
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
        System.out.println("Driver has created.");
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
        DriverQualificationEnum qualification = null;
        int licenseChoice = Integer.parseInt(in.readLine());
        switch (licenseChoice) {
            case 1 -> qualification = DriverQualificationEnum.BUS_DRIVING_LICENCE;
            case 2 -> qualification = DriverQualificationEnum.TRAM_DRIVING_LICENCE;
            case 3 -> qualification = DriverQualificationEnum.MULTI_DRIVING_LICENCE;
        }
        return new Driver(firstName, lastName, cell, qualification);
    }

    private void executeChoiceThree() throws IOException {
        drawLines();
        run();
    }

    private void executeChoiceFour() throws IOException {
        System.out.println("Please, enter Driver ID you would like to see:");
        int idToShow = Integer.parseInt(in.readLine());
        if (DRIVER_SERVICE.findDriverById(idToShow).equals(Optional.empty())) {
            System.out.println("System has no drivers with such ID.");
        } else {
            System.out.println(DRIVER_SERVICE.findDriverById(idToShow));
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceFive() throws IOException {
        System.out.println("Please, enter Driver's surname to get information:");
        String surname = in.readLine();
        if (DRIVER_SERVICE.findDriverByLastName(surname).equals(Optional.empty())) {
            System.out.println("System has no drivers with such Lastname.");
        } else {
            System.out.println("Full driver's info:".toUpperCase(Locale.ROOT));
            System.out.println(DRIVER_SERVICE.findDriverByLastName(surname));
        }
        Main.drawLines();
        run();
    }

    private void executeChoiceSix() throws IOException {
        System.out.println("Input ID of Driver you'd like to quit from the park:");
        if (DRIVER_SERVICE.removeDriver(Integer.parseInt(in.readLine()))) {
            System.out.println("Driver has fired from the park.");
        } else {
            System.out.println("Impossible to quit driver because of assigning on a transport.");
        }
        drawLines();
        run();
    }

    private void executeChoiceEight() {
    }

    private void executeChoiceSeven() {
    }
}
