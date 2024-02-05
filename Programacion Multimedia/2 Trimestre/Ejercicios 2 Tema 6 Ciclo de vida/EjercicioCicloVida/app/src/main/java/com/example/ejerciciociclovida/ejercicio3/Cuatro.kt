package com.example.ejerciciociclovida.ejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.ejerciciociclovida.R

class Cuatro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuatro)
        Log.d("Cuatro", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Cuatro", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Cuatro", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Cuatro", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Cuatro", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Cuatro", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Cuatro", "onDestroy")
    }

    fun irPantallaUno(view: View) {
        val intent = Intent(this, Uno::class.java)
        startActivity(intent)
    }
}