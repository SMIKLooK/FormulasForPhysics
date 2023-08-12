package com.example.formulasforphysics.laws

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.laws.ItemAdapter9Laws
import com.example.formulasforphysics.data.laws.Datasource9Laws
import com.example.formulasforphysics.databinding.FragmentClass9LawsBinding

class Class9LawsFragment : Fragment() {
    private lateinit var binding: FragmentClass9LawsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClass9LawsBinding.inflate(inflater)

        val myDataset9Laws = Datasource9Laws().loadLaws9()

        binding.recyclerView9Laws.adapter = ItemAdapter9Laws(this, myDataset9Laws)

        return binding.root
    }
}