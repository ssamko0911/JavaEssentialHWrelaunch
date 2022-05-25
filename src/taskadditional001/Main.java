package taskadditional001;

/*
Дополнительное ДЗ по желанию, чтоб чисто пописать самому код:
1. Создать иерархию наследования Animal - Cat - Dog - Mouse, в Animal определить метод voice()?
который отвечает за "голос" каждого из наследников, в наследниках ПЕРЕОПРЕДЕЛИТЬ (override) этот метод
своим вариантом звучания, и ПЕРЕГРУЗИТЬ метод voice() в РОДИТЕЛЕ еще одним параметром
типа String - message.

Получится, если вызывается метод voice() - говорятся стандартные звуки КАЖДОГО ИЗ ЗВЕРЕЙ,
а если задан параметр перегруженного метода - говорится конкретный текст.
Создать массив зверей и в цикле заставить всех говорить, каждого второго - любой конкретный текст.

Простыми словами: звери издают звуки каждый по-своему, но когда говорят что-то конкретное -
то говорят только то, что говорят то, что передано в метод voice(String message).
 */

import taskadditional001.models.Animal;
import taskadditional001.utils.AnimalFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        AnimalFactory animalFactory = new AnimalFactory();
        for (int i = 0; i < animals.length; i++) {
            animals[i] = animalFactory.createAnimal(makeChoice());
            if ((i + 1) % 2 == 0) {
                animals[i].voice(getText());
            } else {
                animals[i].voice();
            }
        }
    }

    public static int makeChoice() {
        System.out.println("Choose animal to create:\n1 - create Cat;\n2 - create Dog;\n3 - create Mouse.");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    public static String getText() {
        System.out.println("Input text for animal to say:");
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
}
