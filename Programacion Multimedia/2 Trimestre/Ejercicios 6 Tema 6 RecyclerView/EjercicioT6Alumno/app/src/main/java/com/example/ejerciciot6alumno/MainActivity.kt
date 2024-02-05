package com.example.ejerciciot6alumno

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val alumnoList = generatealumnoList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val alumnoAdapter = alumnoAdapter(alumnoList)
        recyclerView.adapter = alumnoAdapter
    }

    private fun generatealumnoList(): List<Alumno> {
        return listOf(
            Alumno("Alberto", "Palomo", "Matematicas", 6.5f),
            Alumno("Juan", "Fernandez", "Matematicas", 6.5f),
            Alumno("Eva", "Fernandez", "Matematicas", 6.5f),
            Alumno("Alberto", "Fernandez", "Matematicas", 6.5f),
            Alumno("Laura", "Fernandez", "Matematicas", 6.5f),
            Alumno("Cristina", "Fernandez", "Matematicas", 6.5f),
            Alumno("Isabel", "Fernandez", "Matematicas", 6.5f),
            Alumno("Pedro", "Fernandez", "Matematicas", 6.5f),
            Alumno("Jose", "Fernandez", "Matematicas", 6.5f),
            Alumno("Manuel", "Fernandez", "Matematicas", 6.5f),
            Alumno("Diana", "Fernandez", "Matematicas", 6.5f),

            )
    }
}