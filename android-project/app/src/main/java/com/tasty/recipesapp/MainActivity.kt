package com.tasty.recipesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tasty.recipesapp.databinding.ActivityMainBinding
import com.tasty.recipesapp.databinding.ActivitySplashScreenBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) //SetContentView(R. el is lehet, de vagy ez vagy az
        val message = intent.getStringExtra("key")
        binding.mainText.text=message?:"nincs  uzenet"
    }
}