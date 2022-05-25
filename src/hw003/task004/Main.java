package hw003.task004;

import java.util.Scanner;

/*
Задание 4
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создайте класс DocumentWorker.
В теле класса создайте три метода openDocument(), editDocument(), saveDocument().
В тело каждого из методов добавьте вывод на экран соответствующих строк: "Документ открыт",
"Редактирование документа доступно в версии Про", "Сохранение документа доступно в версии Про".
Создайте производный класс ProDocumentWorker.
Переопределите соответствующие методы, при переопределении методов выводите следующие строки:
"Документ отредактирован", "Документ сохранен в старом формате, сохранение в остальных форматах
доступно в версии Эксперт".
Создайте производный класс ExpertDocumentWorker от базового класса ProDocumentWorker.
Переопределите соответствующий метод. При вызове данного метода необходимо выводить на экран
"Документ сохранен в новом формате".
В теле метода main() реализуйте возможность приема от пользователя номера ключа доступа pro и exp.
Если пользователь не вводит ключ, он может пользоваться только бесплатной версией (создается
экземпляр базового класса), если пользователь ввел номера ключа доступа pro и exp, то должен создаться
экземпляр соответствующей версии класса, приведенный к базовому – DocumentWorker.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("You're welcome to use DocumentWorker.\nIn case you have a license key to use Pro or Expert,"
                + " please,input(if not, press Enter):");
        Scanner in = new Scanner(System.in);
        switch (in.nextLine()) {
            case "123456" -> {
                DocumentWorker documentWorkerPro = new ProDocumentWorker();
                System.out.println("Pro version is available for you.");
                drawLines();
                documentWorkerPro.openDocument();
                documentWorkerPro.editDocument();
                documentWorkerPro.saveDocument();
                drawLines();
            }
            case "654321" -> {
                DocumentWorker documentWorkerExpert = new ExpertDocumentWorker();
                System.out.println("Expert version is available for you.");
                drawLines();
                documentWorkerExpert.openDocument();
                documentWorkerExpert.editDocument();
                documentWorkerExpert.saveDocument();
                drawLines();
            }
            default -> {
                DocumentWorker documentWorker = new DocumentWorker();
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