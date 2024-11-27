package com.tasty.recipesapp.ui.recipes

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.tasty.recipesapp.R
import com.tasty.recipesapp.adapter.RecipeAdapter
import com.tasty.recipesapp.databinding.FragmentProfileBinding
import com.tasty.recipesapp.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {
    private val profileViewModel: RecipesViewModel by viewModels()

    private var _binding:FragmentRecipesBinding?=null
    private val binding get()=_binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding=FragmentRecipesBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

/*        binding.recipesRecipesDetailID.setOnClickListener{
            val bundle=Bundle()
            val recipeList= recipeViewModel.recipes.value
            val randomIndex=(recipeList?.indices)?.random()
            val randomRecipe=randomIndex?.let { it1 ->recipeList?.get(it1) }
            bundle.apply {
                putString("id", randomRecipe?.recipeID.toString())
                putString("name", randomRecipe?.name)
            }
            findNavController().navigate(R.id.action_recipesFragment_to_recipesDetailFragment,bundle)/// atmentunk  a detail fragmentre
            ///vagy itt betoltunk valamit
        }*/

/*        binding.recipesLoadRecipes.setOnClickListener{
            Toast.makeText(requireContext(), "Recipes Loding..", Toast.LENGTH_LONG).show()
            recipeViewModel.loadRecipesData();
        }

        recipeViewModel.loadRecipesData();*/
        profileViewModel.loadRecipesData() // Trigger data loading

        profileViewModel.recipes.observe(viewLifecycleOwner) { recipes ->
            // Ensure the recipes list is not null or empty
            if (!recipes.isNullOrEmpty()) {
                // Set the adapter with the recipes list and navigation callback
                binding.recyclerView.adapter = RecipeAdapter(recipes) { recipe ->
                    val bundle = Bundle().apply {
                        putInt("id", recipe.recipeID)
                        putString("name", recipe.name)
                    }
                    findNavController().navigate(R.id.action_recipesFragment_to_recipesDetailFragment, bundle)
                }
            } else {
                Toast.makeText(requireContext(), "No recipes available", Toast.LENGTH_SHORT).show()
            }
        }

        binding.addNewRecipeButtom.setOnClickListener{

            findNavController().navigate(R.id.action_recipesFragment_to_newRecipeFragment)/// atmentunk  a detail fragmentre
            ///vagy itt betoltunk valamit
        }




        profileViewModel.loadRecipesData()

        profileViewModel.recipes.observe(viewLifecycleOwner) { recipes ->
            binding.recyclerView.adapter = RecipeAdapter(recipes) { recipe ->
                // This is the onRecipeClick lambda
                val bundle = Bundle().apply {
                    putInt("id", recipe.recipeID)
                    putString("name", recipe.name)
                }
                findNavController().navigate(R.id.action_recipesFragment_to_recipesDetailFragment, bundle)
            }

            for (recipesModel in recipes) {
                Log.d("Recipes", recipesModel.toString())
            }
            Toast.makeText(requireContext(), "Recipes Loading", Toast.LENGTH_LONG).show()
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}