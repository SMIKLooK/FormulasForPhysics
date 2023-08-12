package com.example.formulasforphysics.adapter.laws

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.laws.Class8LawsFragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.laws.Laws8

class ItemAdapter8Laws(
    private val context8: Class8LawsFragment,
    private val dataset8: List<Laws8>): RecyclerView.Adapter<ItemAdapter8Laws.ViewHolder8Laws>()
{
    class ViewHolder8Laws(private val view: View): RecyclerView.ViewHolder(view){
        val textView8LawsT: TextView = view.findViewById(R.id.text_view8_lawsT)
        val textView8Laws: TextView = view.findViewById(R.id.text_view8_laws)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8Laws {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_8th_laws_grade, parent, false)

        return ViewHolder8Laws(adapterLayout8)
    }

    override fun getItemCount(): Int = dataset8.size

    override fun onBindViewHolder(holder: ViewHolder8Laws, position: Int) {
        val item8 = dataset8[position]
        holder.textView8LawsT.text = context8.resources.getString(item8.StringResourceIdLawsT8)
        holder.textView8Laws.text = context8.resources.getString(item8.StringResourceIdLaws8)
    }
}