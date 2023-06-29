package com.example.formulasforphysics

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.select_topic.SelectA7thGradeTopic
import com.example.formulasforphysics.select_topic.SelectA8thGradeTopic
import com.example.formulasforphysics.select_topic.SelectA9thGradeTopic

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun selectTopic7(view: View){
        val selectA7thGradeTopicIntent = Intent(this, SelectA7thGradeTopic::class.java)
        startActivity(selectA7thGradeTopicIntent)
    }
    fun selectTopic8(view: View){
        val selectA8thGradeTopicIntent = Intent(this, SelectA8thGradeTopic::class.java)
        startActivity(selectA8thGradeTopicIntent)
    }
    fun selectTopic9(view: View){
        val selectA9thGradeTopicIntent = Intent(this, SelectA9thGradeTopic::class.java)
        startActivity(selectA9thGradeTopicIntent)
    }
}