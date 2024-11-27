package com.tasty.recipesapp.ui.profile

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.tasty.recipesapp.R
import com.tasty.recipesapp.adapter.RecipeAdapter
import com.tasty.recipesapp.databinding.FragmentProfileBinding
import com.tasty.recipesapp.databinding.FragmentRecipesBinding
import com.tasty.recipesapp.ui.recipes.RecipesViewModel

class ProfileFragment : Fragment() {

    private val recipeViewModel: RecipesViewModel by viewModels()

    private var _binding: FragmentProfileBinding?=null
    private val binding get()=_binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentProfileBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }


    ///CSAK A FAVORITOKAT JELENITI MEG
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Load the recipes data
        recipeViewModel.loadRecipesData()

        // Observe the recipes list from the view model
        recipeViewModel.recipes.observe(viewLifecycleOwner) { recipes ->
            // Filter the recipes to show only those with isFavourite = true
            val favoriteRecipes = recipes.filter { it.isFavourite }

            // Check if there are favorite recipes available
            if (favoriteRecipes.isNotEmpty()) {
                // Set the filtered recipes to the adapter and provide onRecipeClick callback
                binding.recyclerView.adapter = RecipeAdapter(favoriteRecipes) { recipe ->
                    val bundle = Bundle().apply {
                        putInt("id", recipe.recipeID)
                        putString("name", recipe.name)
                    }

                }

                // Log the favorite recipes
                for (recipe in favoriteRecipes) {
                    Log.d("Favorite Recipes", recipe.toString())
                }

                Toast.makeText(requireContext(), "Favorite Recipes Loaded", Toast.LENGTH_LONG).show()
            } else {
                // Show a message if there are no favorite recipes
                Toast.makeText(requireContext(), "No favorite recipes available", Toast.LENGTH_SHORT).show()
            }
        }
    }






    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}