package com.example.retoimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.slider.RangeSlider
import java.text.DecimalFormat

class CalculatorIMC : AppCompatActivity() {

    private var hombreEsSeleccionado: Boolean = true
    private var mujerEsSeleccionada: Boolean = true
    private var edadActual: Int = 30
    private var pesoActual: Int= 70
    private var alturaActual: Int= 120

    private lateinit var cardViewHombre: CardView
    private lateinit var cardViewMujer: CardView
    private lateinit var tuAltura: TextView
    private lateinit var rsAltura: RangeSlider
    private lateinit var cardViewPeso: CardView
    private lateinit var cardViewEdad: CardView
    private lateinit var btnMenorPeso: FloatingActionButton
    private lateinit var btnMayorPeso: FloatingActionButton
    private lateinit var btnMenorEdad: FloatingActionButton
    private lateinit var btnMayorEdad: FloatingActionButton
    private lateinit var tuPeso: TextView
    private lateinit var tuEdad: TextView
    private lateinit var btnAceptar: Button


    companion object{
        const val IMC_KEY = "IMC_RESULT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_imc)
        initComponents()
        initListeners()
        initUI()
    }

    private fun initComponents() {
        cardViewHombre = findViewById(R.id.cardViewMan)
        cardViewMujer = findViewById(R.id.cardViewWoman)
        tuAltura = findViewById(R.id.tuAltura)
        rsAltura = findViewById(R.id.rsAltura)
        cardViewPeso = findViewById(R.id.cardViewWeight)
        cardViewEdad = findViewById(R.id.cardViewEdad)
        btnMenorPeso = findViewById(R.id.btnMenorPeso)
        btnMayorPeso = findViewById(R.id.btnMayorPeso)
        btnMenorEdad = findViewById(R.id.btnMenorEdad)
        btnMayorEdad = findViewById(R.id.btnMayorEdad)
        tuPeso = findViewById(R.id.tuPeso)
        tuEdad = findViewById(R.id.tuEdad)
        btnAceptar = findViewById(R.id.btnAceptar)
    }

    private fun initListeners() {
        cardViewHombre.setOnClickListener{
            changeGender()
            setGenderColor()
        }
        cardViewMujer.setOnClickListener(){
            changeGender()
            setGenderColor()
        }
        rsAltura.addOnChangeListener{ _, value, _ ->
            val df = DecimalFormat("#.##")
            alturaActual = df.format(value).toInt()
            tuAltura.text = "$alturaActual cm"
        }
        btnMayorPeso.setOnClickListener{
            pesoActual += 1
            setWeight()
        }
        btnMenorPeso.setOnClickListener{
            pesoActual -= 1
            setWeight()
        }
        btnMayorEdad.setOnClickListener{
            edadActual += 1
            setEdad()
        }
        btnMenorEdad.setOnClickListener{
            edadActual -= 1
            setEdad()
        }
        btnAceptar.setOnClickListener {
            val resultado = calcularIMC()

            navigateToResult(resultado)
        }
    }

    private fun navigateToResult(result: Double) {
        val intent = Intent(this, Resultado::class.java)
        intent.putExtra(CalculatorIMC.IMC_KEY, result)
        startActivity(intent)
    }

    private fun calcularIMC():Double {
        val df = DecimalFormat("#.##")
        val imc = pesoActual / (alturaActual.toDouble() / 100 * alturaActual.toDouble()/100)
        return df.format(imc).toDouble()
    }

    private fun setWeight(){
        tuPeso.text = pesoActual.toString()
    }

    private fun setEdad(){
        tuEdad.text = edadActual.toString()
    }

    private fun changeGender() {
        hombreEsSeleccionado = !hombreEsSeleccionado
        mujerEsSeleccionada = !mujerEsSeleccionada
    }

    private fun setGenderColor(){
        cardViewHombre.setCardBackgroundColor(getBackGroundColor(hombreEsSeleccionado))
        cardViewMujer.setCardBackgroundColor(getBackGroundColor(mujerEsSeleccionada))
    }

    private fun getBackGroundColor(isSelectedComponent: Boolean): Int {
        val colorReference = if (isSelectedComponent){
            R.color.background_component_selected
        }else {
            R.color.background_component
        }

        return ContextCompat.getColor(this,colorReference)
    }

    private fun initUI(){
        setGenderColor()
        setWeight()
    }
}