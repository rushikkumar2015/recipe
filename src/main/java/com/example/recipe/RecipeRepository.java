package com.example.recipe;

import com.example.recipe.Recipe;

interface RecipeRepository {
    ArrayList<Recipe> getAllrecipes();

    Recipe getrecipeById(int recipeId);

    Recipe addRecipe(Recipe recipe);

    Recipe updateRecipe(int recipeId, Recipe recipe);

    void deleteRecipe(int recipeId);

}