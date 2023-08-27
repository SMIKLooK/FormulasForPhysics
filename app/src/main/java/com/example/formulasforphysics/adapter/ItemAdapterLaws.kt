package com.example.formulasforphysics.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.LawsFragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Laws

class ItemAdapterLaws(
    private val context: LawsFragment,
    private val dataset: List<Laws>): RecyclerView.Adapter<ItemAdapterLaws.ViewHolder8Laws>()
{
    class ViewHolder8Laws(private val view: View): RecyclerView.ViewHolder(view){
        val textView8LawsT: TextView = view.findViewById(R.id.text_view_lawsT)
        val textView8Laws: TextView = view.findViewById(R.id.text_view_laws)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8Laws {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_laws_item, parent, false)

        return ViewHolder8Laws(adapterLayout8)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ViewHolder8Laws, position: Int) {
        val item8 = dataset[position]
        holder.textView8LawsT.text = context.resources.getString(item8.StringResourceIdLawsT)
        holder.textView8Laws.text = context.resources.getString(item8.StringResourceIdLaws)
    }
}