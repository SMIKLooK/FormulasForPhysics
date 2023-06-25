package com.example.formulasforphysics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zanvent.mathview.MathView

class Class8Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class8_formulas)

        val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        //0
        createMathView(R.id.math_view80,
            getString(R.string.formula80),
            pixelScaleTypeScaleDP, 22)

        //1
        createMathView(R.id.math_view81,
            getString(R.string.formula81),
            pixelScaleTypeScaleDP, 20)

        //2
        createMathView(R.id.math_view82,
            getString(R.string.formula82),
            pixelScaleTypeScaleDP, 20)

        //3
        createMathView(R.id.math_view83,
            getString(R.string.formula83),
            pixelScaleTypeScaleDP, 20)

        //4
        createMathView(R.id.math_view84,
            getString(R.string.formula84),
            pixelScaleTypeScaleDP, 20)

        //5
        createMathView(R.id.math_view85,
            getString(R.string.formula85),
            pixelScaleTypeScaleDP, 20)

        //6
        createMathView(R.id.math_view86,
            getString(R.string.formula86),
            pixelScaleTypeScaleDP, 20)

        //7
        createMathView(R.id.math_view87,
            getString(R.string.formula87),
            pixelScaleTypeScaleDP, 20)

        //8
        createMathView(R.id.math_view88,
            getString(R.string.formula88),
            pixelScaleTypeScaleDP, 20)

        //9
        createMathView(R.id.math_view89,
            getString(R.string.formula89),
            pixelScaleTypeScaleDP, 20)

        //10
        createMathView(R.id.math_view810,
            getString(R.string.formula810),
            pixelScaleTypeScaleDP, 20)

        //11
        createMathView(R.id.math_view811,
            getString(R.string.formula811),
            pixelScaleTypeScaleDP, 20)


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