package com.example.cardviewfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider

class Main : AppCompatActivity() {
    private lateinit var tvIngresos: TextView
    private val incrementoDeIngresos = 100
    private lateinit var opcionSeleccionada: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rangeSlider = findViewById<RangeSlider>(R.id.rsEdad)
        val tvAnos = findViewById<TextView>(R.id.tvAnos)
        val btnMayor = findViewById<FloatingActionButton>(R.id.btnMayor)
        val btnMenor = findViewById<FloatingActionButton>(R.id.btnMenor)
        tvIngresos = findViewById(R.id.tvIngresos)
        val btnAceptar = findViewById<Button>(R.id.btnAceptar)
        val cardView1: CardView =findViewById<CardView>(R.id.cardView1)
        val cardView2: CardView =findViewById<CardView>(R.id.cardView2)
        val cardView3: CardView =findViewById<CardView>(R.id.cardView3)
        val cardView4: CardView =findViewById<CardView>(R.id.cardView4)

        rangeSlider.addOnChangeListener { slider, value, fromUser ->
            tvAnos.text = "${value.toInt()} años"
        }

        btnMayor.setOnClickListener {
            aumentarIngresos()
        }

        btnMenor.setOnClickListener {
            disminuirIngresos()
        }

        cardView1.setOnClickListener {
            handleCardViewClick(cardView1)
        }

        cardView2.setOnClickListener {
            handleCardViewClick(cardView2)
        }

        cardView3.setOnClickListener {
            handleCardViewClick(cardView3)
        }

        cardView4.setOnClickListener {
            handleCardViewClick(cardView4)
        }

        btnAceptar.setOnClickListener {
            val ingresos = tvIngresos.text.toString().toInt()
            val edad = rangeSlider.values[0].toInt()

            val intent = Intent(this, Resultado::class.java)

            intent.putExtra("ingresos", ingresos)
            intent.putExtra("edad", edad)
            intent.putExtra("opcionSeleccionada", opcionSeleccionada)

            startActivity(intent)
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

    private fun handleCardViewClick(cardView: CardView) {
        when (cardView.id) {
            R.id.cardView1 -> {
                println("Se ha pulsado cardView1")
                Log.d( " CardView1","has pulsado cardView1")
                opcionSeleccionada="CardView1 elegida"
            }
            R.id.cardView2 -> {
                println("Se ha pulsado cardView2")
                Log.d( " CardView2","has pulsado cardView2")
                opcionSeleccionada="CardView2 elegida"
            }

            R.id.cardView3 -> {
                println("Se ha pulsado cardView3")
                Log.d( " CardView3","has pulsado cardView3")
                opcionSeleccionada="CardView3 elegida"
            }

            R.id.cardView4 -> {
                println("Se ha pulsado cardView4")
                Log.d( " CardView4","has pulsado cardView4")
                opcionSeleccionada="CardView4 elegida"
            }
        }
    }
}