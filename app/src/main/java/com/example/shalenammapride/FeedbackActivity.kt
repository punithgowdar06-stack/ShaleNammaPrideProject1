package com.example.shalenammapride

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FeedbackActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val etFeedback = findViewById<EditText>(R.id.etFeedback)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSubmit.setOnClickListener {
            val feedback = etFeedback.text.toString().trim()

            if (feedback.isEmpty()) {
                Toast.makeText(this, "Please enter feedback", Toast.LENGTH_SHORT).show()
            } else {
                tvResult.text = "Submitted Feedback:\n$feedback"
                etFeedback.text.clear()
                Toast.makeText(this, "Feedback submitted successfully", Toast.LENGTH_SHORT).show()
            }
        }
    }
}