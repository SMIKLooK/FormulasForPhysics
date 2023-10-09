package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.databinding.FragmentTopClassBinding

class TopClassFragment : Fragment() {
    private lateinit var binding: FragmentTopClassBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTopClassBinding.inflate(inflater)

        return binding.root
    }
}