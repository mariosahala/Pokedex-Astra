package com.astra.mario.core.di

import android.content.Context

object PokemonDaggerWrapper {
    private var component: ApplicationComponent? = null

    fun getComponent(): ApplicationComponent {
        assert(component != null)
        return component!!
    }

    fun buildComponent(context: Context) {
        component = DaggerApplicationComponent.builder().bindContext(context).build()
    }
}