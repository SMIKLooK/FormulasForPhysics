package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.databinding.FragmentMiddleClassLawsBinding

class MiddleClassLawsFragment : Fragment() {
    private lateinit var binding: FragmentMiddleClassLawsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMiddleClassLawsBinding.inflate(inflater)

        binding.sevenClass?.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberL", 0)
            val lawsFragment = LawsFragment()
            lawsFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, lawsFragment)
                ?.addToBackStack("SelectA7thGradeTopic()")
                ?.commit()
        }

        binding.eighthClass?.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberL", 1)
            val lawsFragment = LawsFragment()
            lawsFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, lawsFragment)
                ?.addToBackStack("SelectA8thGradeTopic()")
                ?.commit()
        }

        binding.ninthClass?.setOnClickListener {
            val bundle = Bundle()
            bundle.putInt("numberL", 2)
            val lawsFragment = LawsFragment()
            lawsFragment.arguments = bundle

            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, lawsFragment)
                ?.addToBackStack("SelectA9thGradeTopic()")
                ?.commit()
        }

        return binding.root
    }
}