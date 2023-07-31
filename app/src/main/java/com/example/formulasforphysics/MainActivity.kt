package com.example.formulasforphysics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.databinding.ActivityMainBinding
import com.example.formulasforphysics.select_topic.SelectA7thGradeTopic
import com.example.formulasforphysics.select_topic.SelectA8thGradeTopic
import com.example.formulasforphysics.select_topic.SelectA9thGradeTopic

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.sevenClass.setOnClickListener {
            val intent = Intent(this, SelectA7thGradeTopic::class.java)
            startActivity(intent)
        }

        binding.eighthClass.setOnClickListener {
            val intent = Intent(this, SelectA8thGradeTopic::class.java)
            startActivity(intent)
        }

        binding.ninthClass.setOnClickListener {
            val intent = Intent(this, SelectA9thGradeTopic::class.java)
            startActivity(intent)
        }
    }
}