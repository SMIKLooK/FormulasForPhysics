package com.example.formulasforphysics.laws

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.laws.ItemAdapter7Laws
import com.example.formulasforphysics.data.laws.Datasource7Laws
import com.example.formulasforphysics.databinding.FragmentClass7LawsBinding


class Class7LawsFragment : Fragment() {
    private lateinit var binding: FragmentClass7LawsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentClass7LawsBinding.inflate(inflater)

        val myDataset7Laws = Datasource7Laws().loadLaws7()

        binding.recyclerView7Laws.adapter = ItemAdapter7Laws(this, myDataset7Laws)

        return binding.root
    }
}