package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class KalkulatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        var inputAngka1:EditText = findViewById(R.id.inputAngka1)
        var inputAngka2:EditText = findViewById(R.id.inputAngka2)

        val btnTambah:Button = findViewById(R.id.btnTambah)
        val btnKurang:Button = findViewById(R.id.btnKurang)
        val btnKali:Button = findViewById(R.id.btnKali)
        val btnBagi:Button = findViewById(R.id.btnBagi)
        val btnModulus:Button = findViewById(R.id.btnModulus)
        val btnClear:Button = findViewById(R.id.btnClear)

        var hasil:TextView = findViewById(R.id.hasil)
        val builder:AlertDialog.Builder = AlertDialog.Builder(this@KalkulatorActivity)

        btnTambah.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAngka2.text.toString().toInt()
            var hasilTambah:Int = angka1 + angka2
            hasil.setText(hasilTambah.toString())
        }

        btnKurang.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAngka2.text.toString().toInt()
            var hasilKurang:Int = angka1 - angka2
            hasil.setText(hasilKurang.toString())
        }

        btnKali.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAngka2.text.toString().toInt()
            var hasilKali:Int = angka1 * angka2
            hasil.setText(hasilKali.toString())
        }

        btnBagi.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAngka2.text.toString().toInt()
            var hasilBagi:Int = angka1 / angka2
            hasil.setText(hasilBagi.toString())
        }

        btnModulus.setOnClickListener {
            var angka1:Int = inputAngka1.text.toString().toInt()
            var angka2:Int = inputAngka2.text.toString().toInt()
            var hasilModulus:Int = angka1 % angka2
            hasil.setText(hasilModulus.toString())
        }

        btnClear.setOnClickListener {
            builder.setTitle("Perhatian!")
            builder.setMessage("Kamu yakin mau mengahpus datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialog, which ->
                var hasilClear:Int = hasil.text.toString().toInt()
                hasilClear = 0
                inputAngka1.setText("")
                inputAngka2.setText("")
                hasil.setText(hasilClear.toString())
            })
            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->  })
            builder.setIcon(R.drawable.icon)
            // agar alertnya muncul buat variabel ini
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()
        }
    }
}