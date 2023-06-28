package com.example.formulasforphysics.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas8
import com.zanvent.mathview.MathView

class ItemAdapter8 (
    private val context8: Context,
    private val dataset8: List<Formulas8>): RecyclerView.Adapter<ItemAdapter8.ViewHolder8>()
{
    class ViewHolder8(private val view: View): RecyclerView.ViewHolder(view) {
        val mathView8: MathView = view.findViewById(R.id.math_view8)
        val textView8: TextView = view.findViewById(R.id.text_view8)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8 {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_8th_grade, parent, false)

        return ViewHolder8(adapterLayout8)
    }

    override fun getItemCount(): Int = dataset8.size

    override fun onBindViewHolder(holder: ViewHolder8, position: Int) {
        val item8 = dataset8[position]
        holder.mathView8.text = context8.resources.getString(item8.mathViewResourceStringId8)
        holder.mathView8.pixelScaleType = MathView.Scale.SCALE_DP
        holder.mathView8.textColor = "#111111"
        holder.mathView8.setTextSize(20)
        holder.textView8.text = context8.resources.getString(item8.stringResourceId8)
    }
}