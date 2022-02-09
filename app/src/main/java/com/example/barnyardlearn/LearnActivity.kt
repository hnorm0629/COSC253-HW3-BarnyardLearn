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

class LearnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    // move to Animal activity, unique to each animal type
    fun animal(view: View) {
        val intent = Intent(this, AnimalActivity::class.java)
        intent.putExtra("Tag", view.tag.toString())
        startActivity(intent)
    } // animal

    // move to Main activity
    fun mainMenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    } // mainMenu

} // LearnActivity