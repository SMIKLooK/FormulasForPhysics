package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.data.app.bundleKeyFormulas
import com.example.formulasforphysics.data.app.fragmentBackStackFormulas
import com.example.formulasforphysics.databinding.FragmentMiddleClassBinding

class MiddleClassFormulasFragment : Fragment() {
    private lateinit var binding: FragmentMiddleClassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMiddleClassBinding.inflate(inflater)

        binding.sevenClass.setOnClickListener {
            ButtonOnClick(bundleKeyFormulas, 0, fragmentBackStackFormulas)
                .startFragmentFromFragment(FormulasFragment(), activity)
        }

        binding.eighthClass.setOnClickListener {
            ButtonOnClick(bundleKeyFormulas, 1, fragmentBackStackFormulas)
                .startFragmentFromFragment(FormulasFragment(), activity)
        }

        binding.ninthClass.setOnClickListener {
            ButtonOnClick(bundleKeyFormulas, 2, fragmentBackStackFormulas)
                .startFragmentFromFragment(FormulasFragment(), activity)
        }
        return binding.root
    }
}