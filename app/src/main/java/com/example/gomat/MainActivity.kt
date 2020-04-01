package com.example.gomat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        StartGamebtn.setOnClickListener {
            val xat = Intent (this, GameActivity::class.java)
            startActivity(xat)
            finish()
        }

        ExitGamebtn.setOnClickListener{
            finish()
        }

    }

}




