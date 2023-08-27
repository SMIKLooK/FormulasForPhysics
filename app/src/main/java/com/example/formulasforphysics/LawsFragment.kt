package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.ItemAdapterLaws
import com.example.formulasforphysics.data.laws.Datasource7Laws
import com.example.formulasforphysics.data.laws.Datasource8Laws
import com.example.formulasforphysics.data.laws.Datasource9Laws
import com.example.formulasforphysics.databinding.FragmentLawsBinding

class LawsFragment : Fragment() {
    private lateinit var binding: FragmentLawsBinding

    private val list =  listOf(
        Datasource7Laws().loadLaws7(),
        Datasource8Laws().loadLaws8(),
        Datasource9Laws().loadLaws9()
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLawsBinding.inflate(inflater)

        val value = arguments?.getInt("numberL")
        val mData = list[value!!]

        binding.recyclerViewLaws.adapter = ItemAdapterLaws(this, mData)

        return binding.root
    }
}