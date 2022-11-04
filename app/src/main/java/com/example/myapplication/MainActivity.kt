package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var name: TextView

    lateinit var nextPageButton: Button
    lateinit var increaseNumberButton: Button
    lateinit var numberTextView: TextView
    lateinit var clickButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextPageButton = findViewById(R.id.nextPageButton)
        increaseNumberButton = findViewById(R.id.increaseNumberButton)
        numberTextView = findViewById(R.id.numberTextView)
        clickButton = findViewById(R.id.clickButton)


        increaseNumberButton.setOnClickListener {
            var number = numberTextView.text.toString().toInt()
            number++
            numberTextView.text = number.toString()
        }

        nextPageButton.setOnClickListener {
            startActivity(Intent(this,MainActivity2::class.java))
        }

        clickButton.setOnClickListener {
            Toast.makeText(this, "you clicked!", Toast.LENGTH_SHORT).show()
        }

    }
}