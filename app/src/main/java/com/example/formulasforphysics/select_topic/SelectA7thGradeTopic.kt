package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.ActivitySelectA7thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class7FormulasFragment
import com.example.formulasforphysics.laws.Class7LawsFragment


class SelectA7thGradeTopic : AppCompatActivity() {
    private lateinit var binding: ActivitySelectA7thGradeTopicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA7thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula7Class.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class7FormulasFragment()).commit()
        }

        binding.lawsOfPhysics7.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class7LawsFragment()).commit()
        }

        binding.back7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}