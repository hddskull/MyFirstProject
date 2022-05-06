package com.example.prakt6part27

import android.text.Editable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MessageViewModel: ViewModel() {
    val msg: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun SetAllStates( editText: Editable?, checkBox: String, toggle: String, radioGroup: String): String {
        msg.value = " EditText :${editText ?: ""} \n " +
                "CheckBox: ${checkBox} \n " +
                "Toggle: ${toggle} \n " +
                "RadioGroup: ${radioGroup}"

        return msg.value.toString()
    }
}