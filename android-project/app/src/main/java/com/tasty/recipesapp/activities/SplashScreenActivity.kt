package com.tasty.recipesapp.activities
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.tasty.recipesapp.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    val TAG = "SplashScreenActivity"
    val SPLASH_TIME_OUT=3000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")
        enableEdgeToEdge()
        val binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root) //SetContentView(R. el is lehet, de vagy ez vagy az
//
//        binding.startButton.setOnClickListener{
//            //ha megnyomjuk  gombot
//            Log.i(TAG, "Start button clicked")
////            binding.TextView.text = "Start button clicked!"
//              val intent = Intent(this, MainActivity::class.java)
//              intent.putExtra("key", binding.textView.text)
//              startActivity(intent)
//            finish()
//        }
        // Use a HandlerThread to create a background thread
        val handlerThread = HandlerThread("SplashHandlerThread", -10)
        handlerThread.start() // Create a Handler on the new HandlerThread
        val handler = Handler(handlerThread.looper)
        handler.postDelayed({
// Navigate to MainActivity after the delay
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() },
            SPLASH_TIME_OUT)


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