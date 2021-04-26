package com.example.fontstesting

import android.graphics.Typeface
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class CardRecyclerAdapter(private val items: ArrayList<CardViewClass>):
    RecyclerView.Adapter<CardRecyclerAdapter.CardViewHolder>() {

    class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var category: TextView = itemView.findViewById(R.id.Category)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return CardViewHolder(itemView)
    }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = items[position]
        holder.category.setTextAppearance(item.style)
        holder.category.text = item.category


    }

    override fun getItemCount(): Int {
        return items.size
    }
}