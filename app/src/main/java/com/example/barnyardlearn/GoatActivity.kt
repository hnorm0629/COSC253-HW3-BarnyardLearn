package com.example.barnyardlearn

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GoatActivity : AppCompatActivity() {
    lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.goat)

        setContentView(R.layout.activity_goat)
        mediaPlayer.start()
    } // onCreate

    fun back(view: View) {
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    } // back
} // GoatActivity