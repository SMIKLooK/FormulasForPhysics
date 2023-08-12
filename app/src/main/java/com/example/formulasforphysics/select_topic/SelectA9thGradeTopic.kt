package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.ActivitySelectA9thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class9FormulasFragment
import com.example.formulasforphysics.laws.Class9LawsFragment


class SelectA9thGradeTopic : AppCompatActivity() {
    private lateinit var binding: ActivitySelectA9thGradeTopicBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA9thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula9Class.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class9FormulasFragment()).commit()
        }

        binding.lawsOfPhysics9.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.select_fragment, Class9LawsFragment()).commit()
        }

        binding.back9.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}