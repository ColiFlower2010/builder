package main;

import dish.builders.OrderBuilder;
import dish.dessert.Cake;
import dish.drink.FruitFresh;
import dish.first_dish.Bouillon;
import dish.first_dish.Soup;
import dish.second_dish.Burger;
import dish.second_dish.Macaroni;
import dish.snack.CheeseSticks;
import dish.type.FirstDish;
import dish.type.Snack;

public class Application {
    public static void main(String[] args) {

        Order order = new OrderBuilder()
                .addSnack(new CheeseSticks())
                .addDessert(new Cake())
                .build();


        Order order2 = new OrderBuilder()
                .addFirstDish(new Soup())
                .addSecondDish(new Macaroni())
                .addDrink(new FruitFresh())
                .build();


        OrderBuilder orderBuilder = new OrderBuilder();
        // passing over somewhere to builder
        Snack snack = new CheeseSticks();
        // the snack appeared here
        orderBuilder.addSnack(snack);

        FirstDish firstDish = new Bouillon();
        //orderBuilder =
        orderBuilder.addFirstDish(firstDish);

        Order order1 = orderBuilder.build();

        String str = "jidhrlg";
        StringBuilder stringBuilder = new StringBuilder();
        String newStr = stringBuilder.toString();

    }
}
