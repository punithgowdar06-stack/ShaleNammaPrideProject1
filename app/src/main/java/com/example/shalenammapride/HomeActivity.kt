package com.example.shalenammapride

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        findViewById<Button>(R.id.btnInfrastructure).setOnClickListener {
            startActivity(Intent(this, InfrastructureActivity::class.java))
        }

        findViewById<Button>(R.id.btnMeals).setOnClickListener {
            startActivity(Intent(this, MealsActivity::class.java))
        }

        findViewById<Button>(R.id.btnProgress).setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        }

        findViewById<Button>(R.id.btnFeedback).setOnClickListener {
            startActivity(Intent(this, FeedbackActivity::class.java))
        }
    }
}