package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.formulas.Class9Formulas
import com.example.formulasforphysics.laws.Class9Laws

class SelectA9thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a9th_grade_topic)
    }

    fun goFormulas9class(view: View){
        val goFormulas9classIntent = Intent(this, Class9Formulas::class.java)
        startActivity(goFormulas9classIntent)
    }
    fun goLawsOfPhysic9(view: View){
        val goLawsOfPhysicIntent9 = Intent(this, Class9Laws::class.java)
        startActivity(goLawsOfPhysicIntent9)
    }
    fun backMain9(view: View){
        val backMain9Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain9Intent)
    }
}