package com.tasty.recipesapp.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tasty.recipesapp.data.models.RecipeModel
import com.tasty.recipesapp.providers.RepositoryProvider
import com.tasty.recipesapp.repositories.RecipeRepository
import kotlinx.coroutines.launch

class RecipesViewModel :ViewModel() {

    private val recipesList = MutableLiveData<List<RecipeModel>>()

    val recipes: LiveData<List<RecipeModel>> = recipesList

    /*private val repository= RecipeRepository(RepositoryProvider.recipeDao)*/


    init {
        ///val instruction=repository.getRecipes()

    }
    fun loadRecipesData(){
        viewModelScope.launch {
            recipesList.value = RepositoryProvider.recipeRepository.getRecipes()
        }
    }
}