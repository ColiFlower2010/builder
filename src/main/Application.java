package main;

import dish.builders.OrderBuilder;
import dish.builders.PizzaBuilder;
import dish.dessert.Cake;
import dish.drink.FruitFresh;
import dish.first_dish.Bouillon;
import dish.first_dish.Soup;
import dish.ingredient.Ingredient;
import dish.ingredient.IngredientType;
import dish.second_dish.Burger;
import dish.second_dish.Macaroni;
import dish.second_dish.Pizza;
import dish.snack.CheeseSticks;
import dish.type.FirstDish;
import dish.type.Snack;

import javax.imageio.IIOException;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

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

        /*
        String str = "idprog";
        StringBuilder stringBuilder = new StringBuilder();
        String newStr = stringBuilder.toString();

         */

        makePizza();

    }

    public static Pizza makePizza() {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello: ");
        System.out.println("Choose the base for the pizza: 1 - thin, 2 - normal, 3 - thick, 4 - closed");

        String doughBase;
        try {
            String answer = reader.readLine();
            switch (answer) {
                case "1":
                    doughBase = "thin";
                    break;
                case "3":
                    doughBase = "thick";
                    break;
                case "4":
                    doughBase = "closed";
                    break;
                default:
                    doughBase = "normal";
                    break;
            }

            pizzaBuilder.setDoughBase(doughBase);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Add an ingredient: \n"
            + Arrays.stream(IngredientType.values())
                    .map(ingredientType -> ingredientType.getId() + " - " + ingredientType.getRuName())
                    .collect(Collectors.joining(", ")));
            System.out.println("Enter \"stop\" to stop the ingredient adding...");
            String answer;
            while (!(answer = reader.readLine()).equals("stop")) {
                Ingredient ingredient = new Ingredient(
                        IngredientType.getById(Integer.parseInt(answer)),
                        "our supplier",
                        LocalDateTime.now(),
                        LocalDateTime.MAX);
                pizzaBuilder.addIngredient(ingredient);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return pizzaBuilder.build();
    }

}
