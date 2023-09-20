package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class BelajarNgajiActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_ngaji)
        val rvListDoa:RecyclerView = findViewById(R.id.rvListDoa)
        val ListDoa = arrayListOf<Doa>(
            Doa("Dzikir & Doa Sunnah Setelah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir & Doa Sunnah Sebelum Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Setiap Saat",R.drawable.doa_harian2),
            Doa("Dzikir Pagi & Petang",R.drawable.doa_harian2)
        )
        val adapter = DoaAdapter(ListDoa)
        val LinearVertical = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        rvListDoa.adapter = adapter
        rvListDoa.layoutManager = LinearVertical

        val btnLengkap:Button = findViewById(R.id.btnLengkap)
        btnLengkap.setOnClickListener {
            val intent = Intent(this, DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
}