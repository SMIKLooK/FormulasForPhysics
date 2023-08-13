package com.example.formulasforphysics.select_topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.FragmentSelectA9thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class9FormulasFragment
import com.example.formulasforphysics.laws.Class9LawsFragment


class SelectA9thGradeTopicFragment : Fragment() {
    private lateinit var binding: FragmentSelectA9thGradeTopicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectA9thGradeTopicBinding.inflate(inflater)

        binding.formula9Class.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class9FormulasFragment())?.commit()
        }

        binding.lawsOfPhysics9.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class9LawsFragment())?.commit()
        }

        return binding.root
    }
}