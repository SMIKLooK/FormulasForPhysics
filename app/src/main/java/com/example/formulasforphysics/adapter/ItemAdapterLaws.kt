package com.example.formulasforphysics.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Laws

class ItemAdapterLaws(private val items: MutableList<Laws>) :
    RecyclerView.Adapter<ItemAdapterLaws.ItemViewHolder>() {

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.text_view_lawsT)
        val expandedTextView: TextView = view.findViewById(R.id.text_view_laws)

        fun bind(item: Laws){
            textView.text = itemView.resources.getString(item.StringResourceIdLawsT)
            expandedTextView.text = itemView.resources.getString(item.StringResourceIdLaws)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_laws_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]

        holder.bind(items[position])

        holder.textView.setOnClickListener {
            val item = items[position]
            item.isExpanded = !item.isExpanded
            notifyItemChanged(position)
        }
        if (item.isExpanded) {
            holder.expandedTextView.visibility = View.VISIBLE
        } else {
            holder.expandedTextView.visibility = View.GONE
        }
    }

    override fun getItemCount(): Int = items.size
}