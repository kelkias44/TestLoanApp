package com.example.kifyaloanapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.kifyaloanapp.R

class LoanApplicationActivity : AppCompatActivity() {
    private lateinit var applyButton: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loan_application)

        applyButton = findViewById(R.id.apply_button)

        applyButton.setOnClickListener {
            finish()
        }
    }
}