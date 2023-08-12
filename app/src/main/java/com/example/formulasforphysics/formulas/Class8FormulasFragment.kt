package com.example.formulasforphysics.formulas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.Formulas.ItemAdapter8Formulas
import com.example.formulasforphysics.data.formulas.Datasource8Formulas
import com.example.formulasforphysics.databinding.FragmentClass8FormulasBinding

class Class8FormulasFragment : Fragment() {
    private lateinit var binding: FragmentClass8FormulasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClass8FormulasBinding.inflate(inflater)

        val myDataset8 = Datasource8Formulas().loadFormulas8()

        binding.recyclerView8Formulas.adapter = ItemAdapter8Formulas(this, myDataset8)

        return binding.root
    }
}