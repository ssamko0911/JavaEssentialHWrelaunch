package hw006.task003;

import java.util.Scanner;

/*
Требуется:
Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
измерения (к примеру, из метров в километры, из километров в мили, и так далее).
 */
public class Main {
    public static void main(String[] args) {
        //суть задачи не понял, готов оперативно переделать.
        Scanner in = new Scanner(System.in);
        System.out.println("Input quantity of cm to convert: ");
        Distance distance = new Distance(in.nextDouble());
        distance.print();
        Distance.Converter.convertToDM(distance.distance);
        Distance.Converter.convertToM(distance.distance);
        Distance.Converter.convertToKm(distance.distance);
        Distance.Converter.convertToMiles(distance.distance);
        in.close();
    }
}
