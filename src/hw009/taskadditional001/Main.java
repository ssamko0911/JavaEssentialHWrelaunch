package hw009.taskadditional001;

import hw009.taskadditional001.models.MyClass;

/*
Задание
Создайте проект, используя IntelliJ IDEA.
Создайте класс MyClass<T>, содержащий статический фабричный метод - T factoryMethod(), который
будет порождать экземпляры типа, указанного в качестве параметра типа (указателя места заполнения
типом – Т).
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(MyClass.factoryMethod("Test value!"));
        System.out.println(MyClass.factoryMethod(1000));
    }
}
