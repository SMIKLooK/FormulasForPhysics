package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas9
import com.zanvent.mathview.MathView

class ItemAdapter9(
    private val context9: Context,
    private val dataset9: List<Formulas9>): RecyclerView.Adapter<ItemAdapter9.ViewHolder9>()
{
    class ViewHolder9(private val view: View): RecyclerView.ViewHolder(view){
        val mathView9: MathView = view.findViewById(R.id.math_view9)
        val textView9: TextView = view.findViewById(R.id.text_view9)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder9 {
        val adapterLayout9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_9th_grade, parent, false)

        return ViewHolder9(adapterLayout9)
    }

    override fun getItemCount(): Int = dataset9.size

    override fun onBindViewHolder(holder: ViewHolder9, position: Int) {
        val item9 = dataset9[position]
        holder.mathView9.text = context9.resources.getString(item9.mathViewResourceStringId9)
        holder.mathView9.pixelScaleType = MathView.Scale.SCALE_DP
        holder.mathView9.textColor = "#111111"
        holder.mathView9.setTextSize(20)
        holder.textView9.text = context9.resources.getString(item9.StringResourceId9)
    }
}