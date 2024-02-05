package com.example.ejerciciociclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Ciclo de vida", "MainActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de vida", "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida", "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida", "MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida", "MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida", "MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida", "MainActivity - onDestroy")
    }

    fun goToSecondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}