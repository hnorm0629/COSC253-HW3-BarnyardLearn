package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

/*
Hannah Norman
Sophia Petersen
COSC-253 HW3
02/09/2022
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // move to Learn activity
    fun learn(view: View) {
        val intent = Intent(this, LearnActivity::class.java)
        startActivity(intent)
    } // learn

    // move to Quiz activity
    fun quiz(view: View) {
        val intent = Intent(this, QuizActivity::class.java)
        startActivity(intent)
    } // quiz

} // MainActivity