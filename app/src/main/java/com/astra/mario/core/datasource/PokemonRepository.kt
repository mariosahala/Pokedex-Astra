package com.astra.mario.core.datasource

import com.astra.mario.core.base.ApiState
import com.astra.mario.core.model.DetailPokemonResponse
import com.astra.mario.core.model.ListPokemonResponse
import javax.inject.Inject

class PokemonRepository @Inject constructor(private val apiService: ApiService) {
    suspend fun getListPokemon(): ApiState<ListPokemonResponse> {
        apiService.getListPokemon().let {
            return ApiState.returnData(it)
        }
    }

    suspend fun getDetailPokemon(id: String): ApiState<DetailPokemonResponse> {
        apiService.getDetailPokemon(id).let {
            return ApiState.returnData(it)
        }
    }
}