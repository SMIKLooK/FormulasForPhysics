package com.example.formulasforphysics.laws

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.formulasforphysics.R
import com.example.formulasforphysics.adapter.laws.ItemAdapter7Laws
import com.example.formulasforphysics.data.laws.Datasource7Laws

class Class7Laws : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class7_laws)

        val myDataset7Laws = Datasource7Laws().loadLaws7()

        val recyclerView7Laws = findViewById<RecyclerView>(R.id.recycler_view7_laws)
        recyclerView7Laws.adapter = ItemAdapter7Laws(this, myDataset7Laws)
    }
}