package main;

import dish.type.*;

public class Order {

    private static int countOrders = 0;

    private Snack snack;
    private FirstDish firstDish;
    private SecondDish secondDish;
    private Dessert dessert;
    private Drink drink;

    static {
        countOrders++;
    }

    public Order(Snack snack, FirstDish firstDish, SecondDish secondDish, Dessert dessert, Drink drink) {
        this.snack = snack;
        this.firstDish = firstDish;
        this.secondDish = secondDish;
        this.dessert = dessert;
        this.drink = drink;
    }
}
