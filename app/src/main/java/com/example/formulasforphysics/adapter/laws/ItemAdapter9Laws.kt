package com.example.formulasforphysics.adapter.laws

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.laws.Class9LawsFragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.laws.Laws9

class ItemAdapter9Laws(
    private val context9: Class9LawsFragment,
    private val dataset9: List<Laws9>): RecyclerView.Adapter<ItemAdapter9Laws.ViewHolder9Laws>()
{
    class ViewHolder9Laws(private val view: View): RecyclerView.ViewHolder(view){
        val textView9LawsT: TextView = view.findViewById(R.id.text_view9_lawsT)
        val textView9Laws: TextView = view.findViewById(R.id.text_view9_laws)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder9Laws {
        val adapterLayout9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_9th_laws_grade, parent, false)

        return ViewHolder9Laws(adapterLayout9)
    }

    override fun getItemCount(): Int = dataset9.size

    override fun onBindViewHolder(holder: ViewHolder9Laws, position: Int) {
        val item9 = dataset9[position]
        holder.textView9LawsT.text = context9.resources.getString(item9.StringResourceIdLawsT9)
        holder.textView9Laws.text = context9.resources.getString(item9.StringResourceIdLaws9)
    }
}