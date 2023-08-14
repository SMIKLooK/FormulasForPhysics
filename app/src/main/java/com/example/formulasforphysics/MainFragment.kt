package com.example.formulasforphysics

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.formulasforphysics.databinding.FragmentMainBinding
import com.example.formulasforphysics.select_topic.SelectA7thGradeTopicFragment
import com.example.formulasforphysics.select_topic.SelectA8thGradeTopicFragment
import com.example.formulasforphysics.select_topic.SelectA9thGradeTopicFragment

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater)

        binding.sevenClass.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, SelectA7thGradeTopicFragment())
                ?.addToBackStack("SelectA7thGradeTopic()")
                ?.commit()
        }

        binding.eighthClass.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, SelectA8thGradeTopicFragment())
                ?.addToBackStack("SelectA8thGradeTopic()")
                ?.commit()
        }

        binding.ninthClass.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.select_fragment, SelectA9thGradeTopicFragment())
                ?.addToBackStack("SelectA9thGradeTopic()")
                ?.commit()
        }

        return binding.root
    }
}