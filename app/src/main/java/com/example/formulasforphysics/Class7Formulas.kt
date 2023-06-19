package com.example.formulasforphysics

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.adapter.ItemAdapter7
import com.example.formulasforphysics.data.Datasource7


class Class7Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_formulas)

        val myDataset7 = Datasource7().loadFormulas7()

        val recyclerView7 = findViewById<RecyclerView>(R.id.recycler_view7)
        recyclerView7.adapter = ItemAdapter7(this, myDataset7)
    }
}