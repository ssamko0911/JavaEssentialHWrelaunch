package hw007.task003.factory;

import hw007.task003.models.Price;

import java.util.Scanner;

public class PriceFactory {
    public static Scanner in = new Scanner(System.in);

    public Price createPrice() {
        System.out.println("Input item title:");
        String itemTitle = in.nextLine();
        System.out.println("Input shop's title:");
        String shopTitle = in.nextLine();
        System.out.println("Input the price of the item:");
        int priceTag = Integer.parseInt(in.nextLine());
        return new Price(itemTitle, shopTitle, priceTag);
    }
}
