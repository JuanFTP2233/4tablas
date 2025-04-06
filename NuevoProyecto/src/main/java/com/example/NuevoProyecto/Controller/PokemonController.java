package com.example.NuevoProyecto.Controller;

import com.example.NuevoProyecto.Model.Pokemon;
import com.example.NuevoProyecto.Service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemones")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @PostMapping("/guardar")
    public Pokemon guardarPokemon(@RequestBody Pokemon pokemon) {
        return pokemonService.guardar(pokemon);
    }

    @GetMapping("/listar")
    public List<Pokemon> listarPokemones() {
        return pokemonService.lista();
    }
}
