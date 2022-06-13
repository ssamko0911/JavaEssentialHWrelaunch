package hw009.task002;

import hw009.task002.models.MyList;

/*
Создайте проект, используя IntelliJ IDEA.
Создайте класс MyList<T>. Реализуйте в простейшем приближении возможность использования его
экземпляра аналогично экземпляру класса List<T>. Минимально требуемый интерфейс взаимодействия с
экземпляром, должен включать метод добавления элемента, индексатор для получения значения
элемента по указанному индексу и свойство только для чтения для получения общего количества
элементов.
 */
public class Main {
    public static void main(String[] args) {
        MyList<String> stringMyList = new MyList<>();
        stringMyList.addValue("Hi! ");
        stringMyList.addValue("This is class, ");
        stringMyList.addValue("created by me. ");
        stringMyList.addValue("Awesome!");
        System.out.println("<----------------- TASK ONE (ADD and PRINT result) ----------------->");
        for (int i = 0; i < stringMyList.getSizeOfList(); i++) {
            System.out.print(stringMyList.getValueByIndex(i));
        }
        System.out.println("\n<----------------- TASK TWO (GET INDEX by ID) ----------------->");
        System.out.println(stringMyList.getValueByIndex(0));
        System.out.println(stringMyList.getValueByIndex(stringMyList.getSizeOfList() - 1));
    }
}
