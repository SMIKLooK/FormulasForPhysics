package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.databinding.FragmentTopClassLawsBinding

class TopClassLawsFragment : Fragment() {
    private lateinit var binding: FragmentTopClassLawsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopClassLawsBinding.inflate(inflater)

        return binding.root
    }
}