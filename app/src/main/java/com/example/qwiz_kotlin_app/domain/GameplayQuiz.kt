package com.example.qwiz_kotlin_app.domain

import com.example.qwiz_kotlin_app.data.Puzzle

class GameplayQuiz {

    val readle: Task = Task()
    var currentPuzzle: Puzzle = Puzzle("", "")

    fun selectRandomCollectionItem (){
        var rand: Int = (Math.random() * readle.riddle.size).toInt()
        currentPuzzle = readle.riddle.get(rand)
    }

    fun getNamePazzleQuestion(): String{
        return currentPuzzle.question
    }

    fun checkUsersResponse (currentAnswer: String): Boolean {

        return if(currentPuzzle.answer == currentAnswer) true else false


    }

}