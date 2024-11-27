package com.tasty.recipesapp.repositories

import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.tasty.recipesapp.data.dots.ComponentsDTO
import com.tasty.recipesapp.data.dots.IngredientDTO
import com.tasty.recipesapp.data.dots.InstructionsDTO
import com.tasty.recipesapp.data.dots.MeasurementDTO
import com.tasty.recipesapp.data.dots.NutritionDTO
import com.tasty.recipesapp.data.dots.RecipeDTO
import com.tasty.recipesapp.data.dots.UnitDTO
import com.tasty.recipesapp.data.models.ComponentsModel
import com.tasty.recipesapp.data.models.IngredientModel
import com.tasty.recipesapp.data.models.InstructionsModel
import com.tasty.recipesapp.data.models.MeasurementModel
import com.tasty.recipesapp.data.models.NutritionModel
import com.tasty.recipesapp.data.models.RecipeModel
import com.tasty.recipesapp.data.models.UnitModel
import com.tasty.recipesapp.database.RecipeDao
import org.json.JSONObject

class RecipeRepository(val recipeDao: RecipeDao) {
    val dummyDataRecipe =  """{

  "recipes": [ {
        "recipeID": 1,
  "name": "One-Pot Lemon Garlic Shrimp Pasta",
  "description": "This easy 30-minute pasta recipe transforms ingredients that you already have in your kitchen into a posh, seafood dish you’ll want to serve at your next dinner party. And since the whole dish is made in a single pot, clean-up is easy. Don’t be surprised if this becomes your favorite quick go-to.",
  "thumbnailUrl": "https://img.buzzfeed.com/video-api-prod/assets/9ee2dadcbfcb4095872e6cdbaa24ff14/Thumb_A_FB.jpg",
  "keywords": "pasta, shrimp, lemon, garlic",
  "isPublic": false,
  "userEmail": "someone@gmail.com",
  "originalVideoUrl": "https://s3.amazonaws.com/video-api-prod/assets/3de913d586424e189521e13eeee0222d/BFV10181_One-Pot_Lemon_Garlic_Shrimp_Pasta_FB1080SQ.mp4",
  "country": "US",
  "numServings": 4,
  "components": [
    {
      "rawText": "8 oz linguine",
      "extraComment": "",
      "ingredient": {
        "name": "linguine"
      },
      "measurement": {
        "quantity": "8",
        "unit": {
          "name": "ounce",
          "displaySingular": "oz",
          "displayPlural": "oz",
          "abbreviation": "oz"
        }
      },
      "position": 1
    },
    {
      "rawText": "2 Tbsp. olive oil",
      "extraComment": "",
      "ingredient": {
        "name": "olive oil"
      },
      "measurement": {
        "quantity": "2",
        "unit": {
          "name": "tablespoon",
          "displaySingular": "tablespoon",
          "displayPlural": "tablespoons",
          "abbreviation": "tbsp"
        }
      },
      "position": 2
    },
    {
      "rawText": "8 Tbsp. (1 stick) unsalted butter",
      "extraComment": "1 stick",
      "ingredient": {
        "name": "unsalted butter"
      },
      "measurement": {
        "quantity": "8",
        "unit": {
          "name": "tablespoon",
          "displaySingular": "tablespoon",
          "displayPlural": "tablespoons",
          "abbreviation": "tbsp"
        }
      },
      "position": 3
    }
  ],
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
  ],
  "nutrition": {
    "calories": 567,
    "protein": 31,
    "fat": 28,
    "carbohydrates": 44,
    "sugar": 1,
    "fiber": 2
  }},
  {
  "recipeID": 2,
  "name": "Pizza",
  "description": "pizza  easy 30-minute pasta recipe transforms ingredients that you already have in your kitchen into a posh, seafood dish you’ll want to serve at your next dinner party. And since the whole dish is made in a single pot, clean-up is easy. Don’t be surprised if this becomes your favorite quick go-to.",
  "thumbnailUrl": "https://upload.wikimedia.org/wikipedia/commons/b/ba/Flower_jtca001.jpg",
  "keywords": "pasta, shrimp, lemon, garlic",
  "isPublic": false,
  "userEmail": "someone@gmail.com",
  "originalVideoUrl": "https://s3.amazonaws.com/video-api-prod/assets/3de913d586424e189521e13eeee0222d/BFV10181_One-Pot_Lemon_Garlic_Shrimp_Pasta_FB1080SQ.mp4",
  "country": "US",
  "numServings": 4,
  "components": [
    {
      "rawText": "8 oz linguine",
      "extraComment": "",
      "ingredient": {
        "name": "linguine"
      },
      "measurement": {
        "quantity": "8",
        "unit": {
          "name": "ounce",
          "displaySingular": "oz",
          "displayPlural": "oz",
          "abbreviation": "oz"
        }
      },
      "position": 1
    },
    {
      "rawText": "2 Tbsp. olive oil",
      "extraComment": "",
      "ingredient": {
        "name": "olive oil"
      },
      "measurement": {
        "quantity": "2",
        "unit": {
          "name": "tablespoon",
          "displaySingular": "tablespoon",
          "displayPlural": "tablespoons",
          "abbreviation": "tbsp"
        }
      },
      "position": 2
    },
    {
      "rawText": "8 Tbsp. (1 stick) unsalted butter",
      "extraComment": "1 stick",
      "ingredient": {
        "name": "unsalted butter"
      },
      "measurement": {
        "quantity": "8",
        "unit": {
          "name": "tablespoon",
          "displaySingular": "tablespoon",
          "displayPlural": "tablespoons",
          "abbreviation": "tbsp"
        }
      },
      "position": 3
    }
  ],
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
  ],
  "nutrition": {
    "calories": 567,
    "protein": 31,
    "fat": 28,
    "carbohydrates": 44,
    "sugar": 1,
    "fiber": 2
  }}
]
}"""


    fun IngredientDTO.toModel(): IngredientModel {
        return IngredientModel(
          name = this.name
        )
     }
    fun InstructionsDTO.toModel(): InstructionsModel {
        return InstructionsModel(
            instructionID = this.instructionID,
            displayText = this.displayText,
            position=this.position)
    }

    fun UnitDTO.toModel(): UnitModel {
        return UnitModel(
            name = this.name,
            displaySingular= this.displaySingular,
            displayPlural= this.displayPlural,
            abbreviation = this.abbreviation
        )
    }

    fun MeasurementDTO.toModel(): MeasurementModel {
        return MeasurementModel(
            quantity = this.quantity,
            unit = this.unit

        )
    }





    fun ComponentsDTO.toMode(): ComponentsModel {
        return ComponentsModel(
            rawText =this.rawText,
            extraComment =this.extraComment,
            ingredient = this.ingredient,
            measurement = this.measurement,
            position =this.position

        )
    }





   fun NutritionDTO.toModel(): NutritionModel {
        return NutritionModel(
            calories=this.calories,
            protein=this.protein,
            fat=this.fat,
            carbohydrates=this.carbohydrates,
            sugar=this.sugar,
            fiber=this.fiber
        )

    }
    fun RecipeDTO.toModel(): RecipeModel {
        return RecipeModel(
           /* isFavorit=this.isFavorit?:false       */
            recipeID = this.recipeID,
            name = this.name,
            description = this.description,
            thumbnailUrl = this.thumbnailUrl,
            keywords =this.keywords,
            isFavourite = this.isFavourite?:false,
            isPublic =this.isPublic,
            userEmail = this.userEmail,
            originalVideoUrl =this.originalVideoUrl,
            country =this.country,
            numServings =this.numServings,
            components =this.components.map { it.toMode() },
            instructions = this.instructions.map { it.toModel() },
            nutrition = this.nutrition?.toModel()?:NutritionModel(0, 0, 0, 0, 0, 0)


        )
    }

    private fun List<RecipeDTO>.toModelList(): List<RecipeModel> {
      return this.map { it.toModel() }}


    suspend fun  loadRecipesDTOs():List<RecipeDTO>{
       /* val dbRecipes=recipeDao.getAllRecipes()
        val gson = Gson()
        var recipesList = listOf<RecipeDTO>()

        val jsonObject = JSONObject(dummyDataRecipe)
        val recipesArray = jsonObject.getJSONArray("recipes")
        val type = object : TypeToken<List<RecipeDTO>>() {}.type
        recipesList = gson.fromJson(recipesArray.toString(), type)
        Log.i("GSON", recipesList.toString())

        return recipesList     eddig dummy adatok*/

        val gson = Gson()
        return recipeDao.getAllRecipes().map {
            val jsonObject = JSONObject(it.json)
            jsonObject.apply { put("recipeID", it.internalId) }
            gson.fromJson(jsonObject.toString(), RecipeDTO::class.java)
        }





}

    suspend fun getRecipes()=loadRecipesDTOs().toModelList()
}