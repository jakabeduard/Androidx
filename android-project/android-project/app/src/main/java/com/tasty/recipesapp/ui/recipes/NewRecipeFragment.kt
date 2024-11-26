package com.tasty.recipesapp.ui.recipes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.tasty.recipesapp.data.dots.NutritionDTO
import com.tasty.recipesapp.data.models.ComponentsModel
import com.tasty.recipesapp.data.models.InstructionsModel
import com.tasty.recipesapp.databinding.FragmentNewRecipeBinding

class NewRecipeFragment : Fragment() {

    private var _binding: FragmentNewRecipeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNewRecipeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddComponent.setOnClickListener {
            // Logic to dynamically add a new component input row
            // Example: Add a custom view for each component
            Toast.makeText(requireContext(), "Add Component Feature Coming Soon", Toast.LENGTH_SHORT).show()
        }

        binding.btnAddInstruction.setOnClickListener {
            // Logic to dynamically add a new instruction input row
            Toast.makeText(requireContext(), "Add Instruction Feature Coming Soon", Toast.LENGTH_SHORT).show()
        }

        binding.btnSaveRecipe.setOnClickListener {
            val recipeID = binding.etRecipeID.text.toString().toIntOrNull()
            val name = binding.etName.text.toString()
            val description = binding.etDescription.text.toString()
            val thumbnailUrl = binding.etThumbnailUrl.text.toString()
            val keywords = binding.etKeywords.text.toString()
            val isPublic = binding.switchIsPublic.isChecked
            val userEmail = binding.etUserEmail.text.toString()
            val originalVideoUrl = binding.etOriginalVideoUrl.text.toString()
            val country = binding.etCountry.text.toString()
            val numServings = binding.etNumServings.text.toString().toIntOrNull()

            // These will hold dynamic input values for components and instructions
            val components = mutableListOf<ComponentsModel>()
            val instructions = mutableListOf<InstructionsModel>()

            // Placeholder for nutrition input
            val nutrition = NutritionDTO(
                calories = binding.etCalories.text.toString().toIntOrNull() ?: 0,
                protein = binding.etProtein.text.toString().toIntOrNull() ?: 0,
                fat = binding.etFat.text.toString().toIntOrNull() ?: 0,
                carbohydrates = binding.etCarbohydrates.text.toString().toIntOrNull() ?: 0,
                sugar = binding.etSugar.text.toString().toIntOrNull() ?: 0,
                fiber = binding.etFiber.text.toString().toIntOrNull() ?: 0
            )

            if (recipeID == null || name.isBlank() || description.isBlank()) {
                Toast.makeText(requireContext(), "Please fill all mandatory fields", Toast.LENGTH_SHORT).show()
            } else {
                // Handle the recipe creation logic (API call, ViewModel, etc.)
                Toast.makeText(requireContext(), "Recipe added successfully!", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
