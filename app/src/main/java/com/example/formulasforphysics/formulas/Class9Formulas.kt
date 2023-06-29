package com.example.formulasforphysics.formulas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter9Formulas
import com.example.formulasforphysics.data.formulas.Datasource9Formulas

class Class9Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class9_formulas)

        val myDataset9 = Datasource9Formulas().loadFormulas9()

        val recyclerView9 = findViewById<RecyclerView>(R.id.recycler_view9_formulas)
        recyclerView9.adapter = ItemAdapter9Formulas(this, myDataset9)
    }
}