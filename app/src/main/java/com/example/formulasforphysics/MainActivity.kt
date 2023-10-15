package com.example.formulasforphysics

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.example.formulasforphysics.adapter.VPAdapter
import com.example.formulasforphysics.data.app.listMiddleClass
import com.example.formulasforphysics.data.app.listTextTB
import com.example.formulasforphysics.data.app.listTopClass
import com.example.formulasforphysics.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, toolbar, R.string.formula922t, R.string.formula922t
        )

        binding.drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        toggle.drawerArrowDrawable.color = Color.WHITE

        binding.viewPager.adapter = VPAdapter(this, listMiddleClass)
        TabLayoutMediator(binding.tb, binding.viewPager) { tab, pos ->
            tab.text = listTextTB[pos]
        }.attach()

        binding.navigationView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.middle_class -> {
                    binding.viewPager.adapter = VPAdapter(this, listMiddleClass)
                    TabLayoutMediator(binding.tb, binding.viewPager) { tab, pos ->
                        tab.text = listTextTB[pos]
                    }.attach()

                    binding.drawerLayout.closeDrawers()
                    true
                }

                R.id.top_class -> {
                    binding.viewPager.adapter = VPAdapter(this, listTopClass)
                    TabLayoutMediator(binding.tb, binding.viewPager) { tab, pos ->
                        tab.text = listTextTB[pos]
                    }.attach()

                    binding.drawerLayout.closeDrawers()
                    true
                }

                else -> false
            }
        }
    }
}