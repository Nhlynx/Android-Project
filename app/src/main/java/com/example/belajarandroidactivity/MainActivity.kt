package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val judulForm:TextView = findViewById(R.id.judulForm)
        val labelNama:TextView = findViewById(R.id.labelNama)
        val labelKelas:TextView = findViewById(R.id.labelKelas)
        val labelKode:TextView = findViewById(R.id.labelKode)

        val inputNama:EditText = findViewById(R.id.inputNama)
        val inputKelas:EditText = findViewById(R.id.inputKelas)
        val inputKode:EditText = findViewById(R.id.inputKode)

        val btnSubmit:Button = findViewById(R.id.btnSubmit)

        val showNama:TextView = findViewById(R.id.showNama)
        val showKelas:TextView = findViewById(R.id.showKelas)
        val showKode:TextView = findViewById(R.id.showKode)

        btnSubmit.setOnClickListener {
            // Toast untuk memunculkan notifikasi
            Toast.makeText(this,"Kamu Meminjam Buku ${showKode.text}", Toast.LENGTH_SHORT).show()

            showNama.text = inputNama.text
            showKelas.text = inputKelas.text
            val kode:Int = inputKode.text.toString().toInt()

             when(kode){
                123 -> showKode.text = "Harry Potter"
                456 -> showKode.text = "Alice In Wonderland"
                789 -> showKode.text = "Vinland Saga"
                else -> showKode.text = "Buku Tidak Ditemukan"
            }
        }
    }
}