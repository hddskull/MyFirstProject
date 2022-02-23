package com.example.forpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        showMessage("I created")
    }

    override fun onPause() {
        super.onPause()
        showMessage("I paused")
    }

    override fun onStart() {
        super.onStart()
        showMessage("I started")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("I restarted")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("I destroyed")
    }

    private val TAG = "condition"

    fun showMessage(s: String){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()
        Log.d(TAG, s)
    }
}