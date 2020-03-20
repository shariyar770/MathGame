package com.example.gomat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_win.*

class WinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_win)

        janabas.setOnClickListener{
            val xat = Intent (this, MainActivity::class.java)
            startActivity(xat)
            finish()
        }

        shigiw.setOnClickListener{
            finish()
        }
    }
}
