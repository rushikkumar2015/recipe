package com.example.recipe;

import com.example.recipe.RecipeRepository;

import org.springframework.web.server.ResponseStatusException;

import com.example.recipe.Recipe;

import java.util.*;

// Don't modify the below code

public class RecipeService implements RecipeRepository {

        private static HashMap<Integer, Recipe> recipeBook = new HashMap<>();

        public RecipeService() {
                recipeBook.put(1,
                                new Recipe(1, "Pasta", "veg",
                                                Arrays.asList("pasta", "tomatoes", "olive oil", "garlic", "basil")));
                recipeBook.put(2, new Recipe(2, "Chicken Curry", "non-veg",
                                Arrays.asList("chicken", "onion", "tomato", "ginger", "garlic", "spices")));
                recipeBook.put(3, new Recipe(3, "Sushi", "non-veg",
                                Arrays.asList("sushi rice", "tuna fish", "seaweed", "wasabi", "ginger")));
                recipeBook.put(4, new Recipe(4, "Mushroom Risotto", "veg",
                                Arrays.asList("rice", "mushrooms", "onion", "garlic", "butter", "parmesan")));
                recipeBook.put(5, new Recipe(5, "Fish and Chips", "non-veg",
                                Arrays.asList("fish", "potatoes", "flour", "oil", "spices")));
        }

        // Don't modify the above code
        int uniqueNo = 6;
        @Override

        public ArrayList<String> getAllrecipes() {
                Collection<String> collectionrecipes = recipeBook.values();
                ArrayList<String> recipes = new ArrayList<>(collectionrecipes);
                return recipes;

        }
        @Override

        public Recipe getrecipeById(int recipeId) {
                Recipe recipe = recipeBook.get(recipeId);
                if (recipe == null) {
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                } else {
                        return recipe;
                }
        }
        @Override

        public Recipe addRecipe() {
                recipe.setrecipeId(uniqueNo);
                recipeBook.put(uniqueNo, recipe);
                uniqueNo = uniqueNo + 1;
                return recipe;
        }
        @Override

        public Recipe updateRecipe(int recipeId, Recipe recipe) {
                Recipe existingrecipe = recipeBook.get(recipeId);
                if (existingrecipe == null) {
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);

                }
                if (recipe.getrecipeName != null) {
                        existingrecipe.setrecipeName(recipe.getrecipeName());
                }
                if (recipe.getrecipeType != null) {
                        existingrecipe.setrecipeType(recipe.getrecipeType());
                }
                if (recipe.ingredients != null) {
                        existingrecipe.setingredients(recipe.getingredients());
                }
                return existingrecipe;
        }
        @Override

        public deleteRecipe(int recipeId){
                Recipe recipe= recipeBook.get(recipeId);
                if(recipe==null){
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
                }
                else{
                        recipeBook.remove(recipeId);
                        throw new ResponseStatusException(HttpStatus.NO_CONTENT);
                }
        }
}