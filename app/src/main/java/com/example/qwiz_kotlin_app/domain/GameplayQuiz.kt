package com.example.qwiz_kotlin_app.domain

import com.example.qwiz_kotlin_app.data.Puzzle

class GameplayQuiz {

    val readle: Task = Task()
    lateinit var currentPuzzle: Puzzle

    fun selectRandomCollectionItem (){
        val rand: Int = (Math.random() * readle.riddle.size).toInt()
        currentPuzzle = readle.riddle[rand]
    }

    fun getNamePazzleQuestion(): String{
        selectRandomCollectionItem()
        return currentPuzzle.question
    }

    fun checkUsersResponse (currentAnswer: String): Boolean {

        return if(currentPuzzle.answer == currentAnswer) true else false


    }

}