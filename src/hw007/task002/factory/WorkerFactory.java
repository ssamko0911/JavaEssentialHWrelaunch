package hw007.task002.factory;

import hw007.task002.models.Worker;

import java.util.Scanner;

public class WorkerFactory {
    public static Scanner in = new Scanner(System.in);

    public Worker createWorker() {
        System.out.println("Input worker's name and surname (using space):");
        String name = in.nextLine();
        System.out.println("Input worker's position:");
        String position = in.nextLine();
        System.out.println("Input worker's year of start working in the company:");
        int year = 2000;
        try {
            year = Integer.parseInt(in.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Input year is incorrect. Default - 2000.");
        }
        return new Worker(name, position, year);
    }
}
