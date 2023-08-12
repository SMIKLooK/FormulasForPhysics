package com.example.formulasforphysics.formulas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter9Formulas
import com.example.formulasforphysics.data.formulas.Datasource9Formulas
import com.example.formulasforphysics.databinding.FragmentClass9FormulasBinding

class Class9FormulasFragment : Fragment() {
    private lateinit var binding: FragmentClass9FormulasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentClass9FormulasBinding.inflate(inflater)

        val myDataset9 = Datasource9Formulas().loadFormulas9()
        
        binding.recyclerView9Formulas.adapter = ItemAdapter9Formulas(this, myDataset9)

        return binding.root
    }
}