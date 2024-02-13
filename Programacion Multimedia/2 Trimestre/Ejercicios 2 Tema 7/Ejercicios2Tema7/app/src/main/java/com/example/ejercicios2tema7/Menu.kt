package com.example.ejercicios2tema7

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val boton1 = findViewById<Button>(R.id.btn1)
        val boton2 = findViewById<Button>(R.id.btn2)
        val boton3 = findViewById<Button>(R.id.btn3)

        boton1.setOnClickListener {
            val intent = Intent(this, com.example.ejercicios2tema7.ejercicio1.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton2.setOnClickListener {
            val intent = Intent(this, com.example.ejercicios2tema7.ejercicio2.MainActivity::class.java)
            startActivity(intent)
        } // btn

        boton3.setOnClickListener {
            val intent = Intent(this, com.example.ejercicios2tema7.ejercicio3.MainActivity::class.java)
            startActivity(intent)
        } // btn


    } // fun
} // class