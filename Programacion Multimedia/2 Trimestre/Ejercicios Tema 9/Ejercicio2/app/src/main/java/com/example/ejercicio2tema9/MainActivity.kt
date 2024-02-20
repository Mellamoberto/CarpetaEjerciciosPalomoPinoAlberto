package com.example.ejercicio2tema9

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

        val buttonPlay1 = findViewById<Button>(R.id.button_play1)
        buttonPlay1.setOnClickListener {
            // Reinicia la reproducción del video
            videoView.setVideoURI(videoUri1)
            videoView.seekTo(0)
            videoView.start()
        }

        val buttonPlay2 = findViewById<Button>(R.id.button_play2)
        buttonPlay2.setOnClickListener {
            // Reinicia la reproducción del video
            videoView.setVideoURI(videoUri2)
            videoView.seekTo(0)
            videoView.start()
        }

        val buttonPlay3 = findViewById<Button>(R.id.button_play3)
        buttonPlay3.setOnClickListener {
            // Reinicia la reproducción del video
            videoView.setVideoURI(videoUri3)
            videoView.seekTo(0)
            videoView.start()
        }
    }
}