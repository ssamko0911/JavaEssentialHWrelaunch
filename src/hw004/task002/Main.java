package hw004.task002;

/*
Задание 2
Используя IntelliJ IDEA, создайте проект.
Создайте класс AbstractHandler.
В теле класса создать методы void open(), void create(), void change(), void save().
Создать производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
Написать программу, которая будет выполнять определение документа и для каждого формата должны
быть методы открытия, создания, редактирования, сохранения определенного формата документа.
 */

import hw004.task002.models.AbstractHandler;
import hw004.task002.models.DOCHandler;
import hw004.task002.models.TXTHandler;
import hw004.task002.models.XMLHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose type of document:\n1 - XML;\n2 - TXT;\n3 - DOC.");
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()) {
            case 1 -> {
                AbstractHandler xmlHandler = new XMLHandler();
                xmlHandler.runAllMethods();
            }
            case 2 -> {
                AbstractHandler txtHandler = new TXTHandler();
                txtHandler.runAllMethods();
            }
            case 3 -> {
                AbstractHandler docHandler = new DOCHandler();
                docHandler.runAllMethods();
            }
            default -> System.err.println("Wrong choice. Program out of running.");
        }
        in.close();
    }
}
