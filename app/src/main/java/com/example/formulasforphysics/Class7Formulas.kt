package com.example.formulasforphysics


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zanvent.mathview.MathView


class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        val mathView70 = findViewById<MathView>(R.id.math_view70)
        mathView70.text = "\$v=S/t$"
        mathView70.pixelScaleType = MathView.Scale.SCALE_DP
        mathView70.setTextSize(16)
        mathView70.textColor = "#111111"

        val mathView71 = findViewById<MathView>(R.id.math_view71)
        mathView71.text = "\$p=m/V$"
        mathView71.pixelScaleType = MathView.Scale.SCALE_DP
        mathView71.setTextSize(16)
        mathView71.textColor = "#111111"

        val mathView72 = findViewById<MathView>(R.id.math_view72)
        mathView72.text = "\$F=mg$"
        mathView72.pixelScaleType = MathView.Scale.SCALE_DP
        mathView72.setTextSize(16)
        mathView72.textColor = "#111111"

        val mathView73 = findViewById<MathView>(R.id.math_view73)
        mathView73.text = "\$F=kx$"
        mathView73.pixelScaleType = MathView.Scale.SCALE_DP
        mathView73.setTextSize(16)
        mathView73.textColor = "#111111"

        val mathView74 = findViewById<MathView>(R.id.math_view74)
        mathView74.text = "\$p=F/S$"
        mathView74.pixelScaleType = MathView.Scale.SCALE_DP
        mathView74.setTextSize(16)
        mathView74.textColor = "#111111"
        /*val myDataset7 = Datasource7().loadFormulas7()

        val recyclerView7 = findViewById<RecyclerView>(R.id.recycler_view7)
        recyclerView7.adapter = ItemAdapter7(this, myDataset7)*/
    }
}