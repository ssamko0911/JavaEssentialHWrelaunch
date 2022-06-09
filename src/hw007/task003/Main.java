package hw007.task003;

import hw007.task003.factory.PriceFactory;
import hw007.task003.models.Price;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
Задание 3

Создайте проект, используя IntelliJ IDEA. Требуется: Описать класс с именем Price, содержащую следующие поля:
  название товара;
  название магазина, в котором продается товар;
  стоимость товара в гривнах.
 Написать программу, выполняющую следующие действия:
  ввод с клавиатуры данных в массив, состоящий из двух элементов типа Price
 (записи должны быть упорядочены в алфавитном порядке по названиям магазинов);
  вывод на экран информации о товарах, продающихся в магазине,
 название которого введено с клавиатуры (если такого магазина нет, вывести исключение).
 */
public class Main {
    // при решении за основу взято утверждение - магазинов с одинаковыми именами быть не может по умолчанию;
    public static final int LIMITS_OF_PRICE_INSTANCES = 2;

    public static void main(String[] args) {
        Price[] prices = new Price[LIMITS_OF_PRICE_INSTANCES];
        PriceFactory priceFactory = new PriceFactory();
        for (int i = 0; i < prices.length; i++) {
            prices[i] = priceFactory.createPrice();
        }

        System.out.println("<----------------------------- SORT RESULT ----------------------------->");
        Comparator<Price> comparator = Comparator.comparing(Price::getShopTitle);
        Arrays.sort(prices, comparator);
        for (Price item : prices) {
            System.out.println(item);
        }

        System.out.println("<----------------------------- NEXT TASK ----------------------------->");

        try {
            Price priceTask = checkShopTitle(prices);
            if (priceTask != null) {
                System.out.printf("In this shop we have %s with price - %d.", priceTask.getItemTitle(), priceTask.getPriceTag());
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException exception) {
            System.err.println("No such shop in the list!");
        }
    }

    public static Price checkShopTitle(Price[] someArray) {
        System.out.println("Insert the title of the shop:");
        Scanner in = new Scanner(System.in);
        String titleToCheck = in.nextLine();
        for (Price item : someArray) {
            if (item.getShopTitle().equalsIgnoreCase(titleToCheck)) {
                return item;
            }
        }
        return null;
    }
}
