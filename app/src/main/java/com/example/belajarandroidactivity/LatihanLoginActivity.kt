package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LatihanLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_login)

        val inputUsername:EditText = findViewById(R.id.inputUsernameTxt)
        val inputPassword:EditText = findViewById(R.id.inputPasswordTxt)
        val btnLogin:Button = findViewById(R.id.btnLogin2)
        val tvAlert:TextView = findViewById(R.id.tvAlert)

        var username = "admin"
        var password = "123"

        btnLogin.setOnClickListener {
            if (inputUsername.text.toString() == username && inputPassword.text.toString() == password){
                val intent = Intent(this, DashboardStoreActivity::class.java)
                startActivity(intent)
                tvAlert.visibility = View.GONE
            } else if (inputUsername.text.toString().isEmpty() && inputPassword.text.toString().isEmpty()){
                Toast.makeText(this, "Username or Password Required", Toast.LENGTH_SHORT).show()
            } else {
                tvAlert.visibility = View.VISIBLE
                var builder = AlertDialog.Builder(this)
                builder.setMessage("Username or Password Required")
                builder.setTitle("Alert!!")
                builder.setPositiveButton("OK"){
                    dialog,which->
                }
                var AlertDialog = builder.create()
                AlertDialog.show()
            }
        }
    }
}