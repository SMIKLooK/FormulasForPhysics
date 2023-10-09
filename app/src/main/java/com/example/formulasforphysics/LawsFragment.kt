package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.ItemAdapterLaws
import com.example.formulasforphysics.data.laws.listLaws
import com.example.formulasforphysics.databinding.FragmentLawsBinding

class LawsFragment : Fragment() {
    private lateinit var binding: FragmentLawsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLawsBinding.inflate(inflater)

        val value = arguments?.getInt("numberL")
        val mData = listLaws[value!!]

        binding.recyclerViewLaws.adapter = ItemAdapterLaws(mData)

        return binding.root
    }
}