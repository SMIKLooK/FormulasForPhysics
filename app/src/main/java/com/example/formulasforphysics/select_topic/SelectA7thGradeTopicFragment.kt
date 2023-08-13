package com.example.formulasforphysics.select_topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.FragmentSelectA7thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class7FormulasFragment
import com.example.formulasforphysics.laws.Class7LawsFragment

class SelectA7thGradeTopicFragment : Fragment() {
    private lateinit var binding: FragmentSelectA7thGradeTopicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSelectA7thGradeTopicBinding.inflate(inflater)

        binding.formula7Class.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class7FormulasFragment())?.commit()
        }

        binding.lawsOfPhysics7.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class7LawsFragment())?.commit()
        }

        return binding.root
    }
}