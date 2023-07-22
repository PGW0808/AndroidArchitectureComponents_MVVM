package com.kotlin_assignment.beforeviewmodel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    lateinit var txtCounter : TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCounter = findViewById(R.id.txtCounter)
        setText()

    }

    fun increment(v: View){
        count++
        setText()
    }

    private fun setText() {
        txtCounter.text = count.toString()
    }
}