package com.example.formulasforphysics.laws

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.laws.ItemAdapter9Laws
import com.example.formulasforphysics.data.laws.Datasource9Laws

class Class9Laws : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class9_laws)

        val actionbar = supportActionBar

        actionbar!!.title = "Законы 9 класса"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myDataset9Laws = Datasource9Laws().loadLaws9()

        val recyclerView9Laws = findViewById<RecyclerView>(R.id.recycler_view9_laws)
        recyclerView9Laws.adapter = ItemAdapter9Laws(this, myDataset9Laws)
    }
}