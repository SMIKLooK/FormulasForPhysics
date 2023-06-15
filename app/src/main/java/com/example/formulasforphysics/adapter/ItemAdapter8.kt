package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas8

class ItemAdapter8 (
    private val context8: Context,
    private val dataset8: List<Formulas8>) : RecyclerView.Adapter<ItemAdapter8.ItemViewHolder8>() {

    class ItemViewHolder8(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView8: TextView = view.findViewById(R.id.item_title8)
        val imageView8: ImageView = view.findViewById(R.id.item_image8)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder8 {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item8, parent, false)

        return ItemViewHolder8(adapterLayout8)
    }

    override fun getItemCount() = dataset8.size

    override fun onBindViewHolder(holder: ItemViewHolder8, position: Int) {
        val item = dataset8[position]
        holder.textView8.text = context8.resources.getString(item.stringResourceId8)
        holder.imageView8.setImageResource(item.imageResourceId8)
    }
}