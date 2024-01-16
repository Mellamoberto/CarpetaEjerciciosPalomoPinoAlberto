package com.example.ejerciciociclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class Ejercicio2Secondary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio2_secondary)
        Log.d("Ejercicio2Secondary", "onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d("Ejercicio2Secondary", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ejercicio2Secondary", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ejercicio2Secondary", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ejercicio2Secondary", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ejercicio2Secondary", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ejercicio2Secondary", "onDestroy")
    }

    fun regresarMain(view: View) {
        finish()
    }
}