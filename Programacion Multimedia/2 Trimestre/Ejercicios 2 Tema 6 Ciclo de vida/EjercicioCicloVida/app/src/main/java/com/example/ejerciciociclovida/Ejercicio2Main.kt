package com.example.ejerciciociclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.util.Log
import android.view.View

class Ejercicio2Main : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_main)
        Log.d("Ejercicio2Main", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ejercicio2Main", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ejercicio2Main", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ejercicio2Main", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ejercicio2Main", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ejercicio2Main", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ejercicio2Main", "onDestroy")
    }

    fun irPantallaSecundaria(view: View) {
        val intent = Intent(this, Ejercicio2Secondary::class.java)
        startActivity(intent)
    }
}