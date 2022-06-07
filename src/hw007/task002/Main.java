package hw007.task002;

import hw007.task002.factory.WorkerFactory;
import hw007.task002.models.Worker;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Задание 2

Создайте проект, используя IntelliJ IDEA. Требуется: Описать класс с именем Worker, содержащую следующие поля:
  фамилия и инициалы работника;
  название занимаемой должности;
  год поступления на работу.
Написать программу, выполняющую следующие действия:
  ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker (записи должны быть упорядочены по алфавиту);
  если значение года введено не в соответствующем формате выдает исключение.
  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
 */
public class Main {
    public static final int LIMIT_OF_WORKERS = 5;
    public static final int CURRENT_YEAR = 2022;

    public static void main(String[] args) {
        Worker[] workers = new Worker[LIMIT_OF_WORKERS];
        WorkerFactory workerFactory = new WorkerFactory();
        for (int i = 0; i < workers.length; i++) {
            workers[i] = workerFactory.createWorker();
        }

        System.out.println("<----------------------------- SORT RESULT ----------------------------->");
        Comparator<Worker> comparator = Comparator.comparing(Worker::getNameSurname);
        Arrays.sort(workers, comparator);
        for (Worker item : workers) {
            System.out.println(item);
        }
        System.out.println("<----------------------------- NEXT TASK ----------------------------->");
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of years to get workers with greater working period:");
        checkWorkingPeriod(in.nextInt(), workers);
    }

    public static void checkWorkingPeriod(int someValue, Worker[] someWorkers) {
        for (Worker item : someWorkers) {
            if (someValue < CURRENT_YEAR - item.getYear()) {
                System.out.println(item);
            }
        }
    }
}
