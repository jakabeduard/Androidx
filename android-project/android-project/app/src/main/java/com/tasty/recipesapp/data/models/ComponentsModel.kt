package com.tasty.recipesapp.data.models

import com.tasty.recipesapp.data.dots.IngredientDTO
import com.tasty.recipesapp.data.dots.MeasurementDTO


data class ComponentsModel(
    val rawText: String,
    val extraComment: String,
    val ingredient: IngredientDTO,
    val measurement: MeasurementDTO,
    val position:Int

)
