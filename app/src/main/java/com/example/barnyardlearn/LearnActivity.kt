package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LearnActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

        supportActionBar!!.elevation = 0f   // remove action bar drop shadow
    } // onCreate

    fun animal(view: View) {
        val intent = when (view.tag){
            "cow" -> Intent(this, CowActivity::class.java)
            "pig" -> Intent(this, PigActivity::class.java)
            "chicken" -> Intent(this, ChickenActivity::class.java)
            "horse" -> Intent(this, HorseActivity::class.java)
            "goat" -> Intent(this, GoatActivity::class.java)
            "sheep" -> Intent(this, SheepActivity::class.java)
            else -> null
        } // when
        startActivity(intent)
    } // animal

    fun mainMenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    } // mainMenu

} // LearnActivity