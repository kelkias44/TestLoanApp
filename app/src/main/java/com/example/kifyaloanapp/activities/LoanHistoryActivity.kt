package com.example.kifyaloanapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kifyaloanapp.R
import com.example.kifyaloanapp.adapter.LoanHistoryAdapter
import com.example.kifyaloanapp.data.cardData

class LoanHistoryActivity : AppCompatActivity() {
    private lateinit var historyRecyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loan_history)

        historyRecyclerView = findViewById(R.id.history_recycler)

        historyRecyclerView.layoutManager = LinearLayoutManager(this);

        val loanHistoryAdapter = LoanHistoryAdapter(cardData)

        historyRecyclerView.adapter = loanHistoryAdapter
    }
}