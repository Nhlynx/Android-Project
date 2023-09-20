package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
//        Define array adapter
        val arrayAdapter:ArrayAdapter<*>
        val user = arrayOf(
            "Daud","Ross Taylor","Tehfa"
        )
//        Deklarasikan variabel List View
        val mListView:ListView = findViewById(R.id.lvNama)
//        Panggil object arrayadapter(this,layout_sample,data)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,user)
//        Isi adapter
        mListView.adapter = arrayAdapter
    }
}