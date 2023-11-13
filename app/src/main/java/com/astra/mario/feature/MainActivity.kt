package com.astra.mario.feature

import android.app.Activity
import android.content.Intent
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

    companion object {
        fun toActivity(activity: Activity) {
            val intent = Intent(activity, MainActivity::class.java)
            activity.startActivity(intent)
        }
    }

}