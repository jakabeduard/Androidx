package com.tasty.recipesapp.data.models

import com.tasty.recipesapp.data.dots.NutritionDTO


data class RecipeModel(
    val recipeID: Int,
    val name: String,
    val description: String,
    val thumbnailUrl: String,
    val keywords: String,
    val isPublic: Boolean,
    val userEmail: String,
    val originalVideoUrl: String,
    val country: String,
    val numServings: Int,
    val components: List<ComponentsModel>,
    val instructions: List<InstructionsModel>,
    val nutrition: NutritionDTO
)
