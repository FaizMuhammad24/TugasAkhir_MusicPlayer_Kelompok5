package com.example.music_player_api

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.button.MaterialButton

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        Login()
    }
    fun Login() {
        val buttonNext: MaterialButton = findViewById(R.id.LoginApple)
        buttonNext.setOnClickListener {
            val intent = Intent(this@LoginPage, MainActivity::class.java)
            startActivity(intent)
        }
    }
}