package com.example.tema7ficheros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

class RetoAlmacentamiento : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reto_almacentamiento)  // Agregado el paréntesis aquí

        val btnCrearArchivo: Button = findViewById(R.id.btnCrearArchivo)
        val btnCrearArchivo2: Button = findViewById(R.id.btnCrearArchivo2)
        val btnLeerArchivo: Button = findViewById(R.id.btnLeerArchivo)
        val btnLeerArchivo2: Button = findViewById(R.id.btnLeerArchivo2)

        btnCrearArchivo.setOnClickListener {
            crearArchivo()
        }

        btnCrearArchivo2.setOnClickListener{
            crearArchivo2()
        }

        btnLeerArchivo.setOnClickListener{
            leerArchivo()
        }

        btnLeerArchivo2.setOnClickListener{
            leerArchivo2()
        }
    }

    private fun crearArchivo() {
        try {
            val fileName = "Bienvenido"
            val fileContent = "Hola que tal"

            var osw: OutputStreamWriter = OutputStreamWriter(openFileOutput(fileName, Context.MODE_PRIVATE))

            osw.write(fileContent)

            osw.flush() //limpiamos
            osw.close() //cerramos

            Log.d("Éxito", "Archivo creado con éxito!")
        } catch (e: Exception) {
            Log.e("Error", "Error al usar OutputStreamWriter: " + e.message)
        }
    }

    private fun crearArchivo2() {
        try {
            val fileName = "Adios"
            val fileContent = "Hasta luego"

            var osw: OutputStreamWriter = OutputStreamWriter(openFileOutput(fileName, Context.MODE_PRIVATE))

            osw.write(fileContent)

            osw.flush()
            osw.close()

            Log.d("Éxito", "Archivo creado con éxito!")
        } catch (e: Exception) {
            Log.e("Error", "Error al usar OutputStreamWriter: " + e.message)
        }
    }


    private fun leerArchivo() {
        try {
            val fileName = "Bienvenido"

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
            val fileName = "Adios"

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