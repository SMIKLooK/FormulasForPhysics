package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.adapter.VPAdapter
import com.example.formulasforphysics.databinding.FragmentMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    private val list = listOf(SecondFragment(), ThirdFragment())

    private val listText = listOf("формулы", "законы")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)

        binding.selectFragment.adapter = VPAdapter(this, list)
        TabLayoutMediator(binding.tb, binding.selectFragment){
            tab, pos-> tab.text = listText[pos]
        }.attach()
        return binding.root
    }
}