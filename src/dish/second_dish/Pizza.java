package dish.second_dish;

import dish.ingredient.Ingredient;
import dish.type.SecondDish;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements SecondDish {

    private final String name;
    private final List<Ingredient> ingredients;
    private final boolean cheeseBumpers;
    private final String doughBase;

    public String getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return new ArrayList<>(ingredients);
    }

    public boolean isCheeseBumpers() {
        return cheeseBumpers;
    }

    public String getDoughBase() {
        return doughBase;
    }

    public Pizza(String name, List<Ingredient> ingredients, boolean cheeseBumpers, String doughBase) {
        this.name = name;
        this.ingredients = ingredients;
        this.cheeseBumpers = cheeseBumpers;
        this.doughBase = doughBase;
     }

     // 28:35

}
