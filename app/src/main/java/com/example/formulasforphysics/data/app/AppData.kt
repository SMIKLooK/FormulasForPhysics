package com.example.formulasforphysics.data.app

import com.example.formulasforphysics.MiddleClassFormulasFragment
import com.example.formulasforphysics.MiddleClassLawsFragment
import com.example.formulasforphysics.TopClassFragment
import com.example.formulasforphysics.TopClassLawsFragment

val listMiddleClass = listOf(MiddleClassFormulasFragment(), MiddleClassLawsFragment())
val listTopClass = listOf(TopClassFragment(), TopClassLawsFragment())
val listTextTB = listOf("формулы", "законы")

const val bundleKeyLaws = "numberL"
const val fragmentBackStackLaws = "MiddleClassLawsFragment()"

const val bundleKeyFormulas = "numberF"
const val fragmentBackStackFormulas = "MiddleClassFormulasFragment"