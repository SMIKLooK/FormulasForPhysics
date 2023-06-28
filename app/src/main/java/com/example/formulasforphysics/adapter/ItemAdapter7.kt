package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas7
import com.zanvent.mathview.MathView

class ItemAdapter7(
    private val context7: Context,
    private val dataset7: List<Formulas7>): RecyclerView.Adapter<ItemAdapter7.ViewHolder7>()
{
    class ViewHolder7(private val view: View):RecyclerView.ViewHolder(view) {
        val mathView7: MathView = view.findViewById(R.id.math_view7)
        val textView7: TextView = view.findViewById(R.id.text_view7)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder7 {
        val adapterLayout7 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_7th_grade, parent, false)

        return ViewHolder7(adapterLayout7)
    }

    override fun getItemCount(): Int = dataset7.size

    override fun onBindViewHolder(holder: ViewHolder7, position: Int) {
        val item7 = dataset7[position]
        holder.mathView7.text = context7.resources.getString(item7.mathViewResourceStringId7)
        holder.mathView7.pixelScaleType = MathView.Scale.SCALE_DP
        holder.mathView7.textColor = "#111111"
        holder.mathView7.setTextSize(20)
        holder.textView7.text = context7.resources.getString(item7.stringResourceId7)
    }
}