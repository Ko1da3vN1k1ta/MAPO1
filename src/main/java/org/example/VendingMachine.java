package org.example;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private List<String> drinks;

    public VendingMachine() {
        drinks = new ArrayList<>();
        drinks.add("Cola");
        drinks.add("Coffee");
        drinks.add("Sprite");
    }

    public void choosingADrink(String drink) {
        if (drinks.contains(drink)) {
            System.out.println("Выберите напиток " + drink);
        } else {
            System.out.println("Напитка нет в наличии");
        }
    }

    public void payment(int amount) {
        System.out.println("Платеж на сумму " + amount + " прошел");
    }

    public void dispenseDrink() {
        System.out.println("Напиток получен");
    }

    public boolean checkAvailability(String drink) {
        return drink.contains(drink);
    }
}
