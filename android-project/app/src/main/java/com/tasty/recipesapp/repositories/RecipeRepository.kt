package com.tasty.recipesapp.repositories

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tasty.recipesapp.dtos.InstructionsDTO
import com.tasty.recipesapp.models.InstructionsModel
import org.json.JSONObject

class RecipeRepository {
    val dummyData= """
        {
        "instructions": [
    {
      "instructionID": 11,
      "displayText": "In a large pot, boil water and add pasta. Cook (stirring frequently) until al dente.",
      "position": 1
    },
    {
      "instructionID": 12,
      "displayText": "Drain and set pasta aside.",
      "position": 2
    },
    {
      "instructionID": 13,
      "displayText": "In the same pan, heat olive oil and 2 tablespoons of butter. Add garlic and crushed red pepper, cook until fragrant.",
      "position": 3
    },
    {
      "instructionID": 14,
      "displayText": "Toss in shrimp, salt and pepper to taste, and stir until shrimp start to turn pink, but are not fully cooked.",
      "position": 4
    },
    {
      "instructionID": 15,
      "displayText": "Add oregano and spinach, cook until wilted.",
      "position": 5
    },
    {
      "instructionID": 16,
      "displayText": "Return cooked pasta to the pot, add remaining butter, parmesan, and parsley. Stir until well mixed and the butter is melted.",
      "position": 6
    },
    {
      "instructionID": 17,
      "displayText": "When the shrimp are cooked, add lemon juice, mix once more, then serve while hot.",
      "position": 7
    },
    {
      "instructionID": 18,
      "displayText": "Enjoy!",
      "position": 8
    }
  ]}"""

    fun InstructionsDTO.toModel(): InstructionsModel {
        return InstructionsModel(
            instructionID = this.instructionID,
            displayText = this.displayText,
            position=this.position
        )
    }


    private fun List<InstructionsDTO>.toModelList(): List<InstructionsModel> {
        return this.map { it.toModel() } }





    private fun loadInstructionDTOs():List<InstructionsDTO>{
        val gson = Gson()
        var instructionList = listOf<InstructionsDTO>()

        val jsonObject = JSONObject(dummyData)
        val instructionsArray = jsonObject.getJSONArray("instructions")
        val type = object : TypeToken<List<InstructionsDTO>>() {}.type
        instructionList = gson.fromJson(instructionsArray.toString(), type)
        Log.i("GSON", instructionList.toString())

        return instructionList

    }
    fun getInstructions() =loadInstructionDTOs().toModelList()

}