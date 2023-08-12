package com.example.formulasforphysics.laws

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.laws.ItemAdapter8Laws
import com.example.formulasforphysics.data.laws.Datasource8Laws
import com.example.formulasforphysics.databinding.FragmentClass8LawsBinding

class Class8LawsFragment : Fragment() {
    private lateinit var binding: FragmentClass8LawsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding  = FragmentClass8LawsBinding.inflate(inflater)

        val myDataset8Laws = Datasource8Laws().loadLaws8()

        binding.recyclerView8Laws.adapter = ItemAdapter8Laws(this, myDataset8Laws)

        return binding.root
    }
}