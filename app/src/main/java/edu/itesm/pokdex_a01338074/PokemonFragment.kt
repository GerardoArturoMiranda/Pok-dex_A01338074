package edu.itesm.pokdex_a01338074

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.pokemon_fragment.*

class PokemonFragment : Fragment() {

    private val args by navArgs<PokemonFragmentArgs>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.pokemon_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {

        super.onActivityCreated(savedInstanceState)
        pokemonImage.setImageResource(args.pokemon.picture)
        var nombre = args.pokemon.name
        Toast.makeText(activity, "You selected: $nombre", Toast.LENGTH_SHORT).show()
        pokemonName.text = args.pokemon.name
        var number = args.pokemon.number.toString()
        pokemonNumber.text = "Pokémon's pokedex number: $number"
        region.text = args.pokemon.region
        var typing = args.pokemon.typing
        type.text = "The pokémon's typing is: $typing"
        var weakness2 = args.pokemon.weakness
        weakness.text = "The pokémon's weakness is: $weakness2"
    }
}