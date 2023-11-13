package com.astra.mario.core.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable
import java.io.StringReader

data class ListPokemonResponse(
    @SerializedName("count")
    var count: String = "",
    @SerializedName("results")
    var results: List<Result>,
    @SerializedName("next")
    var next: String = "",
) : Serializable {
    data class Result(
        @SerializedName("name")
        var name: String = "",
        @SerializedName("url")
        var url: String = "",
    ) : Serializable
}