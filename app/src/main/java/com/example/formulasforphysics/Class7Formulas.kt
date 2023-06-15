package com.example.formulasforphysics

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zanvent.mathview.MathView


class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        /*val myDataset7 = Datasource7().loadFormulas7()

        val recyclerView7 = findViewById<RecyclerView>(R.id.recycler_view7)
        recyclerView7.adapter = ItemAdapter7(this, myDataset7)*/

        val mathview = findViewById<MathView>(R.id.mathview)
        mathview.text = "If \$ax^2+bx+c=0$ with \$a≠0$, then: $\$x={-b±√{b^2-4ac}}/{2a}$$"
        mathview.pixelScaleType = MathView.Scale.SCALE_DP
        mathview.setTextSize(16)
        mathview.textColor = "#111111"
    }
}