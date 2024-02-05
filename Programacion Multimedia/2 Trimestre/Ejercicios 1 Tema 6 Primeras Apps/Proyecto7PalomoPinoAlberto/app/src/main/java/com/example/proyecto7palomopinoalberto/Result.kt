package com.example.proyecto7palomopinoalberto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.util.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult=findViewById<TextView>(R.id.tvResult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        val apellidos: String = intent.extras?.getString("EXTRA_APELLIDOS").orEmpty()
        val curso: String = intent.extras?.getString("EXTRA_CURSO").orEmpty()
        val asignatura: String = intent.extras?.getString("EXTRA_ASIGNATURA").orEmpty()
        val nota: String = intent.extras?.getString("EXTRA_NOTA").orEmpty()

        Log.d("Result", "Nombre: $name")
        Log.d("Result", "Apellidos: $apellidos")
        Log.d("Result", "Curso: $curso")
        Log.d("Result", "Asignatura: $asignatura")
        Log.d("Result", "Nota: $nota")

        tvResult.text = "\t     Hola $name" +
                "\nDetalles" +
                "\nApellidos: $apellidos" +
                "\nCurso: $curso" +
                "\nAsignatura: $asignatura" +
                "\nNota: $nota"
    }
}