package com.example.formulasforphysics

import androidx.appcompat.app.AppCompatActivity
import com.zanvent.mathview.MathView

val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

class CreateMathView : AppCompatActivity() {
    fun createMathView(viewId: Int,
                       formula: String,
                       pixelScaleType: MathView.Scale,
                       textSize: Int) : MathView{
        val mathView = findViewById<MathView>(viewId)
        mathView.text = formula
        mathView.pixelScaleType = pixelScaleType
        mathView.setTextSize(textSize)
        return mathView
    }
}

