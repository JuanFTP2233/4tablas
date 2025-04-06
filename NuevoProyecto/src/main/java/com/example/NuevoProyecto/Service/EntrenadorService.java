package com.example.NuevoProyecto.Service;

import com.example.NuevoProyecto.Model.Entrenador;
import com.example.NuevoProyecto.Repository.EntrenadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrenadorService {

    @Autowired
    private EntrenadorRepository entrenadorRepository;

    public Entrenador guardar(Entrenador entrenador) {
        return entrenadorRepository.save(entrenador);
    }

    public List<Entrenador> lista() {
        return entrenadorRepository.findAll();
    }
}
