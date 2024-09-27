package com.example.qwiz_kotlin_app.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.qwiz_kotlin_app.R
import com.example.qwiz_kotlin_app.domain.GameplayQuiz

class FormQuizActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gameplayQuiz : GameplayQuiz = GameplayQuiz()

        val questionText : TextView = findViewById(R.id.question)
        val answerText : EditText = findViewById(R.id.answerText)
        val answerButton : Button = findViewById(R.id.answer)
        val nextButton : Button = findViewById(R.id.next)

        val correctly = getText(R.string.correctly)
        val wrong = getText(R.string.wrong)

        questionText.text = gameplayQuiz.getNamePazzleQuestion()

        answerButton.setOnClickListener{

            var resul: Boolean = gameplayQuiz.checkUsersResponse(answerText.text.toString())

            if(resul){
                questionText.text = correctly
            }else{
                questionText.text = wrong
            }

        }

        nextButton.setOnClickListener {

            questionText.text = gameplayQuiz.getNamePazzleQuestion()

        }

    }

}