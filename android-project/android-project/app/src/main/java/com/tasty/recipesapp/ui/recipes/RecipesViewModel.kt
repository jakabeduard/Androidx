package com.tasty.recipesapp.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tasty.recipesapp.data.models.RecipeModel
import com.tasty.recipesapp.repositories.RecipeRepository

class RecipesViewModel :ViewModel() {

    private val recipesList = MutableLiveData<List<RecipeModel>>()

    val recipes: LiveData<List<RecipeModel>> = recipesList

    private val repository= RecipeRepository()


    init {
        ///val instruction=repository.getRecipes()

    }
    fun loadRecipesData(){
        recipesList.value=repository.getRecipes()
    }
}