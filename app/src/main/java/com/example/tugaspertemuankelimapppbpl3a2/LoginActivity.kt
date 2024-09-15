package com.example.myapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tugaspertemuankelimapppbpl3a2.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etLoginUsername = findViewById<EditText>(R.id.etLoginUsername)
        val etLoginPassword = findViewById<EditText>(R.id.etLoginPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        // Ambil data yang dikirim dari RegisterActivity
        val registeredUsername = intent.getStringExtra("USERNAME")
        val registeredPassword = intent.getStringExtra("PASSWORD")
        val registeredEmail = intent.getStringExtra("EMAIL")
        val registeredPhone = intent.getStringExtra("PHONE")

        btnLogin.setOnClickListener {
            val inputUsername = etLoginUsername.text.toString()
            val inputPassword = etLoginPassword.text.toString()

            // Validasi username dan password
            if (inputUsername == registeredUsername && inputPassword == registeredPassword) {
                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("USERNAME", registeredUsername)
                intent.putExtra("EMAIL", registeredEmail)
                intent.putExtra("PHONE", registeredPhone)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
