package com.example.music_player_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pindah()
        pindah1()
    }
    fun pindah() {
        val cardNext: CardView = findViewById(R.id.card2)
        cardNext.setOnClickListener {
            val intent = Intent(this@MainActivity, ListLaguActivity::class.java)
            startActivity(intent)
        }
    }
    fun pindah1() {
        val textNext: TextView = findViewById(R.id.TextRadio)
        textNext.setOnClickListener {
            val intent = Intent(this@MainActivity, RadioActivity::class.java)
            startActivity(intent)
        }
    }

}