package hw003.task002;

import java.util.Locale;

import static hw003.task002.ClassRoom.showPupilMethods;

/*
Задание 2
Используя IntelliJ IDEA, создайте проект.
Требуется:
Создать класс, представляющий учебный класс ClassRoom.
Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
Создайте 3 производных класса ExcellentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
переопределите каждый из методов, в зависимости от успеваемости ученика.
Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
Предусмотрите возможность того, что пользователь может передать 2 или 3 аргумента.
Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
отдыхать.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("First Classroom:".toUpperCase(Locale.ROOT));
        ClassRoom classRoomOne = new ClassRoom(new BadPupil(), new GoodPupil(), new ExcellentPupil(), new GoodPupil());
        showPupilMethods(classRoomOne);
        System.out.println("Second Classroom:".toUpperCase(Locale.ROOT));
        ClassRoom classRoomTwo = new ClassRoom(new GoodPupil(), new ExcellentPupil());
        showPupilMethods(classRoomTwo);
        System.out.println("Third Classroom:".toUpperCase(Locale.ROOT));
        ClassRoom classRoomThree = new ClassRoom(new GoodPupil(), new ExcellentPupil(), new BadPupil());
        showPupilMethods(classRoomThree);
    }
}