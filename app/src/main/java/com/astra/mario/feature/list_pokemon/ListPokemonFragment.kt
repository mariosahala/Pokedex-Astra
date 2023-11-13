package com.astra.mario.feature.list_pokemon

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.astra.mario.core.base.BaseFragment
import com.astra.mario.core.base.State.*
import com.astra.mario.core.di.PokemonDaggerWrapper
import com.astra.mario.databinding.FragmentListPokemonBinding
import com.astra.mario.feature.viewmodel.PokemonViewModel
import javax.inject.Inject

class ListPokemonFragment : BaseFragment<FragmentListPokemonBinding>() {
    private lateinit var listPokemonAdapter: ListPokemonAdapter

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    private val viewModel by viewModels<PokemonViewModel> { viewModelFactory }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        PokemonDaggerWrapper.getComponent().inject(this@ListPokemonFragment)
    }

    override fun setViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentListPokemonBinding =
        FragmentListPokemonBinding.inflate(layoutInflater, null, false)

    override fun setUpVariable() {
        context?.let {
            viewModel.getListPokemon()
            setupObserve(it)
        }
    }

    private fun setupAdapter(context: Context) {
        binding.apply {
            listPokemonAdapter = ListPokemonAdapter()
            rvListPokemon.adapter = listPokemonAdapter
            rvListPokemon.layoutManager = LinearLayoutManager(context)
            listPokemonAdapter.differ.submitList(viewModel.listPokemon)
            listPokemonAdapter.onClick = {

            }
        }
    }

    private fun setupObserve(context: Context) {
        viewModel.listPokemonResult.observe(viewLifecycleOwner) {
            when (it.status) {
                LOADING -> {

                }

                SUCCESS -> {
                    it.data?.let { data ->
                        viewModel.listPokemon.addAll(data.results)
                        setupAdapter(context)
                    }
                }

                ERROR -> {

                }
            }
        }
    }
}