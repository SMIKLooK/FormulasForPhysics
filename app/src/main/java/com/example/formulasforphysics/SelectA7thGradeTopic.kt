package com.example.formulasforphysics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SelectA7thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a7th_grade_topic)
    }

    fun goFormulas7class(view: View){
        val goFormulas7classIntent = Intent(this, Class7Formulas::class.java)
        startActivity(goFormulas7classIntent)
    }

    fun backMain7(view: View){
        val backMain7Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain7Intent)
    }
}