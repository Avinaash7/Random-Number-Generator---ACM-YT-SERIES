package com.example.randomnumbergenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tap_button = findViewById<Button>(R.id.button)

        tap_button.setOnClickListener {
            val Random_image = findViewById<ImageView>(R.id.NumberImage)
            val random_number = (1..9).random()
             val random_text = findViewById<TextView>(R.id.textView)
            random_text.text = "The Number is: $random_number"

            val image =
                when(random_number){
                    1 -> (R.drawable.one)
                    2 -> (R.drawable.two)
                    3 -> (R.drawable.three)
                    4 -> (R.drawable.four)
                    5 -> (R.drawable.five)
                    6 -> (R.drawable.six)
                    7 -> (R.drawable.seven)
                    8 -> (R.drawable.eight)
                    9 -> (R.drawable.nine)
                    else -> (R.drawable.empty)
                }

                Random_image.setImageResource(image)
        }
    }
}