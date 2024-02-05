package com.example.retoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.retoimc.CalculatorIMC.Companion.IMC_KEY

class Resultado : AppCompatActivity() {
    
    private lateinit var tuResultado: TextView
    private lateinit var tuIMC:TextView
    private lateinit var tuDescripcion:TextView
    private lateinit var btnRecalcular:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)
        val result:Double = intent.extras?.getDouble(IMC_KEY) ?: -1.0
        initComponents()
        initUI(result)
        initListeners()
    }
    
    private fun initListeners(){
        btnRecalcular.setOnClickListener{}
    }
    
    private fun initUI(result: Double) {
        tuIMC.text = result.toString()
        when (result) {
            in 0.00..18.50 -> { //Bajo peso
                tuResultado.text = getString(R.string.title_bajo_peso)
                tuResultado.setTextColor(ContextCompat.getColor(this, R.color.peso_bajo))
                tuDescripcion.text = getString(R.string.description_bajo_peso)
            }

            in 18.51..24.99 -> { //Peso normal
                tuResultado.text = getString(R.string.title_peso_normal)
                tuResultado.setTextColor(ContextCompat.getColor(this, R.color.peso_normal))
                tuDescripcion.text = getString(R.string.description_peso_normal)
            }

            in 25.00..29.99 -> { //Sobrepeso
                tuResultado.text = getString(R.string.title_sobrepeso)
                tuResultado.setTextColor(ContextCompat.getColor(this, R.color.peso_sobrepeso))
                tuDescripcion.text = getString(R.string.description_sobrepeso)
            }

            in 30.00..99.00 -> { //Obesidad
                tuResultado.text = getString(R.string.title_obesidad)
                tuResultado.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tuDescripcion.text = getString(R.string.description_obesidad)
            }

            else -> {//error
                tuIMC.text = getString(R.string.error)
                tuResultado.text = getString(R.string.error)
                tuResultado.setTextColor(ContextCompat.getColor(this, R.color.obesidad))
                tuDescripcion.text = getString(R.string.error)
            }
        }
    }
    private fun initComponents() {
        tuIMC = findViewById(R.id.tuIMC)
        tuResultado = findViewById(R.id.tuResultado)
        tuDescripcion = findViewById(R.id.tuDescripcion)
        btnRecalcular = findViewById(R.id.btnRecalcular)
    }
}