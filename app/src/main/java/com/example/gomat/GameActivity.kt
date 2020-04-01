package com.example.gomat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_start_game.*
import kotlin.random.Random

class GameActivity : AppCompatActivity() {

    var ans = 0.0
    var schet = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_game)
        nextBtn.text = "Baslaw"
        nextBtn.setOnClickListener {
            nextBtn.visibility=View.INVISIBLE
            nextBtn.text = "Keyingi etap"
            duris.visibility = View.INVISIBLE
            var a = Random.nextInt(1, 30)
            var b = Random.nextInt(1, 30)
            var c = Random.nextInt(1, 5)

            var tans: Double = 0.00
            var belg = " "
            when (c.toString()) {
                "1" -> belg = "+"
                "2" -> belg = "-"
                "3" -> belg = "*"
                "4" -> belg = "/"
            }

            firstNumber.text = a.toString()
            secondNumber.text = b.toString()
            belgi.text = belg.toString()


            when (c.toString()) {
                "1" -> tans = a.toDouble() + b.toDouble()
                "2" -> tans = a.toDouble() - b.toDouble()
                "3" -> tans = a.toDouble() * b.toDouble()
                "4" -> {
                    a *= b
                    tans = a.toDouble() / b.toDouble()
                    firstNumber.text = a.toString()
                    secondNumber.text = b.toString()
                }
            }

            var ans1 = tans - Random.nextInt(41, 50)
            var ans2 = tans + Random.nextInt(2, 17)
            var ans3 = tans - Random.nextInt(18, 30)
            var ans4 = tans + Random.nextInt(31, 40)
            ans = tans

            var ranju = Random.nextInt(1, 4)
            answer1.text = ans1.toString()
            answer2.text = ans2.toString()
            answer3.text = ans3.toString()
            answer4.text = ans4.toString()

            when (ranju) {
                1 -> {
                    answer1.text = ans.toString()
                }
                2 -> {
                    answer2.text = ans.toString()
                }
                3 -> {
                    answer3.text = ans.toString()
                }
                4 -> {
                    answer4.text = ans.toString()
                }
            }

            answer1.setOnClickListener {
                if (ranju == 1) {
                    nextBtn.visibility=View.VISIBLE
                    schet = schet + 1
                    answer1.isClickable = false
                    answer2.isClickable = false
                    answer3.isClickable = false
                    answer4.isClickable = false
                    duris.setVisibility(View.VISIBLE)
                } else {
                    val xat = Intent(this, GameOver::class.java)
                    startActivity(xat)
                    finish()
                }
            }

                answer2.setOnClickListener {
                    if (ranju == 2) {
                        nextBtn.visibility=View.VISIBLE
                        schet = schet + 1
                        answer1.isClickable = false
                        answer2.isClickable = false
                        answer3.isClickable = false
                        answer4.isClickable = false
                        duris.setVisibility(View.VISIBLE)
                    } else {
                        val xat = Intent(this, GameOver::class.java)
                        startActivity(xat)
                        finish()
                    }

                }

                answer3.setOnClickListener {
                    if (ranju == 3) {
                        nextBtn.visibility=View.VISIBLE
                        schet = schet + 1
                        answer1.isClickable = false
                        answer2.isClickable = false
                        answer3.isClickable = false
                        answer4.isClickable = false
                        duris.setVisibility(View.VISIBLE)
                    } else {
                        val xat = Intent(this, GameOver::class.java)
                        startActivity(xat)
                        finish()
                    }

                }

                answer4.setOnClickListener {
                    if (ranju == 4) {
                        nextBtn.visibility=View.VISIBLE
                        schet = schet + 1
                        answer1.isClickable = false
                        answer2.isClickable = false
                        answer3.isClickable = false
                        answer4.isClickable = false
                        duris.setVisibility(View.VISIBLE)
                    } else {
                        val xat = Intent(this, GameOver::class.java)
                        startActivity(xat)
                        finish()
                    }

                }
                schet_btn.text = schet.toString()

                if (schet == 10) {
                    val xat = Intent(this, WinActivity::class.java)
                    startActivity(xat)
                    finish()
                }
            }
        }
    }

