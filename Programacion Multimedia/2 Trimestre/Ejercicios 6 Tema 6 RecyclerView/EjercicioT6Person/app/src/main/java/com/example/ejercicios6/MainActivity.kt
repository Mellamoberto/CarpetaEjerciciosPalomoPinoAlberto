package com.example.ejercicios6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personList = generatePersonList()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val personAdapter = PersonAdapter(personList)
        recyclerView.adapter = personAdapter
    }

    private fun generatePersonList(): List<Person> {
        return listOf(
            Person("Alberto", "Palomo", "Calle Nº1", "Malaga"),
            Person("Juan", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Eva", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Alberto", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Laura", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Cristina", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Isabel", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Pedro", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Jose", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Manuel", "Fernandez", "Calle Nº1", "Malaga"),
            Person("Diana", "Fernandez", "Calle Nº1", "Malaga"),

            )
    }
}
