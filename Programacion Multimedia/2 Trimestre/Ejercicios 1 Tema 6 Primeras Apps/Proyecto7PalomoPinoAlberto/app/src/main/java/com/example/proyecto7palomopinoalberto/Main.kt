package com.example.proyecto7palomopinoalberto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)
        val etApellidos = findViewById<AppCompatEditText>(R.id.etApellidos)
        val etCurso = findViewById<AppCompatEditText>(R.id.etCurso)
        val etAsignatura = findViewById<AppCompatEditText>(R.id.etAsignatura)
        val etNota = findViewById<AppCompatEditText>(R.id.etNota)

        btnStart.setOnClickListener {
            Log.d("Main", "Botón pulsado")
            try {
            val name = etName.text.toString()
            val apellidos = etApellidos.text.toString()
            val curso = etCurso.text.toString()
            val asignatura = etAsignatura.text.toString()
            val nota = etNota.text.toString()

            val intent = Intent(this, Result::class.java)

            if (name.isNotEmpty()) {
                intent.putExtra("EXTRA_NAME", name)
            }

            if (apellidos.isNotEmpty()) {
                intent.putExtra("EXTRA_APELLIDOS", apellidos)
            }

            if (curso.isNotEmpty()) {
                intent.putExtra("EXTRA_CURSO", curso)
            }

            if (asignatura.isNotEmpty()) {
                intent.putExtra("EXTRA_ASIGNATURA", asignatura)
            }

            if (nota.isNotEmpty()) {
                intent.putExtra("EXTRA_NOTA", nota)
            }

            startActivity(intent)

            } catch (e: Exception) {
                Log.e("Main", "Error al procesar el botón", e)
            }
        }
    }
}