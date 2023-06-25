package com.example.formulasforphysics


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zanvent.mathview.MathView

class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        //0
        createMathView(R.id.math_view70,
            getString(R.string.formula70),
            pixelScaleTypeScaleDP, 22)

        //1
        createMathView(R.id.math_view71,
            getString(R.string.formula71),
            pixelScaleTypeScaleDP, 20)

        //2
        createMathView(R.id.math_view72,
            getString(R.string.formula72),
            pixelScaleTypeScaleDP, 20)

        //3
        createMathView(R.id.math_view73,
            getString(R.string.formula73),
            pixelScaleTypeScaleDP, 20)

        //4
        createMathView(R.id.math_view74,
            getString(R.string.formula74),
            pixelScaleTypeScaleDP, 20)

        //5
        createMathView(R.id.math_view75,
            getString(R.string.formula75),
            pixelScaleTypeScaleDP, 20)

        //6
        createMathView(R.id.math_view76,
            getString(R.string.formula76),
            pixelScaleTypeScaleDP, 20)

        //7
        createMathView(R.id.math_view77,
            getString(R.string.formula77),
            pixelScaleTypeScaleDP, 20)

        //8
        createMathView(R.id.math_view78,
            getString(R.string.formula78),
            pixelScaleTypeScaleDP, 20)

        //9
        createMathView(R.id.math_view79,
            getString(R.string.formula79),
            pixelScaleTypeScaleDP, 20)

        //10
        createMathView(R.id.math_view710,
            getString(R.string.formula710),
            pixelScaleTypeScaleDP, 20)

        //11
        createMathView(R.id.math_view711,
            getString(R.string.formula711),
            pixelScaleTypeScaleDP, 20)

        //12
        createMathView(R.id.math_view712,
            getString(R.string.formula712),
            pixelScaleTypeScaleDP, 20)

        //13
        createMathView(R.id.math_view713,
            getString(R.string.formula713),
            pixelScaleTypeScaleDP,20)
    }
    private fun createMathView(viewId: Int,
                               formula: String,
                               pixelScaleType: MathView.Scale,
                               textSize: Int,): MathView {
        val mathView = findViewById<MathView>(viewId)
        mathView.text = formula
        mathView.pixelScaleType = pixelScaleType
        mathView.setTextSize(textSize)
        return mathView
    }
}

