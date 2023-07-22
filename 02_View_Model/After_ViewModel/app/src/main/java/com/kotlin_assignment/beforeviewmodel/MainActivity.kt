package com.kotlin_assignment.beforeviewmodel

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    var count: Int = 0
    lateinit var txtCounter : TextView
    lateinit var mainViewModel :MainViewModel

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        txtCounter = findViewById(R.id.txtCounter)
        setText()

    }

   fun increment(v :View){
       mainViewModel.increment()
       setText()
   }

    private fun setText() {
        txtCounter.text = mainViewModel.count.toString()
    }
}