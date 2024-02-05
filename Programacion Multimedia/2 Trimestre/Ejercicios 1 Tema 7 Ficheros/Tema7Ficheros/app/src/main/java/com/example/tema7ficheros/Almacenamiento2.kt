package com.example.tema7ficheros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class Almacenamiento2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almacenamiento2)

        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)
        val btnLeerArchivo2: Button = findViewById(R.id.btnLeerArchivo2)



        btnLeerArchivo.setOnClickListener{
            leerArchivo()
        }

        btnLeerArchivo2.setOnClickListener{
            leerArchivo2()
        }
    }


    private fun leerArchivo() {
        try {
            val fileName = "Alberto el grande"

            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            val texto = br.readLine()

            val textView: TextView = findViewById(R.id.textView)
            textView.setText(texto)

            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }

    private fun leerArchivo2() {
        try {
            val fileName = "Berto Estudiante"

            val br = BufferedReader(InputStreamReader(openFileInput(fileName)))

            val texto = br.readLine()

            val textView: TextView = findViewById(R.id.textView)
            textView.setText(texto)

            br.close()

            Log.d("Éxito", "Contenido del archivo: $texto")


        } catch (e: Exception) {
            Log.e("Error", "Error al leer el archivo: " + e.message)
        }
    }
}