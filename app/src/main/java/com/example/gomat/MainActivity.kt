package com.example.gomat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_start_game.*
import kotlinx.android.synthetic.main.activity_win.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartGamebtn.setOnClickListener {
            val xat = Intent (this, StartGame::class.java)
            startActivity(xat)
            finish()
        }

        ExitGamebtn.setOnClickListener{
            finish()
        }

    }

}




