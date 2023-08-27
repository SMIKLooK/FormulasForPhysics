package com.example.formulasforphysics.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.formulasforphysics.MainFragment

class VPAdapter(frag: MainFragment, private val list: List<Fragment>): FragmentStateAdapter(frag) {
    override fun getItemCount(): Int = list.size


    override fun createFragment(position: Int): Fragment {
        return list[position]
    }
}