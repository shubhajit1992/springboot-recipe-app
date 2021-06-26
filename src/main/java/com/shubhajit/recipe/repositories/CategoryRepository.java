package com.shubhajit.recipe.repositories;

import com.shubhajit.recipe.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
