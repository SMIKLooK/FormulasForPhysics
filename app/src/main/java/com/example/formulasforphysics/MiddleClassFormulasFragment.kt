package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.databinding.FragmentMiddleClassBinding

class MiddleClassFormulasFragment : Fragment() {
    private lateinit var binding: FragmentMiddleClassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMiddleClassBinding.inflate(inflater)

        binding.sevenClass.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberF", 0)
            val formulasFragment = FormulasFragment()
            formulasFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, formulasFragment)
                ?.addToBackStack("FormulasFragment")
                ?.commit()
        }

        binding.eighthClass.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberF", 1)
            val formulasFragment = FormulasFragment()
            formulasFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, formulasFragment)
                ?.addToBackStack("FormulasFragment")
                ?.commit()
        }

        binding.ninthClass.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberF", 2)
            val formulasFragment = FormulasFragment()
            formulasFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, formulasFragment)
                ?.addToBackStack("FormulasFragment")
                ?.commit()
        }
        return binding.root
    }
}