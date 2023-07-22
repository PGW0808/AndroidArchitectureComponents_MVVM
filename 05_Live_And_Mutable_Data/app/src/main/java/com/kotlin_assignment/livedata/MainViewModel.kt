package com.kotlin_assignment.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
   private val factsLiveDataObject = MutableLiveData<String>("Coming from Live Data.")

    val factsLiveData : LiveData<String>
        get() = factsLiveDataObject


    fun updateLiveData(){
        factsLiveDataObject.value = "Another Fact"
    }
}