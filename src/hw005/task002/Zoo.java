package hw005.task002;

import java.util.ArrayList;
import java.util.List;

/*
Задание 2
Используя Intelij IDEA создать проект, пакет.
Создать класс Zoo. В классе создать список, в который записать 8 животных через метод add(index,
element).
Вывести список в консоль.
 */
public class Zoo {
    public static final int ZOO_LIMIT = 8;

    public static void main(String[] args) {
        List<String> zoo = new ArrayList<>();
        for (int i = 0; i < ZOO_LIMIT; i++) {
            zoo.add("Animal #" + (i + 1));
            System.out.println(zoo.get(i));
        }

        /*
        Задание 3
Используя Intelij IDEA создать проект, пакет.
Используя класс Zoo Задания 2, удалить 3, 5, 7 животные, узнать размер списка и вывести в консоль.
         */
        System.out.printf("\nSize of the ZOO list is %d\n", zoo.size());

        zoo.remove("Animal #3");
        zoo.remove("Animal #5");
        zoo.remove("Animal #7");

        for (String item : zoo) {
            System.out.println(item);
        }

        System.out.printf("\nNew size of the ZOO list is %d\n", zoo.size());
    }
}
