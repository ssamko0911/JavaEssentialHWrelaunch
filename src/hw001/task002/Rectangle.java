package hw001.task002;

/*
Задание 2
Используя IDEA, создайте проект c пакетом. Требуется: Создать класс с именем Rectangle. В теле класса
создать два поля, описывающие длины сторон double side1, double side2. Создать два метода,
вычисляющие площадь прямоугольника – double areaCalculator (double side1, double side2) и периметр
прямоугольника – double perimeterCalculator (double side1, double side2). Написать программу, которая
принимает от пользователя длины двух сторон прямоугольника и выводит на экран периметр и
площадь.
 */
public class Rectangle {
    private double sideOne;
    private double sideTwo;

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double areaCalculator(double someSideOne, double someSideTwo) {
        return someSideOne * someSideTwo;
    }

    public double perimeterCalculator(double someSideOne, double someSideTwo) {
        return (someSideOne + someSideTwo) * 2;
    }
}