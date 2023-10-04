package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class DashboardStoreActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_store)

        var ibMin:ImageButton = findViewById(R.id.ib_min)
        var ibPlus:ImageButton = findViewById(R.id.ib_plus)
        var tvCount:TextView = findViewById(R.id.tvCount)
        var tvTotal:TextView = findViewById(R.id.tvTotalHarga)
        var btnCheckout:Button = findViewById(R.id.btnCheckout)

        var angka = tvTotal.text.toString().toInt()
        var harga:Int = 68020668

        ibMin.setOnClickListener {
            angka-=1
            tvCount.text = angka.toString()
            tvTotal.text = (harga*angka).toString()
        }
        ibPlus.setOnClickListener {
            angka+=1
            tvCount.text = angka.toString()
            tvTotal.text = (harga*angka).toString()
        }
    }
}