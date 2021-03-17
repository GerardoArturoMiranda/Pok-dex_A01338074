package edu.itesm.pokdex_a01338074

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_pokemon_list.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PokemonListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PokemonListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        pokemon_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = PokémonAdapter(createData())
        }
    }

    fun createData(): ArrayList<Pokemon>{
        val pokemons = ArrayList<Pokemon>()
        pokemons.add(Pokemon(R.drawable.bulbasaur,1, "Kanto","Bulbasaur","Fire", "Grass"))
        pokemons.add(Pokemon(R.drawable.charmander,4, "Kanto","Charmander","Water", "Fire"))
        pokemons.add(Pokemon(R.drawable.squirtle,7, "Kanto","Squirtle","Grass", "Water"))
        pokemons.add(Pokemon(R.drawable.chikorita, 151,"Johto","Chikorita","Fire", "Grass"))
        pokemons.add(Pokemon(R.drawable.cindaquil,155, "Johto","Cindaquil","Water", "Fire"))
        pokemons.add(Pokemon(R.drawable.totdile,158, "Johto","Totodile","Grass", "Water"))
        pokemons.add(Pokemon(R.drawable.treecko, 252,"Hoenn","Treecko","Fire", "Grass"))
        pokemons.add(Pokemon(R.drawable.torchic,255, "Hoenn","Torchic","Water", "Fire"))
        pokemons.add(Pokemon(R.drawable.mudkip,258, "Hoenn","Mudkip","Grass", "Water"))
        pokemons.add(Pokemon(R.drawable.turtwig, 287,"Sinnoh","Turtwig","Fire", "Grass"))
        pokemons.add(Pokemon(R.drawable.cimchar,290, "Sinnoh","Chimchar","Water", "Fire"))
        pokemons.add(Pokemon(R.drawable.piplup,293, "Sinnoh","Piplup","Grass", "Water"))
        return pokemons
    }
}