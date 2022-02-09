package com.example.barnyardlearn

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/*
Hannah Norman
Sophia Petersen
COSC-253 HW3
02/09/2022
 */

class AnimalActivity : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // retrieve correct xml animal activity and noise
        val tag = intent.getStringExtra("Tag").toString()
        var layout = 0; var noise = 0
        when (tag){
            "cow" -> {
                layout = R.layout.activity_cow
                noise = R.raw.cow
            } // cow
            "pig" -> {
                layout = R.layout.activity_pig
                noise = R.raw.pig
            } // pig
            "chicken" -> {
                layout = R.layout.activity_chicken
                noise = R.raw.chicken
            } // chicken
            "horse" -> {
                layout = R.layout.activity_horse
                noise = R.raw.horse
            } // horse
            "goat" -> {
                layout = R.layout.activity_goat
                noise = R.raw.goat
            } // goat
            "sheep" -> {
                layout = R.layout.activity_sheep
                noise = R.raw.sheep
            } // sheep
            else -> println("Should not arrive here.")
        } // when
        setContentView(layout)
        mediaPlayer = MediaPlayer.create(applicationContext, noise)
    } // onCreate

    // play animal noise
    fun noise(view: View) {
        mediaPlayer.start()
    } // noise

    // move back to Learn activity
    fun back(view: View) {
        mediaPlayer.stop()
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    } // back

} // AnimalActivity