package com.devmountain.skyrimAlchemyApp.dtos;

import com.devmountain.skyrimAlchemyApp.entities.Recipe;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDto implements Serializable {

    private Long recipe_id;

    private String name;

    private String type;

    private String ingredient_1;

    private String ingredient_2;

    private String ingredient_3;

    private String effects;

    private Integer potion_value;

    private UserDto userDto;

    public RecipeDto(Recipe recipe){
        if (recipe.getRecipe_id() != null){
            this.recipe_id = recipe.getRecipe_id();
        }
        if (recipe.getName() != null){
            this.name = recipe.getName();
        }
        if (recipe.getType() != null){
            this.type = recipe.getType();
        }
        if (recipe.getIngredient_1() != null){
            this.ingredient_1 = recipe.getIngredient_1();
        }
        if (recipe.getIngredient_2() != null){
            this.ingredient_2 = recipe.getIngredient_2();
        }
        if (recipe.getIngredient_3() != null){
            this.ingredient_3 = recipe.getIngredient_3();
        }
        if (recipe.getEffects() != null){
            this.effects = recipe.getEffects();
        }
        if (recipe.getPotion_value() != null){
            this.potion_value = recipe.getPotion_value();
        }
    }

}
