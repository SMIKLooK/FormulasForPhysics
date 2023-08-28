package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.ItemAdapterFormulas
import com.example.formulasforphysics.data.formulas.Datasource7Formulas
import com.example.formulasforphysics.data.formulas.Datasource8Formulas
import com.example.formulasforphysics.data.formulas.Datasource9Formulas
import com.example.formulasforphysics.databinding.FragmentFormulasBinding

class FormulasFragment : Fragment() {
    private lateinit var binding: FragmentFormulasBinding

    private val list =  listOf(
        Datasource7Formulas().loadFormulas7(),
        Datasource8Formulas().loadFormulas8(),
        Datasource9Formulas().loadFormulas9()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentFormulasBinding.inflate(inflater)

        val value = arguments?.getInt("numberF")
        val mData = list[value!!]

        binding.recyclerViewFormulas.adapter = ItemAdapterFormulas(mData)

        return binding.root
    }
}