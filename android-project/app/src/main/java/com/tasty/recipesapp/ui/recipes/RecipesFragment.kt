package com.tasty.recipesapp.ui.recipes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.tasty.recipesapp.R
import com.tasty.recipesapp.databinding.FragmentRecipesBinding

class RecipesFragment : Fragment() {

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
        binding.recipesRecipesDetailID.setOnClickListener{
            findNavController().navigate(R.id.action_recipesFragment_to_recipesDetailFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}