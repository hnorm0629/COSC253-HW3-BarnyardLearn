package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChickenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chicken)
    } // onCreate

    fun back(view: View) {
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    } // back
} // ChickenActivity