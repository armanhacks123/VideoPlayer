package com.example.videoplayerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // displaying video from local storage
        val videoView: VideoView = findViewById(R.id.video)
        videoView.setVideoPath("android.resource://" + packageName + "/" + R.raw.mountain)


        val MediaController = MediaController(this)
        MediaController.setAnchorView(videoView)
       MediaController.setMediaPlayer(videoView)
        videoView.setMediaController(MediaController)
        videoView.start()

    }
}