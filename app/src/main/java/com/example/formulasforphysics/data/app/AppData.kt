package com.example.formulasforphysics.data.app

import com.example.formulasforphysics.MiddleClassFormulasFragment
import com.example.formulasforphysics.MiddleClassLawsFragment
import com.example.formulasforphysics.TopClassFragment
import com.example.formulasforphysics.TopClassLawsFragment

//для активити маин
val listMiddleClass = listOf(MiddleClassFormulasFragment(), MiddleClassLawsFragment())
val listTopClass = listOf(TopClassFragment(), TopClassLawsFragment())
val listTextTB = listOf("формулы", "законы")

//для фрагмента с формулами
const val bundleKeyLaws = "numberL"
const val fragmentBackStackLaws = "MiddleClassLawsFragment()"

//для фрагмента с законами
const val bundleKeyFormulas = "numberF"
const val fragmentBackStackFormulas = "MiddleClassFormulasFragment"