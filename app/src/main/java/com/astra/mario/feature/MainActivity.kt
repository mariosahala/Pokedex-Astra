package com.astra.mario.feature

import com.astra.mario.core.base.BaseActivity
import com.astra.mario.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun setUpVariable() {
        binding.apply {

        }
    }

}