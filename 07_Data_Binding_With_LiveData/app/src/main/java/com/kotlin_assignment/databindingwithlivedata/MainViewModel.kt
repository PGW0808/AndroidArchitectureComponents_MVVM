package com.kotlin_assignment.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    var quoteLiveData = MutableLiveData("What you give is what you get")
            fun updateQuote(){
                quoteLiveData.value = "You'll see it when you believe it."
            }
}