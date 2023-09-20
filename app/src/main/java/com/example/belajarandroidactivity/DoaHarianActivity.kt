package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.adapter.DoaAdapter
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian:RecyclerView = findViewById(R.id.rvDoaHarian)
        val Doa = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Tidur", "بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتُ", "Bismikallohumma ahya wa amuutu"),
            DoaHarian("Doa Bangun Tidur", "اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْر", "Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuruُ"),
            DoaHarian("Doa Masuk Kamar Mandi Atau Toilet", "اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثِ", "Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi"),
            DoaHarian("Doa Keluar Kamar Mandi Atau Toilet", "غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ", "Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaaniiُ"),
            DoaHarian("Doa Ketika Mimpi Baik", "اَلْحَمْدُ ِللهِ الَّذِيْ قَطْلَ الْحَاجَتِْ", "Alhamdulillahil ladzii qodzoo haajaati"),
            DoaHarian("Doa Ketika Mimpi Buruk", "اَللّٰهُمَّ إِنّىِ أَعُوْذُ بِكَ مِنْ عَمَلِ الشَّيْطَانِ وَسَيِّئاَتِ اْلأَحْلاَمِْ", "Allaahumma innii a'uudzubika min 'amalisy syaithaani wa sayyiaatil ahlami")
        )
        val adapter = DoaHarianAdapter(Doa)
        val LinearVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager = LinearVertical
    }
}