package com.example.prakt6part28

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SolutionModelView: ViewModel() {
    val res: MutableLiveData<String> by lazy { MutableLiveData<String>() }

    fun setValue(a: Int, b: Int, c: Int, task: String) {
        when (task) {
            "Сумма длин ребер" -> {
                res.value = ((a * 4) + (b * 4) + (c * 4)).toString()
            }
            "Площадь поверхности" -> {
                res.value = (2 * (a * b + a * c + b * c)).toString()
            }
            "Объем"-> {
                res.value = (a * b * c).toString()
            }
        }
    }

    fun showError() {
        res.value = "Ошибка ввода"
    }

    fun getSolution(): String {
        return res.value.toString()
    }
}