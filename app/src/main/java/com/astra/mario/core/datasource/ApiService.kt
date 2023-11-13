package com.astra.mario.core.datasource

import com.astra.mario.core.model.DetailPokemonResponse
import com.astra.mario.core.model.ListPokemonResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("pokemon/")
    suspend fun getListPokemon(): Response<ListPokemonResponse>

    @GET("pokemon/{id}")
    suspend fun getDetailPokemon(@Path("id") id: String): Response<DetailPokemonResponse>
}