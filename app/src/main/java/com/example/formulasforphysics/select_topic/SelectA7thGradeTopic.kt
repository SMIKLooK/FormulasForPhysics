package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.databinding.ActivitySelectA7thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class7Formulas
import com.example.formulasforphysics.laws.Class7Laws

private lateinit var binding: ActivitySelectA7thGradeTopicBinding

class SelectA7thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectA7thGradeTopicBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.formula7Class.setOnClickListener {
            val intent = Intent(this, Class7Formulas::class.java)
            startActivity(intent)
        }

        binding.lawsOfPhysics7.setOnClickListener {
            val intent = Intent(this, Class7Laws::class.java)
            startActivity(intent)
        }

        binding.back7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}