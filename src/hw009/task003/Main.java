package hw009.task003;

import hw009.task003.models.MyDictionary;

import java.util.Map;

/*
Задание 3
Создайте проект, используя IntelliJ IDEA.
Создайте класс MyDictionary<TKey,TValue>. Реализуйте в простейшем приближении возможность
использования его экземпляра. Минимально требуемый интерфейс взаимодействия с экземпляром,
должен включать метод добавления пар элементов, индексатор для получения значения элемента по
указанному индексу и свойство только для чтения для получения общего количества пар элементов.
 */
public class Main {
    public static void main(String[] args) {
        MyDictionary<String, String> myDictionary = new MyDictionary<>();
        myDictionary.addKeyAndValue("Color", "Red");
        myDictionary.addKeyAndValue("Greeting", "Good afternoon");
        myDictionary.addKeyAndValue("Weather", "Rain");

        for (Map.Entry<String, String> item : myDictionary.getAll()) {
            System.out.printf("\nKey - %s, Value - %s", item.getKey(), item.getValue());
        }

        System.out.printf("\nGET VALUE BY KEY RESULT: %s.", myDictionary.getValueByKey("Color"));
        System.out.printf("\nGET SIZE (ALL PAIRS): %d.", myDictionary.getSizeOfMap());
    }
}
