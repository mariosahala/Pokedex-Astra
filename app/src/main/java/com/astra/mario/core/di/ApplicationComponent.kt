package com.astra.mario.core.di

import android.content.Context
import com.astra.mario.core.di.annotation.FeatureScope
import com.astra.mario.feature.detail_pokemon.DetailPokemonFragment
import com.astra.mario.feature.list_pokemon.ListPokemonFragment
import dagger.BindsInstance
import dagger.Component

@FeatureScope
@Component(modules = [NetworkModule::class, ViewModelModule::class])
interface ApplicationComponent {

    fun inject(listPokemonFragment: ListPokemonFragment)

    fun inject(detailPokemonFragment: DetailPokemonFragment)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindContext(context: Context): Builder

        fun build(): ApplicationComponent

    }
}