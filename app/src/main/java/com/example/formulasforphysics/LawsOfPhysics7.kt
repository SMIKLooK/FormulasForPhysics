package com.example.formulasforphysics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zanvent.mathview.MathView

class LawsOfPhysics7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laws_of_physics7)

        val mathview = findViewById<MathView>(R.id.mathview)
        mathview.text = "If \$ax^2+bx+c=0$ with \$a≠0$, then: $\$x={-b±√{b^2-4ac}}/{2a}$$"
        mathview.pixelScaleType = MathView.Scale.SCALE_DP
        mathview.setTextSize(16)
        mathview.textColor = "#111111"
    }
}