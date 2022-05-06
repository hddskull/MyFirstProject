package com.example.prakt6part28

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: SolutionModelView
    private lateinit var arq: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val provider = ViewModelProvider(this)
        viewModel = provider.get(SolutionModelView::class.java)
        val button = findViewById<Button>(R.id.getSolution)
        val task = resources.getStringArray(R.array.task)
        val solution = findViewById<TextView>(R.id.solution)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, task)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when {
                    task[p2].toString() == "Сумма длин ребер" -> {
                        arq = "Сумма длин ребер"
                    }
                    task[p2].toString() == "Площадь поверхности" -> {
                        arq = "Площадь поверхности"
                    }
                    task[p2].toString() == "Объем" -> {
                        arq = "Объем"
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                solution.text = "abobus"
            }
        }
        button.setOnClickListener {
            val a = findViewById<EditText>(R.id.sideA)
            val b = findViewById<EditText>(R.id.sideB)
            val c = findViewById<EditText>(R.id.sideC)
            when {
                a.text.trim().isNotEmpty() and b.text.trim().isNotEmpty() and c.text.trim().isNotEmpty() -> {
                    val valueA = a.text.toString().toInt()
                    val valueB = b.text.toString().toInt()
                    val valueC = c.text.toString().toInt()
                    viewModel.setValue(valueA, valueB, valueC, arq).toString()
                }
                else -> {
                    viewModel.showError()
                }
            }
        }
        viewModel.res.observe(this, Observer { solution.text = viewModel.getSolution() })
    }
}

