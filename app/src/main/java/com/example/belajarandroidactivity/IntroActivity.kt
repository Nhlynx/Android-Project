package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        val btnGetIn:Button = findViewById(R.id.btnGetIn)

        btnGetIn.setOnClickListener {
            val intent = Intent(this, LoginWatchActivity::class.java)
            startActivity(intent)
        }
    }
}