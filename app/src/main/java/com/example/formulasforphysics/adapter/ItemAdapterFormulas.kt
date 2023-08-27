package com.example.formulasforphysics.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.FormulasFragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas
import com.zanvent.mathview.MathView

class ItemAdapterFormulas(
    private val context: FormulasFragment,
    private val dataset: List<Formulas>
): RecyclerView.Adapter<ItemAdapterFormulas.ViewHolder8Formulas>()
{
    class ViewHolder8Formulas(private val view: View): RecyclerView.ViewHolder(view) {
        val mathView: MathView = view.findViewById(R.id.math_view_formulas)
        val textView: TextView = view.findViewById(R.id.text_view_formulas)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8Formulas {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_formulas_item, parent, false)

        return ViewHolder8Formulas(adapterLayout8)
    }
    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ViewHolder8Formulas, position: Int) {
        val item = dataset[position]
        holder.mathView.text = context.resources.getString(item.mathViewResourceStringId)
        holder.mathView.pixelScaleType = MathView.Scale.SCALE_DP
        holder.mathView.textColor = "#FF0080"
        holder.mathView.setTextSize(30)
        holder.textView.text = context.resources.getString(item.stringResourceId)
    }
}