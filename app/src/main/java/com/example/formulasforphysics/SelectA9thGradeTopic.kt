package com.example.formulasforphysics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectA9thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a9th_grade_topic)
    }

    fun goFormulas9class(view: View){
        val goFormulas9classIntent = Intent(this, Class9Formulas::class.java)
        startActivity(goFormulas9classIntent)
    }

    fun backMain9(view: View){
        val backMain9Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain9Intent)
    }
}