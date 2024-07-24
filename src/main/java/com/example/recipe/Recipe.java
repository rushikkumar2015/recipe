package com.example.recipe;

public class Recipe {
    private String recipeName;
    private String recipeType;
    private List<String> ingredients;

    Recipe(String recipeName,String recipeType,List<String> ingredients){
        this.recipeName=recipeName;
        this.recipeType= recipeType;
        this.ingredients=ingredients;
        public int setrecipeId(){
            return recipeId;
        }
        public void setrecipeId(int recipeId){
            this.recipeId= recipeId;
        }

        public String getrecipeName(){
            return recipeName;
        }
        public void setrecipeName(String recipeName){
            this.recipeName=recipeName;
        }
        public String getrecipeType(){
            return recipeType;
        }
        public void setrecipeType(String recipeType){
            this.recipeType=recipeType;
        }
        public List<String> getingredients(){
            return ingredients;
        }
        public void setingredients(List<String> ingredients){
            this.ingredients=ingredients;
        }
    }
}