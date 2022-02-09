package com.example.barnyardlearn

/*
Hannah Norman
Sophia Petersen
COSC-253-01
HOMEWORK 3
 */

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow

    } // onCreate

    fun learn(view: View) {
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    } // learn

    fun quiz(view: View) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    } // quiz

} // MainActivity