package com.example.qwiz_kotlin_app.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.qwiz_kotlin_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newGame.setOnClickListener{
            val intent = Intent(this, FormQuizActivity::class.java)
            startActivity(intent)
        }

    }

}