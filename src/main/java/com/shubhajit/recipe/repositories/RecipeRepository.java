package com.shubhajit.recipe.repositories;

import com.shubhajit.recipe.entity.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
