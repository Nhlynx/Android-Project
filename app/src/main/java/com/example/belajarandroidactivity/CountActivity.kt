package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val countNumber:TextView = findViewById(R.id.angkaCount)
        val buttonReset:Button = findViewById(R.id.btnZero)
        val buttonCount:Button = findViewById(R.id.btnCount)
        val buttonMinus:Button = findViewById(R.id.btnMinus)

        // setText = mengirim/merubah data
            countNumber.text = "0"
        // getText = mengambil text
            println(countNumber.text)
        // aktivitas debugger / debugging code
        Log.d("count", "Angkanya menjadi : ${countNumber.text}")

        buttonReset.setOnClickListener {
            var countInt:Int = countNumber.text.toString().toInt()
            countInt = 0
            countNumber.text = countInt.toString()
        }

        buttonCount.setOnClickListener {
            var countInt:Int = countNumber.text.toString().toInt()
            countInt++
            countNumber.text = countInt.toString()
        }

        buttonMinus.setOnClickListener {
            var countInt:Int = countNumber.text.toString().toInt()
            countInt--
            countNumber.text = countInt.toString()
        }
    }
}