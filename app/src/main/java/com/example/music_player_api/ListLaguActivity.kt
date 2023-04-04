package com.example.music_player_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class ListLaguActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_lagu)
        pindah()
    }
    fun pindah() {
        val imageNext: ImageView = findViewById(R.id.BackListLagu)
        imageNext.setOnClickListener {
            val intent = Intent(this@ListLaguActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }
}