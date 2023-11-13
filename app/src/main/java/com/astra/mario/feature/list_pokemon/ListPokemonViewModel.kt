package com.astra.mario.feature.list_pokemon

import com.astra.mario.core.base.BaseViewModel
import com.astra.mario.core.datasource.PokemonRepository
import javax.inject.Inject

class ListPokemonViewModel @Inject constructor(private val repository: PokemonRepository) :
    BaseViewModel() {
}