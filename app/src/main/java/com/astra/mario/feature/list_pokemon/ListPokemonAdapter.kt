package com.astra.mario.feature.list_pokemon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.astra.mario.R
import com.astra.mario.core.model.ListPokemonResponse
import com.astra.mario.databinding.ItemListPokemonBinding

class ListPokemonAdapter : RecyclerView.Adapter<ListPokemonAdapter.ListPokemonViewHolder>() {
    var onClick: ((ListPokemonResponse.Result) -> Unit)? = null

    private val diffCallBack = object : DiffUtil.ItemCallback<ListPokemonResponse.Result>() {
        override fun areItemsTheSame(
            oldItem: ListPokemonResponse.Result,
            newItem: ListPokemonResponse.Result
        ): Boolean =
            oldItem == newItem

        override fun areContentsTheSame(
            oldItem: ListPokemonResponse.Result,
            newItem: ListPokemonResponse.Result
        ): Boolean {
            return oldItem == newItem
        }
    }
    val differ = AsyncListDiffer(this, diffCallBack)

    inner class ListPokemonViewHolder(private val binding: ItemListPokemonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ListPokemonResponse.Result) {
            binding.tvNamePokemon.text = data.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListPokemonViewHolder {
        return ListPokemonViewHolder(
            ItemListPokemonBinding.bind(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.item_list_pokemon, parent, false
                )
            )
        )
    }

    override fun getItemCount(): Int = differ.currentList.size

    override fun onBindViewHolder(holder: ListPokemonViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }
}