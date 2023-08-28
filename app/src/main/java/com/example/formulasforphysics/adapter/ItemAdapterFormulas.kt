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
import io.supercharge.shimmerlayout.ShimmerLayout

class ItemAdapterFormulas(
    private val dataset: List<Formulas>
): RecyclerView.Adapter<ItemAdapterFormulas.ViewHolder8Formulas>()
{
    class ViewHolder8Formulas(private val view: View): RecyclerView.ViewHolder(view) {
        private val mathView: MathView = view.findViewById(R.id.math_view_formulas)
        private val textView: TextView = view.findViewById(R.id.text_view_formulas)
        private val loader: ShimmerLayout = view.findViewById(R.id.mathLoading)
        private val formulaContainer: ViewGroup = view.findViewById(R.id.formulaContainer)

        init {
            mathView.pixelScaleType = MathView.Scale.SCALE_DP
            mathView.textColor = "#FF0080"
            mathView.setTextSize(30)
            mathView.setOnLoadListener {
                formulaContainer.visibility = View.VISIBLE
                loader.stopShimmerAnimation()
            }
        }

        fun bind(item: Formulas) {
            mathView.text = ""
            formulaContainer.visibility = View.GONE
            loader.startShimmerAnimation()
            mathView.text = view.context.resources.getString(item.mathViewResourceStringId)
            textView.text = view.context.resources.getString(item.stringResourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder8Formulas {
        val adapterLayout8 = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_formulas_item, parent, false)

        return ViewHolder8Formulas(adapterLayout8)
    }
    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: ViewHolder8Formulas, position: Int) {
        holder.bind(dataset[position])
    }
}