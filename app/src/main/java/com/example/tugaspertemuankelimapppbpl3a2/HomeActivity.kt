package com.example.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.tugaspertemuankelimapppbpl3a2.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)

        // Ambil data yang dikirim dari LoginActivity
        val username = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")

        tvUsername.text = "Username: $username"
        tvEmail.text = "Email: $email"
    }
}
