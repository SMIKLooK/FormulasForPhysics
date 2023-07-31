package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.databinding.ActivitySelectA8thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class8Formulas
import com.example.formulasforphysics.laws.Class8Laws

private lateinit var binding: ActivitySelectA8thGradeTopicBinding
class SelectA8thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA8thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula8Class.setOnClickListener {
            val intent = Intent(this, Class8Formulas::class.java)
            startActivity(intent)
        }

        binding.lawsOfPhysics8.setOnClickListener {
            val intent = Intent(this, Class8Laws::class.java)
            startActivity(intent)
        }

        binding.back8.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}