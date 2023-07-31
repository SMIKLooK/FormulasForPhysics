package com.example.formulasforphysics.formulas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter8Formulas
import com.example.formulasforphysics.data.formulas.Datasource8Formulas

class Class8Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class8_formulas)

        val actionbar = supportActionBar

        actionbar!!.title = "Формулы 8 класса"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myDataset8 = Datasource8Formulas().loadFormulas8()

        val recyclerView8 = findViewById<RecyclerView>(R.id.recycler_view8_formulas)
        recyclerView8.adapter = ItemAdapter8Formulas(this, myDataset8)
    }
}