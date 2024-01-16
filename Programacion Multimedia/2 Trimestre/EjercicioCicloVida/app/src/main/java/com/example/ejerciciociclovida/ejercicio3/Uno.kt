package com.example.ejerciciociclovida.ejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ejerciciociclovida.R
import android.content.Intent
import android.util.Log
import android.view.View

class Uno : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uno)
        Log.d("Uno", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Uno", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Uno", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Uno", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Uno", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Uno", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Uno", "onDestroy")
    }

    fun irPantallaDos(view: View) {
        val intent = Intent(this, Dos::class.java)
        startActivity(intent)
    }
}