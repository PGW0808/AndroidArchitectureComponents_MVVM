package com.kotlin_assignment.lifecyclemethods

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycle.addObserver(Observer())
        Log.d("Main", "Activity - On Create")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Main", "Activity - On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Main", "Activity - On Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Main", "Activity - On Destroy")
    }
}