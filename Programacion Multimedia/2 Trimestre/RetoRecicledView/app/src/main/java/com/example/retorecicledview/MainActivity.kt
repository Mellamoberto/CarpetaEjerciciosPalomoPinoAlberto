package com.example.retorecicledview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

val trabajos = listOf(
    Trabajos("Programacion", listOf(Subject("Programador en Android"),
        Subject("Gestor de BBDD"), Subject("Programador en Java"))),
    Trabajos("Diseño Web", listOf(Subject("Especialista en WordPress"),
        Subject("Tecnico en Java Script"), Subject("Especialista en PHP"))),
    Trabajos("Marketing digital", listOf(Subject("Especialista en SEO"),
        Subject("Tecnico en SEM"), Subject("Especialista en Redes Sociales")))

)

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerViewTrabajos: RecyclerView = findViewById(R.id.recyclerViewTrabajos)
        recyclerViewTrabajos.layoutManager = LinearLayoutManager(this)
        recyclerViewTrabajos.adapter = TrabajosAdapter(trabajos) { course ->
            showSubjectsDialog(course)
        }
    }

    private fun showSubjectsDialog(trabajos: Trabajos) {
        val subjects = trabajos.subjects.map { it.name }.toTypedArray()

        AlertDialog.Builder(this)
            .setTitle("Asignaturas de ${trabajos.name}")
            .setItems(subjects) { _, _ ->
                // Acción al hacer clic en una asignatura (puedes implementar algo aquí)
            }
            .setPositiveButton("Aceptar") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
}