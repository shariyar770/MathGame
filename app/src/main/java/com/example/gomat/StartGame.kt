package com.example.gomat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_start_game.*
import kotlin.random.Random

class StartGame : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_game)
        var schet=0
        Nextbtn.text="Baslaw"
        Nextbtn.setOnClickListener {
            Nextbtn.text="Keyingi etap"
            duris.setVisibility(View.INVISIBLE)
            var a = Random.nextInt(1, 30)
            var b = Random.nextInt(1, 30)
            var c = Random.nextInt(1, 5)

            var tans : Double=0.00
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
                "1" -> tans = a.toDouble()+b.toDouble()
                "2" -> tans = a.toDouble()-b.toDouble()
                "3" -> tans = a.toDouble()*b.toDouble()
                "4" -> {
                    tans= a.toDouble()/b.toDouble()
                }
            }

            var ans1 = tans;
            var ans2 = tans + Random.nextInt(2,17);
            var ans3 = tans + Random.nextInt(18,30);
            var ans4 = tans + Random.nextInt(31,40);

            var ranju = Random.nextInt(1, 4)

            if (ranju == 1) {
                answer1.text = ans1.toString()
                answer2.text = ans2.toString()
                answer3.text = ans3.toString()
                answer4.text = ans4.toString()

            } else
                if (ranju == 2) {
                    answer1.text = ans2.toString()
                    answer2.text = ans1.toString()
                    answer3.text = ans3.toString()
                    answer4.text = ans4.toString()

                } else
                    if (ranju == 3) {
                        answer1.text = ans3.toString()
                        answer2.text = ans2.toString()
                        answer3.text = ans1.toString()
                        answer4.text = ans4.toString()
                    } else
                        if (ranju == 4) {
                            answer1.text = ans4.toString()
                            answer2.text = ans2.toString()
                            answer3.text = ans3.toString()
                            answer4.text = ans1.toString()
                        }


            answer1.setOnClickListener {
                if (ranju == 1) {
                    schet = schet + 1
                    answer1.isClickable = false
                    answer2.isClickable = false
                    answer3.isClickable = false
                    answer4.isClickable = false
                    duris.setVisibility(View.VISIBLE)
                } else {
                    val xat = Intent (this, GameOver::class.java)
                    startActivity(xat)
                    finish()
                }

            }

            answer2.setOnClickListener {
                if (ranju == 2) {
                    schet = schet + 1
                    answer1.isClickable = false
                    answer2.isClickable = false
                    answer3.isClickable = false
                    answer4.isClickable = false
                    duris.setVisibility(View.VISIBLE)
                } else {
                    val xat = Intent (this, GameOver::class.java)
                    startActivity(xat)
                    finish()
                }

            }

            answer3.setOnClickListener {
                if (ranju == 3) {
                    schet = schet + 1
                    answer1.isClickable = false
                    answer2.isClickable = false
                    answer3.isClickable = false
                    answer4.isClickable = false
                    duris.setVisibility(View.VISIBLE)
                } else {
                    val xat = Intent (this, GameOver::class.java)
                    startActivity(xat)
                    finish()
                }

            }

            answer4.setOnClickListener {
                if (ranju == 4) {
                    schet = schet + 1
                    answer1.isClickable = false
                    answer2.isClickable = false
                    answer3.isClickable = false
                    answer4.isClickable = false
                    duris.setVisibility(View.VISIBLE)

                } else {
                    val xat = Intent (this, GameOver::class.java)
                    startActivity(xat)
                    finish()
                }

            }
            schet_btn.text = schet.toString()

            if (schet == 10) {

                    val xat = Intent (this, WinActivity::class.java)
                    startActivity(xat)
                finish()

            }


        }

    }
}
