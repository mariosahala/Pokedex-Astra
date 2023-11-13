package com.astra.mario.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.astra.mario.R
import com.astra.mario.core.base.BaseActivity
import com.astra.mario.databinding.ActivityLandingPageBinding
import com.astra.mario.databinding.ActivityMainBinding

class LandingPageActivity : BaseActivity<ActivityLandingPageBinding>() {
    override fun setViewBinding(): ActivityLandingPageBinding =
        ActivityLandingPageBinding.inflate(layoutInflater)

    override fun setUpVariable() {
        binding.apply {
            btnStartPokemon.setOnClickListener {
                MainActivity.toActivity(this@LandingPageActivity)
            }
        }
    }
}