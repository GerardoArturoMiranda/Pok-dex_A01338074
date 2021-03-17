package edu.itesm.pokdex_a01338074

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView


class PokémonAdapter(private val pokemons: List<Pokemon>)
    : RecyclerView.Adapter<PokémonAdapter.MovieViewHolder>(){


    inner class MovieViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var name = renglon.findViewById<TextView>(R.id.name)
        var number = renglon.findViewById<TextView>(R.id.number)
    }

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.pokemon_row, parent, false)
        return MovieViewHolder(renglon_vista)

    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val pokemon= pokemons[position]
        val nombre = pokemon.name
        holder.name.text = pokemon.name
        holder.number.text = pokemon.number.toString()
        holder.itemView.setOnClickListener {
            val action = PokemonListFragmentDirections.actionPokemonListFragmentToPokemonFragment(
                pokemon
            )
            holder.itemView.findNavController().navigate(action)

        }
    }




    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return pokemons.size
    }
}