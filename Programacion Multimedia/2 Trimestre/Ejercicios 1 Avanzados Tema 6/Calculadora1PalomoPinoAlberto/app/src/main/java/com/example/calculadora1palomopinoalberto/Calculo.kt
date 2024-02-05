package com.example.calculadora1palomopinoalberto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Calculo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo)

        val calculo = findViewById<TextView>(R.id.calculo)
        val resultado: Int = intent.getIntExtra("EXTRA_RESULTADO", 0)
        Log.d("Calculo", "Resultado: $resultado")

        calculo.text = "Resultado = $resultado"
    }
}