package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_up)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener { countUp() }
    }
    private fun rollDice(){
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()
    }
    private fun countUp(){
        val resultText: TextView = findViewById(R.id.result_text)

        //edge cases
        if (resultText.text == "Hello World!"){
            resultText.text = "1"
        }
        else {
            var resultInt = Integer.parseInt(resultText.text.toString())

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}

