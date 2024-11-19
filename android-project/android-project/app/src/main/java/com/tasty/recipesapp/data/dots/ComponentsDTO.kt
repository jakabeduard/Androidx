package com.tasty.recipesapp.data.dots

data class ComponentsDTO(

    val rawText: String,
    val extraComment: String,
    val ingredient: IngredientDTO,
    val measurement: MeasurementDTO,
    val position:Int


)
