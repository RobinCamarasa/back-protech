package com.robin.camarasa.nutritivecoach.web.dto;

import com.robin.camarasa.nutritivecoach.model.Food;
import com.robin.camarasa.nutritivecoach.model.FoodCooking;
import com.robin.camarasa.nutritivecoach.model.Recipe;

public class FoodCookingDto {

    private final Long id;
    private final Float weight;
    private final Food food;
    private final Recipe recipe;

    public FoodCookingDto(FoodCooking foodCooking) {
        this.id = foodCooking.getId();
        this.weight = foodCooking.getWeight();
        this.food = foodCooking.getFood();
        this.recipe = foodCooking.getRecipe();
    }

    public Float getWeight() {
        return weight;
    }

    public Food getFood() {
        return food;
    }

    public Long getId() {
        return id;
    }

    public Recipe getRecipe() {
        return recipe;
    }
}