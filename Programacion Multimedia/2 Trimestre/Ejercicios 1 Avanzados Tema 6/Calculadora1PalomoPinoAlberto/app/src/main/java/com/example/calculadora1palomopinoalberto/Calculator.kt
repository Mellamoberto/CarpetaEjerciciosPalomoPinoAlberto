package com.example.calculadora1palomopinoalberto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import android.content.Intent

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        val btnSumar = findViewById<AppCompatButton>(R.id.btnSumar)
        val btnRestar = findViewById<AppCompatButton>(R.id.btnRestar)
        val btnMultiplicar = findViewById<AppCompatButton>(R.id.btnMultiplicar)
        val btnDividir = findViewById<AppCompatButton>(R.id.btnDividir)
        val etOperator1 = findViewById<AppCompatEditText>(R.id.etOperator1)
        val etOperator2 = findViewById<AppCompatEditText>(R.id.etOperator2)


        btnSumar.setOnClickListener{
            val num1String = etOperator1.text.toString()
            val num2String = etOperator2.text.toString()

            if(num1String.isNotEmpty() && num2String.isNotEmpty()){
                val num1 = num1String.toInt()
                val num2 = num2String.toInt()
                val suma = num1 + num2

                val intent = Intent(this, Calculo::class.java)
                intent.putExtra("EXTRA_RESULTADO", suma)
                startActivity(intent)
            }
        }

        btnRestar.setOnClickListener{
            val num1String = etOperator1.text.toString()
            val num2String = etOperator2.text.toString()

            if(num1String.isNotEmpty() && num2String.isNotEmpty()){
                val num1 = num1String.toInt()
                val num2 = num2String.toInt()
                val resta = num1 - num2

                val intent = Intent(this, Calculo::class.java)
                intent.putExtra("EXTRA_RESULTADO", resta)
                startActivity(intent)
            }
        }

        btnMultiplicar.setOnClickListener{
            val num1String = etOperator1.text.toString()
            val num2String = etOperator2.text.toString()

            if(num1String.isNotEmpty() && num2String.isNotEmpty()){
                val num1 = num1String.toInt()
                val num2 = num2String.toInt()
                val multi = num1 * num2

                val intent = Intent(this, Calculo::class.java)
                intent.putExtra("EXTRA_RESULTADO", multi)
                startActivity(intent)
            }
        }

        btnDividir.setOnClickListener{
            val num1String = etOperator1.text.toString()
            val num2String = etOperator2.text.toString()

            if(num1String.isNotEmpty() && num2String.isNotEmpty()){
                val num1 = num1String.toInt()
                val num2 = num2String.toInt()
                val division = num1/num2

                val intent = Intent(this, Calculo::class.java)
                intent.putExtra("EXTRA_RESULTADO", division)
                startActivity(intent)
            }
        }
    }
}