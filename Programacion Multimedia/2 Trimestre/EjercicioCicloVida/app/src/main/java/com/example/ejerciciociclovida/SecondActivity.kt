package com.example.ejerciciociclovida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.d("Ciclo de vida", "SecondActivity - onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Ciclo de vida", "SecondActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Ciclo de vida", "SecondActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Ciclo de vida", "SecondActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Ciclo de vida", "SecondActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Ciclo de vida", "SecondActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Ciclo de vida", "SecondActivity - onDestroy")
    }

    fun goToMainActivity(view: View) {
        finish()
    }
}