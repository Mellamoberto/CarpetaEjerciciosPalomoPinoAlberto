package com.example.ejercicioscardviewbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import com.example.ejercicioscardviewbasicos.R

private lateinit var tvIngresos: TextView
private val incrementoDeIngresos = 100

class Cardview : AppCompatActivity() {
    private lateinit var tvIngresos: TextView
    private val incrementoDeIngresos = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cardview)

        val rangeSlider = findViewById<RangeSlider>(R.id.rsEdad)
        val tvAnos = findViewById<TextView>(R.id.tvAnos)
        val btnMayor = findViewById<FloatingActionButton>(R.id.btnMayor)
        val btnMenor = findViewById<FloatingActionButton>(R.id.btnMenor)
        tvIngresos = findViewById(R.id.tvIngresos)

        rangeSlider.addOnChangeListener { slider, value, fromUser ->
            tvAnos.text = "${value.toInt()} años"
        }

        btnMayor.setOnClickListener {
            aumentarIngresos()
        }

        btnMenor.setOnClickListener {
            disminuirIngresos()
        }
    }

    private fun aumentarIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual + incrementoDeIngresos

        if (nuevoValor <= Int.MAX_VALUE) {
            tvIngresos.text = nuevoValor.toString()
        }
    }

    private fun disminuirIngresos() {
        val valorActual = tvIngresos.text.toString().toInt()
        val nuevoValor = valorActual - incrementoDeIngresos

        if (nuevoValor >= 0) {
            tvIngresos.text = nuevoValor.toString()
        }
    }
}