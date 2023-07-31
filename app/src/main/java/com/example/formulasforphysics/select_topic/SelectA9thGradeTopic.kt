package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.databinding.ActivitySelectA9thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class9Formulas
import com.example.formulasforphysics.laws.Class9Laws

private lateinit var binding: ActivitySelectA9thGradeTopicBinding

class SelectA9thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA9thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula9Class.setOnClickListener {
            val intent = Intent(this, Class9Formulas::class.java)
            startActivity(intent)
        }

        binding.lawsOfPhysics9.setOnClickListener {
            val intent = Intent(this, Class9Laws::class.java)
            startActivity(intent)
        }

        binding.back9.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}