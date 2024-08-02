package com.example.kifyaloanapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.kifyaloanapp.R

class LoanStatusActivity : AppCompatActivity() {
    private lateinit var repaymentButton: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loan_status)

        repaymentButton = findViewById(R.id.button_make_repayment)

        repaymentButton.setOnClickListener {
            val intent = Intent(this, MakeReapaymentActivity::class.java)
            startActivity(intent)
        }
    }
}