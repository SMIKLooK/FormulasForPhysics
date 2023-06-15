package com.example.formulasforphysics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.adapter.ItemAdapter8
import com.example.formulasforphysics.data.Datasource8

class Class8Formulas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class8_formulas)

        val myDataset8 = Datasource8().loadFormulas8()

        val recyclerView8 = findViewById<RecyclerView>(R.id.recycler_view8)
        recyclerView8.adapter = ItemAdapter8(this, myDataset8)
    }
}