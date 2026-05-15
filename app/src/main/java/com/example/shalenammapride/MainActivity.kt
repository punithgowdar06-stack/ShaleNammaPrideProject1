package com.example.shalenammapride

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            if (email.text.toString().isNotEmpty() &&
                password.text.toString().isNotEmpty()
            ) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()

                startActivity(Intent(this, WelcomeActivity::class.java))
                finish()

            } else {
                Toast.makeText(this, "Enter Email & Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}