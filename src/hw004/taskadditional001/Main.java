package hw004.taskadditional001;

import hw004.taskadditional001.models.DocumentSoftware;
import hw004.taskadditional001.models.DocumentWorker;
import hw004.taskadditional001.models.ExpertDocumentWorker;
import hw004.taskadditional001.models.ProDocumentWorker;

import java.util.Scanner;

/*
Задание
Используя IntelliJ IDEA, создайте проект.
Требуется: Изменить 12 пример первого урока (работа с документом) и создать общий абстрактный класс
для всех частей документа.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("You're welcome to use DocumentWorker.\nIn case you have a license key to use Pro or Expert,"
                + " please,input(if not, press Enter):");
        Scanner in = new Scanner(System.in);
        switch (in.nextLine()) {
            case "123456" -> {
                DocumentSoftware documentWorkerPro = new ProDocumentWorker();
                System.out.println("Pro version is available for you.");
                drawLines();
                documentWorkerPro.openDocument();
                documentWorkerPro.editDocument();
                documentWorkerPro.saveDocument();
                drawLines();
            }
            case "654321" -> {
                DocumentSoftware documentWorkerExpert = new ExpertDocumentWorker();
                System.out.println("Expert version is available for you.");
                drawLines();
                documentWorkerExpert.openDocument();
                documentWorkerExpert.editDocument();
                documentWorkerExpert.saveDocument();
                drawLines();
            }
            default -> {
                DocumentSoftware documentWorker = new DocumentWorker();
                System.out.println("Regular version is available for you.");
                drawLines();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();
                drawLines();
            }
        }
        in.close();
    }

    public static void drawLines() {
        System.out.println("-".repeat(90));
    }
}
