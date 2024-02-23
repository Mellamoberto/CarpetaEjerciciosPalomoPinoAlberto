package com.example.curso

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class Resultado : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val videoView = findViewById<VideoView>(R.id.video_view1)

        // Especifica la ruta del video
        val videoPath1 = "android.resource://${packageName}/${R.raw.video5}"
        val videoUri1 = Uri.parse(videoPath1)

        val videoPath2 = "android.resource://${packageName}/${R.raw.clouds}"
        val videoUri2 = Uri.parse(videoPath2)

        val videoPath3 = "android.resource://${packageName}/${R.raw.gallo}"
        val videoUri3 = Uri.parse(videoPath3)

        // Configura el VideoView para reproducir el video
        videoView.setVideoURI(videoUri1)

        // Configura los controles de reproducción del video
        val mediaController = android.widget.MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)

        // Inicia la reproducción del video
        videoView.start()
    }
}