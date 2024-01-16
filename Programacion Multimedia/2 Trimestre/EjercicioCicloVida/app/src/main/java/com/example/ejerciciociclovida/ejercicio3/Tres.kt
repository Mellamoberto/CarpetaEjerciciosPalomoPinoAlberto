package com.example.ejerciciociclovida.ejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.ejerciciociclovida.R

class Tres : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tres)
        Log.d("Tres", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Tres", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Tres", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Tres", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Tres", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Tres", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Tres", "onDestroy")
    }

    fun irPantallaCuatro(view: View) {
        val intent = Intent(this, Cuatro::class.java)
        startActivity(intent)
    }
}