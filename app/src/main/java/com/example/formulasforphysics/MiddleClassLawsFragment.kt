package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.data.app.bundleKeyLaws
import com.example.formulasforphysics.data.app.fragmentBackStackLaws
import com.example.formulasforphysics.databinding.FragmentMiddleClassLawsBinding

class MiddleClassLawsFragment : Fragment() {
    private lateinit var binding: FragmentMiddleClassLawsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMiddleClassLawsBinding.inflate(inflater)

        binding.sevenClass.setOnClickListener {
            ButtonOnClick(bundleKeyLaws, 0, fragmentBackStackLaws)
                .startFragmentFromFragment(LawsFragment(), activity)
        }

        binding.eighthClass.setOnClickListener {
            ButtonOnClick(bundleKeyLaws, 1, fragmentBackStackLaws)
                .startFragmentFromFragment(LawsFragment(), activity)
        }

        binding.ninthClass.setOnClickListener {
            ButtonOnClick(bundleKeyLaws, 2, fragmentBackStackLaws)
                .startFragmentFromFragment(LawsFragment(), activity)
        }

        return binding.root
    }
}