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
import com.tasty.recipesapp.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {
    private val recipeViewModel : RecipesViewModel by viewModels()

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
        binding.recipesRecipesDetailID.setOnClickListener {
            val bundle=Bundle()
            val instructionsList= recipeViewModel.instructions.value
            val randomIndex = (instructionsList?.indices)?.random()
            val randomInstruction = randomIndex?.let { it1 -> instructionsList?.get(it1) }
            bundle.apply {
                putString("id", randomInstruction?.instructionID.toString())

            }
            findNavController().navigate(R.id.action_recipesFragment_to_recipesDetailFragment, bundle)/// atmegy ide vagy oda

        }
        binding.recipesLoadInstruction.setOnClickListener{
                Toast.makeText(requireContext(), "Instruction Loding..", Toast.LENGTH_LONG).show()
                recipeViewModel.loadInstructionData()
        }
        recipeViewModel.loadInstructionData()

        recipeViewModel.instructions.observe(viewLifecycleOwner) {

                instructions ->
            for (instructionModel in instructions) {
                Log.d("Instructions", instructionModel.toString())
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}