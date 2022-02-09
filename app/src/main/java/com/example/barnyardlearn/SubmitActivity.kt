package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

/*
Hannah Norman
Sophia Petersen
COSC-253 HW3
02/09/2022
 */

class SubmitActivity : AppCompatActivity() {
    private lateinit var score: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        // retrieve and update score TextView
        score = findViewById(R.id.score)
        val scoreAmt = intent.getStringExtra("Score").toString()
        score.text = scoreAmt

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // move to Main Menu activity
    fun mainMenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    } // mainMenu

} // SubmitActivity