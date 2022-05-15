package hw002.taskadditional001;

/*
Задание
Используя Intelij IDEA создать проект, пакет.
Создать класс MyArea, в нем объявить константу PI = 3.14 и статический метод areaOfCircle, который
должен принимать радиус и используя PI посчитать площадь круга.
Создать класс Main, где запустить данный метод.
 */

public class MyArea {
    public static final double PI = Math.PI;

    public static void calculateSquare (double someRadius) {
        System.out.printf("The square of circle is %.2f.", PI * someRadius * someRadius);
    }
}