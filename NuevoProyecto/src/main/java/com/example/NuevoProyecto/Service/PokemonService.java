package com.example.NuevoProyecto.Service;

import com.example.NuevoProyecto.Model.Pokemon;
import com.example.NuevoProyecto.Repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon guardar(Pokemon pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public List<Pokemon> lista() {
        return pokemonRepository.findAll();
    }
}
