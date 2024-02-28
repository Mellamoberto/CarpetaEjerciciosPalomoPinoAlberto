package com.example.curso

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPlay1 = findViewById<AppCompatButton>(R.id.button_play1)
        val btnPlay2 = findViewById<AppCompatButton>(R.id.button_play2)
        val btnPlay3 = findViewById<AppCompatButton>(R.id.button_play3)
        val etNombre = findViewById<AppCompatEditText>(R.id.etNombre)
        val cvCurso: CardView = findViewById<CardView>(R.id.cv1)


        btnPlay1.setOnClickListener {
            launchResultadoActivity("video5", "Curso 1")
        }

        btnPlay2.setOnClickListener {
            launchResultadoActivity("clouds", "Curso 2")
        }

        btnPlay3.setOnClickListener {
            launchResultadoActivity("gallo", "Curso 3")
        }
    }

    private fun launchResultadoActivity(videoName: String, boton: String) {
        val intent = Intent(this, Resultado::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        intent.putExtra("VIDEO_NAME", videoName)
        intent.putExtra("MENSAJE", "Has pulsado el botón $boton")
        startActivity(intent)
    }
}