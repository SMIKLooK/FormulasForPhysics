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
        mathView70.setTextSize(20)
        mathView70.textColor = "#111111"


        val mathView71 = findViewById<MathView>(R.id.math_view71)
        mathView71.text = "\$p=m/V$"
        mathView71.pixelScaleType = MathView.Scale.SCALE_DP
        mathView71.setTextSize(16)
        mathView71.textColor = "#111111"


        val mathView72 = findViewById<MathView>(R.id.math_view72)
        mathView72.text = "\$F_{тяж}=mg$"
        mathView72.pixelScaleType = MathView.Scale.SCALE_DP
        mathView72.setTextSize(16)
        mathView72.textColor = "#111111"


        val mathView73 = findViewById<MathView>(R.id.math_view73)
        mathView73.text = "\$F_{упр}=kx$"
        mathView73.pixelScaleType = MathView.Scale.SCALE_DP
        mathView73.setTextSize(16)
        mathView73.textColor = "#111111"


        val mathView74 = findViewById<MathView>(R.id.math_view74)
        mathView74.text = "\$p=F/S$"
        mathView74.pixelScaleType = MathView.Scale.SCALE_DP
        mathView74.setTextSize(20)
        mathView74.textColor = "#111111"


        val mathView75 = findViewById<MathView>(R.id.math_view75)
        mathView75.text = "\$F_А=pgV$"
        mathView75.pixelScaleType = MathView.Scale.SCALE_DP
        mathView75.setTextSize(20)
        mathView75.textColor = "#111111"


        val mathView76 = findViewById<MathView>(R.id.math_view76)
        mathView76.text = "\$F_{тр}=μN=μmg$"
        mathView76.pixelScaleType = MathView.Scale.SCALE_DP
        mathView76.setTextSize(20)
        mathView76.textColor = "#111111"


        val mathView77 = findViewById<MathView>(R.id.math_view77)
        mathView77.text = "\$p=p_{пл.ж}gh$"
        mathView77.pixelScaleType = MathView.Scale.SCALE_DP
        mathView77.setTextSize(20)
        mathView77.textColor = "#111111"


        val mathView78 = findViewById<MathView>(R.id.math_view78)
        mathView78.text = "\$A=FS$"
        mathView78.pixelScaleType = MathView.Scale.SCALE_DP
        mathView78.setTextSize(20)
        mathView78.textColor = "#111111"


        val mathView79 = findViewById<MathView>(R.id.math_view79)
        mathView79.text = "\$N=A/t$"
        mathView79.pixelScaleType = MathView.Scale.SCALE_DP
        mathView79.setTextSize(20)
        mathView79.textColor = "#111111"


        val mathView710 = findViewById<MathView>(R.id.math_view710)
        mathView710.text = "\$F_1/F_2=l_2/l_1$"
        mathView710.pixelScaleType = MathView.Scale.SCALE_DP
        mathView710.setTextSize(20)
        mathView710.textColor = "#111111"


        val mathView711 = findViewById<MathView>(R.id.math_view711)
        mathView711.text = "\$M=Fl$"
        mathView711.pixelScaleType = MathView.Scale.SCALE_DP
        mathView711.setTextSize(20)
        mathView711.textColor = "#111111"

        val mathView712 = findViewById<MathView>(R.id.math_view712)
        mathView712.text = "\$η=A_п/A_з100%$"
        mathView712.pixelScaleType = MathView.Scale.SCALE_DP
        mathView712.setTextSize(25)
        mathView712.textColor = "#111111"


        val mathView713 = findViewById<MathView>(R.id.math_view713)
        mathView713.text = "\$E_п=mgh; E_к={mv^2}/2$"
        mathView713.pixelScaleType = MathView.Scale.SCALE_DP
        mathView713.setTextSize(20)
        mathView713.textColor = "#111111"
    }
}