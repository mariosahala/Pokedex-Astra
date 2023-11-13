package com.astra.mario.core.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.astra.mario.core.di.annotation.ViewModelKey
import com.astra.mario.core.di.viewmodel_factory.ViewModelFactory
import com.astra.mario.feature.list_pokemon.ListPokemonViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ListPokemonViewModel::class)
    abstract fun bindGenreViewModel(employeeViewModel: ListPokemonViewModel): ViewModel

    @Binds
    abstract fun bindAboutViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}