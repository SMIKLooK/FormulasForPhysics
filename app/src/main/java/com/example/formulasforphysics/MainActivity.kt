package com.example.formulasforphysics

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.formulasforphysics.adapter.VPAdapter
import com.example.formulasforphysics.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val list = listOf(MiddleClassFormulasFragment(), MiddleClassLawsFragment())

    private val list0 = listOf(TopClassFragment(), TopClassLawsFragment())

    private val listText = listOf("формулы", "законы")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.viewPager.adapter = VPAdapter(this, list)
        TabLayoutMediator(binding.tb, binding.viewPager) {
                tab, pos -> tab.text = listText[pos]
        }.attach()

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, toolbar, R.string.formula922t, R.string.formula922t)

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.middle_class -> {
                    binding.viewPager.adapter = VPAdapter(this, list)
                    TabLayoutMediator(binding.tb, binding.viewPager) {
                            tab, pos -> tab.text = listText[pos]
                    }.attach()

                    true
                }
                R.id.top_class -> {
                    binding.viewPager.adapter = VPAdapter(this, list0)
                    TabLayoutMediator(binding.tb, binding.viewPager) {
                            tab, pos -> tab.text = listText[pos]
                    }.attach()

                    true
                }
                else -> false
            }
        }
    }
}