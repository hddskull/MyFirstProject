package com.example.prakt5

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val provider = ViewModelProvider(this)
        viewModel = provider.get(MainViewModel::class.java)
        rndNum.setText("-")
        observeViewModel()

        initView()
    }

    fun observeViewModel() {
        viewModel.number.observe(this, Observer {
            rndNum.setText(it)
        })
    }

    fun initView() {
        getRnd.setOnClickListener {
            viewModel.onRandomClicked()
        }
    }
}
