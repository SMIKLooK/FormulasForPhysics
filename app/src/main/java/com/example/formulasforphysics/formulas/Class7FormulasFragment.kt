package com.example.formulasforphysics.formulas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter7Formulas
import com.example.formulasforphysics.data.formulas.Datasource7Formulas
import com.example.formulasforphysics.databinding.FragmentClass7FormulasBinding


class Class7FormulasFragment : Fragment() {
    private lateinit var binding: FragmentClass7FormulasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentClass7FormulasBinding.inflate(inflater)

        val myDataset7 = Datasource7Formulas().loadFormulas7()

        binding.recyclerView7Formulas.adapter = ItemAdapter7Formulas(this, myDataset7)

        return binding.root
    }
}