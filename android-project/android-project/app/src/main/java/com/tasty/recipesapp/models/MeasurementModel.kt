package com.tasty.recipesapp.models

import com.tasty.recipesapp.dots.UnitDTO

data class MeasurementModel(
    val quantity: Int,
    val unit: UnitDTO
)
