package com.foodfinder;

import java.util.List;

public class FoodFinderApplicationStarter {
    public FoodFinderDto start() {
        FoodFinder foodFinder = new FoodFinder();
        List<String> ingredients = List.of("jajka", "sól", "pieprz");
        Receipe recipe = foodFinder.createRecipe(ingredients);
        return new FoodFinderDto("success", recipe.name());
    }
}
