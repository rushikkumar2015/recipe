
package com.example.recipe;

import com.example.recipe.Recipe;
import com.example.recipe.RecipeService;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestControoler
class RecipeController extends RecipeService{
    RecipeService recipeservice= new RecipeService();
    @GetMapping("/recipes")
    public ArrayList<Recipe> getAllRecipes(){
        return recipeservice.getAllrecipes();

    }
    @GetMapping("recipes/{recipeId}")
    public Recipe getrecipeById(@PathVariable("recipeId") int recipeId){
        return recipeservice.getrecipeById(recipeId);
    }

    @PostMapping("/recipes")
    public Recipe addRecipe(RequestBody Recipe recipe){
        return recipeservice.addRecipe(recipe);


    }
    @PutMapping("/recipes/{recipeId}")

    public Recipe updateRecipe(@PathVariable("recipeId") int recipeId,@requestBody Recipe recipe){
        return recipeservice.updateRecipe(recipe);
    }
    @DeleteMapping("/recipes/{recipeId}")
    public void deleteRecipe(@PathVariable("recipeId") int recipeId){
        recipeservice.deleteRecipe(recipeId);
    }
}