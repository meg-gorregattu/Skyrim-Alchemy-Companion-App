package com.devmountain.skyrimAlchemyApp.repositories;

import com.devmountain.skyrimAlchemyApp.entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
