package com.kotlin_assignment.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.kotlin_assignment.bindingadapter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("Introduction to Kotlin",
        "Fantastic MVVM Architecture.",
        "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/5952bfa6-4594-4d7c-bee6-0b5a3988a099/dapn32z-2a11b870-38b2-4caf-ba16-5bbe9a84fe7f.png/v1/fill/w_200,h_200/moonlight_deer___200x200_pixelart_by_fluffzee_dapn32z-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MjAwIiwicGF0aCI6IlwvZlwvNTk1MmJmYTYtNDU5NC00ZDdjLWJlZTYtMGI1YTM5ODhhMDk5XC9kYXBuMzJ6LTJhMTFiODcwLTM4YjItNGNhZi1iYTE2LTViYmU5YTg0ZmU3Zi5wbmciLCJ3aWR0aCI6Ijw9MjAwIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmltYWdlLm9wZXJhdGlvbnMiXX0.I_VOD6bLzAvJkUU5cpv5P9uwFX1pxaoiKUw702oCSBw")

        binding.post = post
    }
}