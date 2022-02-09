package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class QuizActivity : AppCompatActivity() {
    var checked: RadioButton? = null
    var question: TextView? = null
    var guess = ""
    var questionNumber = 0
    var totalScore = 0

    var questions = arrayListOf<String>()
    var correctAnswers = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        question = findViewById(R.id.question)
        //initialize question list
        questions.add("What animal can recognize its name?")
        questions.add("Which animal sleeps standing up?")
        questions.add("Which animal produces wool?")
        questions.add("What animal sometimes produces blue eggs?")
        questions.add("Which animals are the fourth smartest in the world?")
        questions.add("Which animal has rectangular pupils?")
        questions.add("Which animal can remember things for 3 years?")


        //initialize correct answers
        correctAnswers.add("Goat")
        correctAnswers.add("Cow")
        correctAnswers.add("Horse")
        correctAnswers.add("Sheep")
        correctAnswers.add("Chicken")
        correctAnswers.add("Pig")
        correctAnswers.add("Goat")
        correctAnswers.add("Cow")
    } // onCreate

    //grades question
    fun submit(view: View) {

        //grade question
        if (guess == correctAnswers[questionNumber]){
            totalScore++
            Toast.makeText(applicationContext, "Correct", Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_LONG).show()
        }

    } // submit

    //changes to next question
    fun newQuestion(view: View) {

        if (questionNumber < questions.size) {
            question!!.text = questions[questionNumber]
            questionNumber++
        }
        else {
            Toast.makeText(applicationContext, "Total Score: $totalScore / 8", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SubmitActivity::class.java)
            startActivity(intent)
        }

    }//newQuestion

    fun answer(view : View) {
        checked = (view as RadioButton)
        when(view.getId()) {
            R.id.answerChicken -> guess = "Chicken"
            R.id.answerGoat -> guess = "Goat"
            R.id.answerHorse -> guess = "Horse"
            R.id.answerChicken -> guess = "Cow"
            R.id.answerSheep -> guess = "Sheep"
            R.id.answerPig -> guess = "Pig"
        }//when
    }//answer

} // QuizActivity