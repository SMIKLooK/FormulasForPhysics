package com.example.formulasforphysics.laws

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.laws.ItemAdapter8Laws
import com.example.formulasforphysics.data.laws.Datasource8Laws

class Class8Laws : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class8_laws)

        val myDataset8Laws = Datasource8Laws().loadLaws8()

        val recyclerView8Laws = findViewById<RecyclerView>(R.id.recycler_view8_laws)
        recyclerView8Laws.adapter = ItemAdapter8Laws(this, myDataset8Laws)
    }
}