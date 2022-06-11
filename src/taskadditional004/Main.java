package taskadditional004;

import taskadditional004.exceptions.PizzaNotFoundException;
import taskadditional004.models.Pizza;
import taskadditional004.models.PizzaSize;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Optional> pizzaList = new ArrayList<>();
        pizzaList.add(getOrderData());

        if (pizzaList.get(0).isPresent()) {
            System.out.println(pizzaList.get(0));
        } else {
            System.out.println("Order is not accepted.");
        }
    }

    public static Optional<Pizza> getOrderData() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input pizza's title:");
        String name = in.readLine();
        System.out.println("Input pizza's price:");
        double price = Double.parseDouble(in.readLine());
        System.out.println("Input pizza's size:");
        int size = Integer.parseInt(in.readLine());
        try {
            return Optional.of(new Pizza(name, price, PizzaSize.getPizzaSizeByName(size)));
        } catch (PizzaNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return Optional.empty();
    }
}
