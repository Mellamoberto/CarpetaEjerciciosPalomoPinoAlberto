package com.example.simulacro2trimestre

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

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etApellidos = findViewById<EditText>(R.id.etApellidos)
        val etDireccion = findViewById<EditText>(R.id.etDireccion)
        val etCp = findViewById<EditText>(R.id.etCp)
        val etCiudad = findViewById<EditText>(R.id.etCiudad)
        val etProvincia = findViewById<EditText>(R.id.etProvincia)
        val etTelefono = findViewById<EditText>(R.id.etTelefono)
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        val btnMostrar = findViewById<Button>(R.id.btnMostrar)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)
        val tvMuestraNombre = findViewById<TextView>(R.id.tvMuestraNombre)


        btnAgregar.setOnClickListener {
            val nombre = etNombre.text.toString()
            val apellidos = etApellidos.text.toString()
            val direccion = etDireccion.text.toString()
            val cp = etCp.text.toString().toInt()
            val ciudad = etCiudad.text.toString()
            val provincia = etProvincia.text.toString()
            val telefono = etTelefono.text.toString()
            dataManager.addData(nombre, apellidos, direccion, cp, ciudad, provincia,
                telefono)
            Toast.makeText(this, "Se agregó a la base de datos todos los valores de: $nombre, $apellidos,$direccion, $cp, $ciudad, $provincia, $telefono", Toast.LENGTH_SHORT).show()
            etNombre.text.clear()
            etApellidos.text.clear()
            etDireccion.text.clear()
            etCp.text.clear()
            etCiudad.text.clear()
            etProvincia.text.clear()
            etTelefono.text.clear()
        }


        btnMostrar.setOnClickListener {
            val data = dataManager.getAllData(this)
            tvMuestraNombre.text = data
        }

        btnBorrar.setOnClickListener {
            dataManager.deleteAllData(this)
            Toast.makeText(this, "Se eliminaron todos los datos de la base de datos", Toast.LENGTH_SHORT).show()
            etNombre.text.clear()
        }

    }
}