package com.example.prakt5

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    val number = MutableLiveData<String>()

    fun onRandomClicked() {
        RandomNumber.setNumber()
        number.value = RandomNumber.getNumber()
    }
}