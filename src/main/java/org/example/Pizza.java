package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> ingredients;

    public Pizza() {
        ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void removeIngredient(String ingredient) {
        ingredients.remove(ingredient);
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
