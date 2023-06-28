package com.example.formulasforphysics


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.adapter.ItemAdapter7
import com.example.formulasforphysics.data.Datasource7


class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        val myDataset7 = Datasource7().loadFormulas7()

        val recyclerView7 = findViewById<RecyclerView>(R.id.recycler_view7)
        recyclerView7.adapter = ItemAdapter7(this, myDataset7)

            recyclerView7.setHasFixedSize(true)
        /*val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        //0
        var mathView70 = createMathView(R.id.math_view7,
            getString(R.string.formula70),
            pixelScaleTypeScaleDP, 22)

        //1
        var mathView71 = createMathView(R.id.math_view7,
            getString(R.string.formula71),
            pixelScaleTypeScaleDP, 20)

        //2
        var mathView72 = createMathView(R.id.math_view7,
            getString(R.string.formula72),
            pixelScaleTypeScaleDP, 20)

        //3
        var mathView73 = createMathView(R.id.math_view7,
            getString(R.string.formula73),
            pixelScaleTypeScaleDP, 20)

        //4
        var mathView74 = createMathView(R.id.math_view7,
            getString(R.string.formula74),
            pixelScaleTypeScaleDP, 20)

        //5
        var mathView75 = createMathView(R.id.math_view7,
            getString(R.string.formula75),
            pixelScaleTypeScaleDP, 20)

        //6
        var mathView76 = createMathView(R.id.math_view7,
            getString(R.string.formula76),
            pixelScaleTypeScaleDP, 20)

        //7
        var mathView77 = createMathView(R.id.math_view7,
            getString(R.string.formula77),
            pixelScaleTypeScaleDP, 20)

        //8
        var mathView78 = createMathView(R.id.math_view7,
            getString(R.string.formula78),
            pixelScaleTypeScaleDP, 20)

        //9
        var mathView79 = createMathView(R.id.math_view7,
            getString(R.string.formula79),
            pixelScaleTypeScaleDP, 20)

        //10
        val mathView710 = createMathView(R.id.math_view7,
            getString(R.string.formula710),
            pixelScaleTypeScaleDP, 20)

        //11
        val mathView711 = createMathView(R.id.math_view7,
            getString(R.string.formula711),
            pixelScaleTypeScaleDP, 20)

        //12
        val mathView712 = createMathView(R.id.math_view7,
            getString(R.string.formula712),
            pixelScaleTypeScaleDP, 20)

        //13
        val mathView713 = createMathView(R.id.math_view7,
            getString(R.string.formula713),
            pixelScaleTypeScaleDP,20)*/

        /*val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        val formulaTexts = arrayOf(
            getString(R.string.formula70),
            getString(R.string.formula71),
            getString(R.string.formula72),
            getString(R.string.formula73),
            getString(R.string.formula74),
            getString(R.string.formula75),
            getString(R.string.formula76),
            getString(R.string.formula77),
            getString(R.string.formula78),
            getString(R.string.formula79),
            getString(R.string.formula710),
            getString(R.string.formula711),
            getString(R.string.formula712),
            getString(R.string.formula713)
        )

        for (i in formulaTexts.indices) {
            createMathView(
                resources.getIdentifier("math_view7${i}", "id", packageName),
                formulaTexts[i],
                pixelScaleTypeScaleDP,
                20
            )
        }*/
    }
    /*private fun createMathView(
        viewId: Int,
        formula: String,
        pixelScaleType: MathView.Scale,
        textSize: Int,
    ): MathView {
        val mathView = findViewById<MathView>(viewId)
        mathView.text = formula
        mathView.pixelScaleType = pixelScaleType
        mathView.setTextSize(textSize)
        return mathView
    }*/
}



