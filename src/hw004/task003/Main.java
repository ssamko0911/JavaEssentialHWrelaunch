package hw004.task003;

import hw004.task003.models.Player;

/*
Задание 3
Используя IntelliJ IDEA, создайте проект.Требуется:
Создайте 2 интерфейса Playable и Recordable. В каждом из интерфейсов создайте по 3 метода void play() /
void pause() / void stop() и void record() / void pause() / void stop() соответственно.
Создайте производный класс Player от базовых интерфейсов Playable и Recordable.
Написать программу, которая выполняет проигрывание и запись.
 */
public class Main {
    public static void main(String[] args) {
        //не ясно, что нужно сделать в задании, готов оперативно доработать.
        Player player = new Player();
        System.out.println("Player has such buttons to use:");
        player.record();
        player.pause();
        player.stop();
        player.play();
    }
}
