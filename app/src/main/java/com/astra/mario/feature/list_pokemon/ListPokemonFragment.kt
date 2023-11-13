package com.astra.mario.feature.list_pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import com.astra.mario.core.base.BaseFragment
import com.astra.mario.databinding.FragmentListPokemonBinding

class ListPokemonFragment : BaseFragment<FragmentListPokemonBinding>() {
    override fun setViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListPokemonBinding =
        FragmentListPokemonBinding.inflate(layoutInflater, null, false)

    override fun setUpVariable() {
        binding.apply {

        }
    }
}