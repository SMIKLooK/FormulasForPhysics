package com.example.formulasforphysics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectA8thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a8th_grade_topic)
    }

    fun goFormulas8class(view: View){
        val goFormulas8classIntent = Intent(this, Class8Formulas::class.java)
        startActivity(goFormulas8classIntent)
    }

    fun backMain8(view: View){
        val backMain8Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain8Intent)
    }
}