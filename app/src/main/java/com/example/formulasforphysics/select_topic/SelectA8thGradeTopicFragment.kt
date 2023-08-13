package com.example.formulasforphysics.select_topic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.R
import com.example.formulasforphysics.databinding.FragmentSelectA8thGradeTopicBinding
import com.example.formulasforphysics.formulas.Class8FormulasFragment
import com.example.formulasforphysics.laws.Class8LawsFragment


class SelectA8thGradeTopicFragment : Fragment() {
    private lateinit var binding: FragmentSelectA8thGradeTopicBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSelectA8thGradeTopicBinding.inflate(inflater)

        binding.formula8Class.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class8FormulasFragment())?.commit()
        }

        binding.lawsOfPhysics8.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, Class8LawsFragment())?.commit()
        }

        return binding.root
    }
}