package com.example.formulasforphysics.adapter.Formulas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.formulas.Class9FormulasFragment
import com.example.formulasforphysics.model.formulas.Formulas9
import com.zanvent.mathview.MathView

class ItemAdapter9Formulas(
    private val context9: Class9FormulasFragment,
    private val dataset9: List<Formulas9>): RecyclerView.Adapter<ItemAdapter9Formulas.ViewHolder9Formulas>()
{
    class ViewHolder9Formulas(private val view: View): RecyclerView.ViewHolder(view){
        val mathView9: MathView = view.findViewById(R.id.math_view9_formulas)
        val textView9: TextView = view.findViewById(R.id.text_view9_formulas)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder9Formulas {
        val adapterLayout9 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_9th_formulas_grade, parent, false)

        return ViewHolder9Formulas(adapterLayout9)
    }

    override fun getItemCount(): Int = dataset9.size

    override fun onBindViewHolder(holder: ViewHolder9Formulas, position: Int) {
        val item9 = dataset9[position]
        holder.mathView9.text = context9.resources.getString(item9.mathViewResourceStringId9)
        holder.mathView9.pixelScaleType = MathView.Scale.SCALE_DP
        holder.mathView9.textColor = "#FF0080"
        holder.mathView9.setTextSize(30)
        holder.textView9.text = context9.resources.getString(item9.StringResourceId9)
    }
}