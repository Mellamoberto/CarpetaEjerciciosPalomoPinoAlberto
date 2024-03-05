package com.example.datospersonales

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var dataManager: DataManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataManager = DataManager(this)

        val etId = findViewById<EditText>(R.id.etId)
        val etTitulo = findViewById<EditText>(R.id.etTitulo)
        val etAutor = findViewById<EditText>(R.id.etAutor)
        val etGenero = findViewById<EditText>(R.id.etGenero)
        val etEditorial = findViewById<EditText>(R.id.etEditorial)
        val etAnio = findViewById<EditText>(R.id.etAnio)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)


        btnAgregar.setOnClickListener {
            val id = etId.text.toString().toInt()
            val titulo = etTitulo.text.toString()
            val autor = etAutor.text.toString()
            val genero = etGenero.text.toString()
            val editorial = etEditorial.text.toString()
            val anio = etAnio.text.toString().toInt()
            dataManager.addData(id, titulo, autor, genero, editorial, anio)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $id, $titulo,$autor, $genero, $editorial, $anio", Toast.LENGTH_SHORT).show()
            etId.text.clear()
            etTitulo.text.clear()
            etAutor.text.clear()
            etGenero.text.clear()
            etEditorial.text.clear()
            etAnio.text.clear()
        }


        btnMostrar.setOnClickListener {
            val data = dataManager.getAllData(this)
            tvMuestraNombre.text = data
        }

        btnBorrar.setOnClickListener {
            dataManager.deleteAllData(this)
            Toast.makeText(this, "Se eliminaron todos los datos de la base de datos", Toast.LENGTH_SHORT).show()
            etId.text.clear()
        }

    }
}