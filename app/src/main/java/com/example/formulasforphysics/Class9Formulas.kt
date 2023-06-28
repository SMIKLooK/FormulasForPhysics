package com.example.formulasforphysics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.adapter.ItemAdapter9
import com.example.formulasforphysics.data.Datasource9

class Class9Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class9_formulas)

        val myDataset9 = Datasource9().loadFormulas9()

        val recyclerView9 = findViewById<RecyclerView>(R.id.recycler_view9)
        recyclerView9.adapter = ItemAdapter9(this, myDataset9)

        recyclerView9.setHasFixedSize(true)

        /*val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        //0
        createMathView(R.id.math_view90,
            getString(R.string.formula90),
            pixelScaleTypeScaleDP, 22)

        //1
        createMathView(R.id.math_view91,
            getString(R.string.formula91),
            pixelScaleTypeScaleDP, 20)

        //2
        createMathView(R.id.math_view92,
            getString(R.string.formula92),
            pixelScaleTypeScaleDP, 20)

        //3
        createMathView(R.id.math_view93,
            getString(R.string.formula93),
            pixelScaleTypeScaleDP, 20)

        //4
        createMathView(R.id.math_view94,
            getString(R.string.formula94),
            pixelScaleTypeScaleDP, 20)

        //5
        createMathView(R.id.math_view95,
            getString(R.string.formula95),
            pixelScaleTypeScaleDP, 20)

        //6
        createMathView(R.id.math_view96,
            getString(R.string.formula96),
            pixelScaleTypeScaleDP, 20)

        //7
        createMathView(R.id.math_view97,
            getString(R.string.formula97),
            pixelScaleTypeScaleDP, 20)

        //8
        createMathView(R.id.math_view98,
            getString(R.string.formula98),
            pixelScaleTypeScaleDP, 20)

        //9
        createMathView(R.id.math_view99,
            getString(R.string.formula99),
            pixelScaleTypeScaleDP, 20)

        //10
        createMathView(R.id.math_view910,
            getString(R.string.formula910),
            pixelScaleTypeScaleDP, 20)

        //11
        createMathView(R.id.math_view911,
            getString(R.string.formula911),
            pixelScaleTypeScaleDP, 20)

        //12
        createMathView(R.id.math_view912,
            getString(R.string.formula912),
            pixelScaleTypeScaleDP, 20)

        //13
        createMathView(R.id.math_view913,
            getString(R.string.formula913),
            pixelScaleTypeScaleDP, 22)

        //14
        createMathView(R.id.math_view914,
            getString(R.string.formula914),
            pixelScaleTypeScaleDP, 20)

        //15
        createMathView(R.id.math_view915,
            getString(R.string.formula915),
            pixelScaleTypeScaleDP, 20)

        //16
        createMathView(R.id.math_view916,
            getString(R.string.formula916),
            pixelScaleTypeScaleDP, 20)

        //17
        createMathView(R.id.math_view917,
            getString(R.string.formula917),
            pixelScaleTypeScaleDP, 20)

        //18
        createMathView(R.id.math_view918,
            getString(R.string.formula918),
            pixelScaleTypeScaleDP, 20)

        //19
        createMathView(R.id.math_view919,
            getString(R.string.formula919),
            pixelScaleTypeScaleDP, 20)

        //20
        createMathView(R.id.math_view920,
            getString(R.string.formula920),
            pixelScaleTypeScaleDP, 20)

        //21
        createMathView(R.id.math_view921,
            getString(R.string.formula921),
            pixelScaleTypeScaleDP, 20)

        //22
        createMathView(R.id.math_view922,
            getString(R.string.formula922),
            pixelScaleTypeScaleDP, 20)

        //23
        createMathView(R.id.math_view923,
            getString(R.string.formula923),
            pixelScaleTypeScaleDP, 20)

        //24
        createMathView(R.id.math_view924,
            getString(R.string.formula924),
            pixelScaleTypeScaleDP, 20)

        //25
        createMathView(R.id.math_view925,
            getString(R.string.formula925),
            pixelScaleTypeScaleDP, 20)

        //26
        createMathView(R.id.math_view926,
            getString(R.string.formula926),
            pixelScaleTypeScaleDP, 22)

        //27
        createMathView(R.id.math_view927,
            getString(R.string.formula927),
            pixelScaleTypeScaleDP, 20)

        //28
        createMathView(R.id.math_view928,
            getString(R.string.formula928),
            pixelScaleTypeScaleDP, 20)*/

        /*val pixelScaleTypeScaleDP = MathView.Scale.SCALE_DP

        val formulaTexts = arrayOf(
            getString(R.string.formula90),
            getString(R.string.formula91),
            getString(R.string.formula92),
            getString(R.string.formula93),
            getString(R.string.formula94),
            getString(R.string.formula95),
            getString(R.string.formula96),
            getString(R.string.formula97),
            getString(R.string.formula98),
            getString(R.string.formula99),
            getString(R.string.formula910),
            getString(R.string.formula911),
            getString(R.string.formula912),
            getString(R.string.formula913),
            getString(R.string.formula914),
            getString(R.string.formula915),
            getString(R.string.formula916),
            getString(R.string.formula917),
            getString(R.string.formula918),
            getString(R.string.formula919),
            getString(R.string.formula920),
            getString(R.string.formula921),
            getString(R.string.formula922),
            getString(R.string.formula923),
            getString(R.string.formula924),
            getString(R.string.formula925),
            getString(R.string.formula926),
            getString(R.string.formula927),
            getString(R.string.formula928),
        )

        for (i in formulaTexts.indices) {
            createMathView(
                resources.getIdentifier("math_view9${i}", "id", packageName),
                formulaTexts[i],
                pixelScaleTypeScaleDP,
                20
            )
        }

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
    }*/
    }
}