package com.tasty.recipesapp.activities
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.tasty.recipesapp.R
import com.tasty.recipesapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    val TAG = "SplashScreenActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        enableEdgeToEdge()
        val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root) //SetContentView(R. el is lehet, de vagy ez vagy az

        binding.startButton.setOnClickListener{
            Log.i(TAG, "Start button clicked")
            binding.TextView.text = "Start button clicked!"
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("message", "Hello from Splash!")
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "OnStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "OnRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "OnDestroy")
    }



}