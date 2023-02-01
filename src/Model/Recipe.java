/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;

/**
 *
 * @author asequ
 */
public class Recipe {
    String recipeTitle;
    int noOfServing;
    boolean isGlutenFree;
    double difficultyLevel;
    int noOfIngredients;
    String categoryOfFood;
    String description;
    String recipePicture;

    public String getRecipePicture() {
        return recipePicture;
    }

    public void setRecipePicture(String recipePicture) {
        this.recipePicture = recipePicture;
    }

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public int getNoOfServing() {
        return noOfServing;
    }

    public void setNoOfServing(int noOfServing) {
        this.noOfServing = noOfServing;
    }

    public boolean getIsGlutenFree() {
        return isGlutenFree;
    }

    public void setIsGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
    }
 

    public double getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(double difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public int getNoOfIngredients() {
        return noOfIngredients;
    }

    public void setNoOfIngredients(int noOfIngredients) {
        this.noOfIngredients = noOfIngredients;
    }

    public String getCategoryOfFood() {
        return categoryOfFood;
    }

    public void setCategoryOfFood(String categoryOfFood) {
        this.categoryOfFood = categoryOfFood;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    
}
