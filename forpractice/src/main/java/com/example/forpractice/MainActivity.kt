package com.example.forpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val NCREATE  = "Activity CREATED"
    private val NSTART   = "Activity STARTED"
    private val NRESUME  = "Activity RESUME"
    private val NPAUSE   = "Activity PAUSED"
    private val NSTOP    = "Activity STOPPED"
    private val NRESTART = "Activity RESTARTED"
    private val NDESTROY = "Activity DESTROYED"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        var toast = Toast.makeText(this, NCREATE,Toast.LENGTH_SHORT)
        toast.show()
    }
    override fun onStart() {
        super.onStart()
        var toast = Toast.makeText(this, NSTART,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.LEFT, 0 ,0)
        toast.show()
    }
    override fun onResume() {
        super.onResume()
        var toast = Toast.makeText(this, NRESUME,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.TOP, 0 ,0)
        toast.show()
    }
    override fun onPause() {
        super.onPause()
        var toast = Toast.makeText(this, NPAUSE,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.RIGHT, 0 ,0)
        toast.show()
    }
    override fun onStop() {
        super.onStop()
        var toast = Toast.makeText(this, NSTOP,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER, 0 ,0)
        toast.show()
    }
    override fun onRestart() {
        super.onRestart()
        var toast = Toast.makeText(this, NRESTART,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL_HORIZONTAL, 0 ,0)
        toast.show()
    }
    override fun onDestroy() {
        super.onDestroy()
        var toast = Toast.makeText(this, NDESTROY,Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.FILL, 0 ,0)
        toast.show()
    }
}