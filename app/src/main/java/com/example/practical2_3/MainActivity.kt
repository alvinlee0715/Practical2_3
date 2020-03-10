package com.example.practical2_3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        private fun setListeners() {

            val boxOneText = findViewById<TextView>(R.id.box_one_text)
            val boxTwoText = findViewById<TextView>(R.id.box_two_text)
            val boxThreeText = findViewById<TextView>(R.id.box_three_text)
            val boxFourText = findViewById<TextView>(R.id.box_four_text)
            val boxFiveText = findViewById<TextView>(R.id.box_five_text)

            val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)
        }

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)

      
            private fun makeColored(view: View) {
                when (view.id) {

                        ...

                        // Boxes using custom colors for background
                        R.id.red_button -> box_three_text.setBackgroundResource(R.color.my_red)
                    R.id.yellow_button -> box_four_text.setBackgroundResource(R.color.my_yellow)
                    R.id.green_button -> box_five_text.setBackgroundResource(R.color.my_green)

                    else -> view.setBackgroundColor(Color.LTGRAY)
                }
            }
        }
    }
}
