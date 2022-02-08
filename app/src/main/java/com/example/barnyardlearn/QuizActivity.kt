package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
    } // onCreate

    fun submit(view: View) {
        val intent = Intent(this, SubmitActivity::class.java)
        startActivity(intent)
    } // submit

} // QuizActivity