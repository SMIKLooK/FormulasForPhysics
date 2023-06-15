package com.example.formulasforphysics.data

import com.example.formulasforphysics.R
import com.example.formulasforphysics.model.Formulas9

class Datasource9 {
    fun loadFormulas9(): List<Formulas9> {
        return listOf<Formulas9>(
            Formulas9(R.string.formula71, R.drawable.formula71),
            Formulas9(R.string.formula72, R.drawable.formula72),
            Formulas9(R.string.formula73, R.drawable.formula73),
            Formulas9(R.string.formula74, R.drawable.formula74),
            Formulas9(R.string.formula75, R.drawable.formula75)
        )
    }
}