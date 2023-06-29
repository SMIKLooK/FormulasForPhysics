package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.formulas.Class7Formulas
import com.example.formulasforphysics.laws.Class7Laws

class SelectA7thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a7th_grade_topic)
    }

    fun goFormulas7class(view: View){
        val goFormulas7classIntent = Intent(this, Class7Formulas::class.java)
        startActivity(goFormulas7classIntent)
    }

    fun goLawsOfPhysic7(view: View){
        val goLawsOfPhysicIntent7 = Intent(this, Class7Laws::class.java)
        startActivity(goLawsOfPhysicIntent7)
    }

    fun backMain7(view: View){
        val backMain7Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain7Intent)
    }
}