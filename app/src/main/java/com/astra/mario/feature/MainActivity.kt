package com.astra.mario.feature

import android.os.Bundle
import com.astra.mario.core.base.BaseActivity
import com.astra.mario.core.di.PokemonDaggerWrapper
import com.astra.mario.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        PokemonDaggerWrapper.buildComponent(this.applicationContext)
        super.onCreate(savedInstanceState)
    }

    override fun setViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun setUpVariable() {
        binding.apply {

        }
    }

}