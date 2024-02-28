package com.example.curso

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import android.widget.Toast
import android.view.LayoutInflater
import android.widget.TextView
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val videoView = findViewById<VideoView>(R.id.video_view1)

        // Obtiene el nombre del video desde el intent
        val videoName = intent.getStringExtra("VIDEO_NAME")

        // Verifica si el nombre del video no es nulo o vacío
        if (!videoName.isNullOrBlank()) {
            // Obtiene el identificador del recurso del video
            val videoResourceId = resources.getIdentifier(videoName, "raw", packageName)

            if (videoResourceId != 0) {
                // Construye la ruta del video
                val videoPath = "android.resource://${packageName}/$videoResourceId"
                val videoUri = Uri.parse(videoPath)

                // Configura el VideoView para reproducir el video
                videoView.setVideoURI(videoUri)

                // Configura los controles de reproducción del video
                val mediaController = android.widget.MediaController(this)
                videoView.setMediaController(mediaController)
                mediaController.setAnchorView(videoView)

                // Inicia la reproducción del video
                videoView.start()
            } else {
                // Maneja el caso en el que el identificador del recurso no se encuentra
                Toast.makeText(this, "Video no encontrado", Toast.LENGTH_SHORT).show()
            }
        } else {
            // Maneja el caso en el que el nombre del video es nulo o vacío
            Toast.makeText(this, "Nombre de video inválido", Toast.LENGTH_SHORT).show()
        }

        val mensaje = intent.getStringExtra("MENSAJE")

        val constraintLayout = findViewById<ConstraintLayout>(R.id.constraintLayout)

// Muestra el mensaje usando LayoutInflater
        if (!mensaje.isNullOrBlank()) {
            val inflater = LayoutInflater.from(this)
            val layout = inflater.inflate(R.layout.layout_mensaje, constraintLayout, false)
            val textViewMensaje: TextView = layout.findViewById(R.id.textViewMensaje)
            textViewMensaje.text = mensaje

            constraintLayout.addView(layout)
            textViewMensaje.visibility = View.VISIBLE
        }
    }
}