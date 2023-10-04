package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginWatchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_watch)

        val etUsername:EditText = findViewById(R.id.etUsername)
        val etPassword:EditText = findViewById(R.id.etPassword)
        val btnLogin:Button = findViewById(R.id.btnLogin)
        val tvSalah:TextView = findViewById(R.id.tvSalah)

        val username = "Daud"
        val pass = "tutorpuhsepuh"

        btnLogin.setOnClickListener {
            if (etUsername.text.toString() == username && etPassword.text.toString() == pass){
                Toast.makeText(this, "Welcome User", Toast.LENGTH_SHORT) .show()
            } else {
                tvSalah.visibility = View.VISIBLE
            }
        }
    }
}