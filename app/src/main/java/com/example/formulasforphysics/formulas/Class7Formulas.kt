package com.example.formulasforphysics.formulas


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter7Formulas
import com.example.formulasforphysics.data.formulas.Datasource7Formulas


class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        val actionbar = supportActionBar

        actionbar!!.title = "Формулы 7 класса"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myDataset7 = Datasource7Formulas().loadFormulas7()

        val recyclerView7 = findViewById<RecyclerView>(R.id.recycler_view7_formulas)
        recyclerView7.adapter = ItemAdapter7Formulas(this, myDataset7)
    }
}



