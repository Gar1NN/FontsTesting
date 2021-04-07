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
        val typeface: TextView = itemView.findViewById(R.id.Typeface)
        val font: TextView = itemView.findViewById(R.id.Font)
        val case: TextView = itemView.findViewById(R.id.Case)
        val size: TextView = itemView.findViewById(R.id.Size)
        val lineHeight: TextView = itemView.findViewById(R.id.LineHeight)
        val letterSpacing: TextView = itemView.findViewById(R.id.LetterSpacing)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return CardViewHolder(itemView)
    }

    @RequiresApi(Build.VERSION_CODES.P)
    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val item = items[position]
        if(item._case == "UPPER"){
            holder.category.text = item._category.toUpperCase()
        }
        else{
            holder.category.text = item._category
        }

        holder.category.setLineSpacing((item._lineHeight - item._size).toFloat(),1F)

        holder.category.letterSpacing = item._letterSpacing.toFloat()
        holder.category.textSize = item._size.toFloat()
        if(item._font == "Medium")
            holder.category.typeface = Typeface.create("sans-serif-medium", Typeface.NORMAL)

        holder.font.text = item._font
        holder.typeface.text = item._typeface
        holder.size.text = "Size " + item._size.toString()
        holder.letterSpacing.text = "Letter spacing " + item._letterSpacing.toString()
        holder.lineHeight.text = "Line height "  + item._lineHeight.toString()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}