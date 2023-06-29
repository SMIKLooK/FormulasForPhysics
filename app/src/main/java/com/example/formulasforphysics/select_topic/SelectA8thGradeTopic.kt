package com.example.formulasforphysics.select_topic

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.formulasforphysics.MainActivity
import com.example.formulasforphysics.R
import com.example.formulasforphysics.formulas.Class8Formulas
import com.example.formulasforphysics.laws.Class8Laws

class SelectA8thGradeTopic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_a8th_grade_topic)
    }

    fun goFormulas8class(view: View){
        val goFormulas8classIntent = Intent(this, Class8Formulas::class.java)
        startActivity(goFormulas8classIntent)
    }
    fun goLawsOfPhysic8(view: View){
        val goLawsOfPhysicIntent8 = Intent(this, Class8Laws::class.java)
        startActivity(goLawsOfPhysicIntent8)
    }
    fun backMain8(view: View){
        val backMain8Intent = Intent(this, MainActivity::class.java)
        startActivity(backMain8Intent)
    }
}