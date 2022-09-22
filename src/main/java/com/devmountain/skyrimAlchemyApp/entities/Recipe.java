package com.devmountain.skyrimAlchemyApp.entities;


import com.devmountain.skyrimAlchemyApp.dtos.RecipeDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;

@Entity
@Table(name = "Recipes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recipe_id;

    @Column
    private String name;

    @Column
    private String type;

    @Column
    private String ingredient_1;

    @Column
    private String ingredient_2;

    @Column
    private String ingredient_3;

    @Column(columnDefinition = "text")
    private String effects;

    @Column
    private Integer potion_value;

    @ManyToOne
    @JsonBackReference
    private User user;

    public Recipe(RecipeDto recipeDto) {
        if (recipeDto.getBody() != null){
            this.body = recipeDto.getBody();
        }
    }
}
