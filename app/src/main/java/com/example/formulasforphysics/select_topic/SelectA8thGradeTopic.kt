package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.ActivitySelectA8thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class8FormulasFragment
import com.example.formulasforphysics.laws.Class8LawsFragment


class SelectA8thGradeTopic : AppCompatActivity() {
    private lateinit var binding: ActivitySelectA8thGradeTopicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA8thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula8Class.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class8FormulasFragment()).commit()
        }

        binding.lawsOfPhysics8.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class8LawsFragment()).commit()
        }

        binding.back8.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}