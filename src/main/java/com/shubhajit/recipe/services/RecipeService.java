package com.shubhajit.recipe.services;

import com.shubhajit.recipe.entity.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
