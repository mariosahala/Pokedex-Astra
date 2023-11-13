package com.astra.mario.feature.detail_pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import com.astra.mario.core.base.BaseFragment
import com.astra.mario.databinding.FragmentDetailPokemonBinding

class DetailPokemonFragment : BaseFragment<FragmentDetailPokemonBinding>() {
    override fun setViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentDetailPokemonBinding =
        FragmentDetailPokemonBinding.inflate(layoutInflater, null, false)

    override fun setUpVariable() {
        binding.apply {

        }
    }
}