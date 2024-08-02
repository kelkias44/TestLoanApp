package com.example.kifyaloanapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.kifyaloanapp.R
import com.example.kifyaloanapp.adapter.LoanHistoryAdapter

class HomeActivity : AppCompatActivity() {
    private lateinit var applyButton: AppCompatButton
    private lateinit var repaymentButton: AppCompatButton
    private lateinit var statusButton: AppCompatButton
    private lateinit var historyButton: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        applyButton = findViewById(R.id.apply_button)
        repaymentButton = findViewById(R.id.make_repayment_button)
        statusButton = findViewById(R.id.loan_status_button)
        historyButton = findViewById(R.id.loan_history_button)

        applyButton.setOnClickListener {
            val intent = Intent(this, LoanApplicationActivity::class.java)
            startActivity(intent)
        }

        repaymentButton.setOnClickListener {
            val intent = Intent(this, MakeReapaymentActivity::class.java)
            startActivity(intent)
        }

        statusButton.setOnClickListener {
            val intent = Intent(this, LoanStatusActivity::class.java)
            startActivity(intent)
        }

        historyButton.setOnClickListener {
            val intent = Intent(this, LoanHistoryActivity::class.java)
            startActivity(intent)
        }
    }
}