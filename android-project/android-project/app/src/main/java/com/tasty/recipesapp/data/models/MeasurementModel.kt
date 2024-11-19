package com.tasty.recipesapp.data.models

import com.tasty.recipesapp.data.dots.UnitDTO

data class MeasurementModel(
    val quantity: Int,
    val unit: UnitDTO
)
