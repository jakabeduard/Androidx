package com.tasty.recipesapp.models

import com.tasty.recipesapp.dots.IngredientDTO
import com.tasty.recipesapp.dots.MeasurementDTO


data class ComponentsModel(
    val rawText: String,
    val extraComment: String,
    val ingredient: IngredientDTO,
    val measurement: MeasurementDTO,
    val position:Int

)
