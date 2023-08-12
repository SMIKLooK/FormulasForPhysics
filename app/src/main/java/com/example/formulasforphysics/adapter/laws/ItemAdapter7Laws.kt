package com.example.formulasforphysics.adapter.laws

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.laws.Class7LawsFragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.laws.Laws7

class ItemAdapter7Laws(
    private val context7: Class7LawsFragment,
    private val dataset7: List<Laws7>): RecyclerView.Adapter<ItemAdapter7Laws.ViewHolder7Laws>()
{
    class ViewHolder7Laws(private val view: View): RecyclerView.ViewHolder(view){
        val textView7LawsT: TextView = view.findViewById(R.id.text_view7_lawsT)
        val textView7Laws: TextView = view.findViewById(R.id.text_view7_laws)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder7Laws {
        val adapterLayout7 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_7th_laws_grade, parent, false)

        return ViewHolder7Laws(adapterLayout7)
    }

    override fun getItemCount(): Int = dataset7.size

    override fun onBindViewHolder(holder: ViewHolder7Laws, position: Int) {
        val item7 = dataset7[position]
        holder.textView7LawsT.text = context7.resources.getString(item7.StringResourceIdLawsT7)
        holder.textView7Laws.text = context7.resources.getString(item7.StringResourceIdLaws7)
    }
}