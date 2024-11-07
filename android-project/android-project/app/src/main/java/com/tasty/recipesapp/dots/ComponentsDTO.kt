package com.tasty.recipesapp.dots

data class ComponentsDTO(

    val rawText: String,
    val extraComment: String,
    val ingredient: IngredientDTO,
    val measurement: MeasurementDTO,
    val position:Int


)
