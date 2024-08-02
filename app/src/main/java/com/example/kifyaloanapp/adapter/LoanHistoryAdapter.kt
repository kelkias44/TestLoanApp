package com.example.kifyaloanapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kifyaloanapp.model.LoanHistoryModel


class LoanHistoryAdapter(
    private var cardList: List<LoanHistoryModel>
) : RecyclerView.Adapter<LoanHistoryAdapter.CardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val view: View =
            LayoutInflater.from(parent.context).inflate(com.example.kifyaloanapp.R.layout.layout_loan_history, parent, false)
        return CardViewHolder(view)

    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val cardModel: LoanHistoryModel = cardList!![position]
        holder.amount.text = cardModel.amount
        holder.term.text = cardModel.term
    }


    class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var amount: TextView
        var term: TextView

        init {
            amount = itemView.findViewById(com.example.kifyaloanapp.R.id.amount)
            term = itemView.findViewById(com.example.kifyaloanapp.R.id.term)
        }
    }


}