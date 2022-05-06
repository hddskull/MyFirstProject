package com.example.prakt6part27

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.lifecycle.ViewModelProvider
import com.example.prakt6part27.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bind: ActivityMainBinding
    private lateinit var viewModel: MessageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(bind.root)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(MessageViewModel::class.java)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        bind.button.setOnClickListener {
            val editText: Editable? = bind.editText.text
            val checkBox: String = if (bind.checkBox.isChecked) "On" else "Off"
            val toggleButton: String = if (bind.toggleButton.isChecked) "On" else "Off"
            val radioGroupText = if (bind.radioButton.isChecked) "RadioButton 1" else "RadioButton"
            viewModel.SetAllStates(editText, checkBox, toggleButton, radioGroupText)
        }
        viewModel.msg.observe(this, {bind.solution.text = it.toString()})
    }
}