package com.example.count_ex

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var num: Int = 0
    val keywordArray = arrayListOf<String>("apple🍎", "banana🍌", "cat🐱", "dog🐶")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeUI()

        plusButton.setOnClickListener {
            num += 1
            changeUI()
        }

        minusButton.setOnClickListener {
            num -= 1
            changeUI()
        }

        clearButton.setOnClickListener {
            num = 0
            changeUI()
        }
    }

    fun changeUI() {
        numTextView.text = num.toString()

        if (num % 3 == 0 && num % 5 == 0) {
            numTextView.setTextColor(Color.RED)
        } else if (num % 3 == 0) {
            numTextView.setTextColor(Color.GREEN)
        } else if (num % 5 == 0) {
            numTextView.setTextColor(Color.BLUE)
        } else {
            numTextView.setTextColor(Color.BLACK)
        }

        when (num) {
            0 -> {
                keywordTextView.text = keywordArray[0]
            }
            1 -> {
                keywordTextView.text = keywordArray[1]
            }
            2 -> {
                keywordTextView.text = keywordArray[2]
            }
            3 -> {
                keywordTextView.text = keywordArray[3]
            }
            else -> {
                keywordTextView.text = "その番号のキーワードは存在しません"
            }
        }
    }
}