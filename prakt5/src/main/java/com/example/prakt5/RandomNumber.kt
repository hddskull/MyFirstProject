package com.example.prakt5

object RandomNumber {
    private var number: String = "-"

    fun setNumber() {
        number = (0..50).random().toString()
    }

    fun getNumber(): String {
        return number
    }
}