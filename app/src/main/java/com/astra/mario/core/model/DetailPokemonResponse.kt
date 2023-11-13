package com.astra.mario.core.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

class DetailPokemonResponse(
    @SerializedName("abilities") var abilities: List<Abilities>,
    @SerializedName("base_experience") var baseExperience: Int = 0,
    @SerializedName("forms") var forms: List<Forms>,
    @SerializedName("game_indices") var gameIndices: List<GameIndices>,
) : Serializable {
    data class Abilities(
        @SerializedName("ability") var ability: Ability,
    ) : Serializable {
        data class Ability(
            @SerializedName("name") var name: String = "",
            @SerializedName("url") var url: String = "",
        ) : Serializable
    }

    data class Forms(
        @SerializedName("name") var name: String = "",
        @SerializedName("url") var url: String = "",
    ) : Serializable

    data class GameIndices(
        @SerializedName("game_index") var gameIndex: Int = 0,
        @SerializedName("version") var url: Version,
    ) : Serializable {
        data class Version(
            @SerializedName("name") var name: String = "",
            @SerializedName("url") var url: String = "",
        )
    }
}