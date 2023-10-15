package com.example.formulasforphysics

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

class ButtonOnClick(
    private val bundleKey: String,
    private val bundleInt: Int,
    private val addToBackStack: String
) {
    fun startFragmentFromFragment(
        fragment: Fragment,
        activity: FragmentActivity?
    ) {
        val bundle = Bundle()
        bundle.putInt(bundleKey, bundleInt)

        fragment.arguments = bundle

        activity?.supportFragmentManager?.beginTransaction()
            ?.replace(R.id.select_fragment, fragment)
            ?.addToBackStack(addToBackStack)
            ?.commit()
    }
}