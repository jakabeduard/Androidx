package com.tasty.recipesapp.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.tasty.recipesapp.R
import com.tasty.recipesapp.data.models.RecipeModel

class RecipeAdapter(private val dataSet: List<RecipeModel>) :
    RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val recipe_Name: TextView
        val recipe_Description: TextView
        val recipe_Image: ImageView


        init {
            // Define click listener for the ViewHolder's View
            recipe_Name = view.findViewById(R.id.recipeName)
            recipe_Description=view.findViewById(R.id.recipeDescription)
            recipe_Image=view.findViewById(R.id.recipeImage)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.single_recipe, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.recipe_Name.text = dataSet[position].name
        viewHolder.recipe_Description.text = dataSet[position].description


        Glide.with(viewHolder.itemView)
            .load(dataSet[position].thumbnailUrl)
            .placeholder(R.drawable.sample_recipe_image) // Placeholder image
            .error(R.drawable.sample_recipe_image) // Error fallback image
            .centerCrop()
            .into(viewHolder.recipe_Image)
        Log.d("RecipeAdapter", "Thumbnail URL: ${dataSet[position].thumbnailUrl}")


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}