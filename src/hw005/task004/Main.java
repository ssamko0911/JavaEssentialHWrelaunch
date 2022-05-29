package hw005.task004;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
Задание 4
Используя Intelij IDEA создать проект, пакет.
Создать класс Main, создать список целых чисел и используя ListIterator пройтись по списку и увеличить
значения на 1;
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        System.out.println("Initial values are:");
        for (int i = 0; i < 10; i++) {
            integers.add(i);
            System.out.print(integers.get(i) + " | ");
        }
        System.out.println("\nNew values (+1) are:");
        ListIterator<Integer> integerListIterator = integers.listIterator();
        while (integerListIterator.hasNext()) {
            System.out.print((integerListIterator.next() + 1) + " | ");
        }
    }
}
