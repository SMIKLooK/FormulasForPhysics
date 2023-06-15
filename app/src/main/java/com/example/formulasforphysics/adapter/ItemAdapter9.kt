package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas9

class ItemAdapter9 (
    private val context9: Context,
    private val dataset9: List<Formulas9>) : RecyclerView.Adapter<ItemAdapter9.ItemViewHolder9>() {

    class ItemViewHolder9(private  val view: View) : RecyclerView.ViewHolder(view) {
        val textView9: TextView = view.findViewById(R.id.item_title9)
        val imageView9: ImageView = view.findViewById(R.id.item_image9)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder9 {
        val adapterLayout9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item9, parent, false)

        return ItemViewHolder9(adapterLayout9)
    }

    override fun getItemCount() = dataset9.size

    override fun onBindViewHolder(holder: ItemViewHolder9, position: Int) {
        val item = dataset9[position]
        holder.textView9.text = context9.resources.getString(item.stringResourceId9)
        holder.imageView9.setImageResource(item.imageResourceId9)
    }
}