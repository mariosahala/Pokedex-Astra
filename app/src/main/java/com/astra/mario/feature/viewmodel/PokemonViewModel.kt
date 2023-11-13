package com.astra.mario.feature.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.astra.mario.core.base.ApiState
import com.astra.mario.core.base.BaseViewModel
import com.astra.mario.core.datasource.PokemonRepository
import com.astra.mario.core.model.DetailPokemonResponse
import com.astra.mario.core.model.ListPokemonResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

class PokemonViewModel @Inject constructor(private val repository: PokemonRepository) :
    BaseViewModel() {
    private val _listPokemonResult =
        MutableLiveData<ApiState<ListPokemonResponse>>()
    val listPokemonResult: LiveData<ApiState<ListPokemonResponse>> =
        _listPokemonResult

    private val _detailPokemonResult =
        MutableLiveData<ApiState<DetailPokemonResponse>>()
    val detailPokemonResult: LiveData<ApiState<DetailPokemonResponse>> =
        _detailPokemonResult

    fun getListPokemon() {
        viewModelScope.launch(Dispatchers.IO) {
            _listPokemonResult.postValue(ApiState.loading())
            try {
                val response = repository.getListPokemon()
                _listPokemonResult.postValue(response)
            } catch (e: Exception) {
                onError.postValue(e.message)
            }
        }
    }

    fun getDetailPokemon(id: String) {
        viewModelScope.launch(Dispatchers.IO) {
            _detailPokemonResult.postValue(ApiState.loading())
            try {
                val response = repository.getDetailPokemon(id)
                _detailPokemonResult.postValue(response)
            } catch (e: Exception) {
                onError.postValue(e.message)
            }
        }
    }
}