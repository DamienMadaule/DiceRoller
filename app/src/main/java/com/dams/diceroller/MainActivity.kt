package com.dams.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        val resultTextView: TextView = findViewById(R.id.textView)

        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_LONG).show()
            resultTextView.text = "6"
        }

    }
}