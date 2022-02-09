package com.example.barnyardlearn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

/*
Hannah Norman
Sophia Petersen
COSC-253 HW3
02/09/2022
 */

class QuizActivity : AppCompatActivity() {
    private lateinit var question: TextView
    private lateinit var questionCount: TextView
    private lateinit var answers: RadioGroup
    private lateinit var checked: RadioButton

    private var guess = ""
    private var questionNumber = 0
    private var totalScore = 0
    private var cnt = 2
    private var questions = arrayListOf<String>()
    private var correctAnswers = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        question = findViewById(R.id.question)
        questionCount = findViewById(R.id.questionCount)
        answers = findViewById(R.id.answers)

        // initialize question list
        // q1: "Which animal has two toes on each hoof?"
        questions.add("Which animal can recognize its own name?")
        questions.add("Which animal sleeps standing up?")
        questions.add("Which animal is a relative of the T-Rex?")
        questions.add("Which animal is the 4th smartest in the world?")
        questions.add("Which animal has rectangular pupils?")
        questions.add("Which animal can remember things for 3 years?")
        questions.add("Which animal has the largest land-animal eyes?")
        questions.add("Which animal can see in the dark?")
        questions.add("Which animal can run at 11mph?")

        // initialize correct answers
        correctAnswers.add("Sheep")
        correctAnswers.add("Cow")
        correctAnswers.add("Horse")
        correctAnswers.add("Chicken")
        correctAnswers.add("Pig")
        correctAnswers.add("Goat")
        correctAnswers.add("Cow")
        correctAnswers.add("Horse")
        correctAnswers.add("Goat")
        correctAnswers.add("Pig")
    } // onCreate

    // grade question & move to next question or submission page
    fun submit(view: View) {
        // grade question
        if (guess == correctAnswers[questionNumber]){
            totalScore++
            Toast.makeText(applicationContext, "Correct", Toast.LENGTH_SHORT).show()
        } // if
        else{
            Toast.makeText(applicationContext, "Incorrect", Toast.LENGTH_SHORT).show()
        } // else

        // proceed to next question
        if (questionNumber < questions.size) {
            answers.clearCheck()
            val title = "Question #$cnt"
            questionCount.text  = title
            question.text = questions[questionNumber]
            questionNumber++
            cnt++
        } // if
        else { // move to Submit activity & display score
            val intent = Intent(this, SubmitActivity::class.java)
            intent.putExtra("Score", "Score: $totalScore / 10")
            startActivity(intent)
        } // else
    } // submit

    // move to Main Menu activity
    fun mainMenu(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    } // mainMenu

    // select and highlight radio button
    fun answer(view : View) {
        checked = (view as RadioButton)
        when(view.getId()) {
            R.id.answerChicken -> guess = "Chicken"
            R.id.answerGoat -> guess = "Goat"
            R.id.answerHorse -> guess = "Horse"
            R.id.answerCow -> guess = "Cow"
            R.id.answerSheep -> guess = "Sheep"
            R.id.answerPig -> guess = "Pig"
        } // when
    } // answer

} // QuizActivity