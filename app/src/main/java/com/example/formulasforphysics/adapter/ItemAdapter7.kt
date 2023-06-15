package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas7

class ItemAdapter7 (
    private val context7: Context,
    private val dataset7: List<Formulas7>) : RecyclerView.Adapter<ItemAdapter7.ItemViewHolder7>() {

    class ItemViewHolder7(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView7: TextView = view.findViewById(R.id.item_title7)
        val imageView7: ImageView = view.findViewById(R.id.item_image7)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder7 {
        val adapterLayout7 = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item7, parent, false)

        return ItemViewHolder7(adapterLayout7)
    }

    override fun getItemCount() = dataset7.size

    override fun onBindViewHolder(holder: ItemViewHolder7, position: Int) {
        val item = dataset7[position]
        holder.textView7.text = context7.resources.getString(item.stringResourceId7)
        holder.imageView7.setImageResource(item.imageResourceId8)
    }
}