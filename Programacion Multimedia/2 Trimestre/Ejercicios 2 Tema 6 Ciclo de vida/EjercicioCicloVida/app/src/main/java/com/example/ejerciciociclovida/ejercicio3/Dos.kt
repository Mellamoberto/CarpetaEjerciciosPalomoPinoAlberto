package com.example.ejerciciociclovida.ejercicio3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.ejerciciociclovida.R

class Dos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dos)
        Log.d("Dos", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Dos", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Dos", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Dos", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Dos", "onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Dos", "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Dos", "onDestroy")
    }

    fun irPantallaTres(view: View) {
        val intent = Intent(this, Tres::class.java)
        startActivity(intent)
    }
}