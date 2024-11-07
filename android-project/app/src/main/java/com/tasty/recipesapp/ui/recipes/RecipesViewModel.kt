package com.tasty.recipesapp.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tasty.recipesapp.models.InstructionsModel
import com.tasty.recipesapp.repositories.RecipeRepository

class RecipesViewModel:ViewModel() {
    private val instructionList = MutableLiveData<List<InstructionsModel>>()

    val instructions : LiveData<List<InstructionsModel>> = instructionList

    private val repository=RecipeRepository()

    init {
       //instarctionList.value=repository.getInstructions()
    }
    fun loadInstructionData(){
        instructionList.value=repository.getInstructions()
    }
}