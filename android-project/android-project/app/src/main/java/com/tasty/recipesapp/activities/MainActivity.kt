///recept

package com.tasty.recipesapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import com.tasty.recipesapp.R
import com.tasty.recipesapp.databinding.ActivityMainBinding
import com.tasty.recipesapp.providers.RepositoryProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        RepositoryProvider.initialize(applicationContext)
        val navControler =findNavController(R.id.fragmentId)
        binding.bottomnavID.setOnItemSelectedListener {
            Log.i("Menu", "Clicked")
            when(it.itemId){
                R.id.homeFragment->navControler.navigate(R.id.homeFragment)
                R.id.profileFragment->navControler.navigate(R.id.profileFragment)
                R.id.recipesFragment->navControler.navigate(R.id.recipesFragment)

            }
            true

        }

    //SetContentView(R. el is lehet, de vagy ez vagy az



        ///// sikrrtelen  uzenetatadas////////
        //val message = intent.getStringExtra("key")
      //  binding.mainText.text=message?:"nincs  uzenet"
    }
}