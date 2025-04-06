package com.example.NuevoProyecto.Controller;

import com.example.NuevoProyecto.Model.Entrenador;
import com.example.NuevoProyecto.Service.EntrenadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrenadores")
public class EntrenadorController {

    @Autowired
    private EntrenadorService entrenadorService;

    @PostMapping("/guardar")
    public Entrenador guardarEntrenador(@RequestBody Entrenador entrenador) {
        return entrenadorService.guardar(entrenador);
    }

    @GetMapping("/listar")
    public List<Entrenador> listarEntrenadores() {
        return entrenadorService.lista();
    }
}
