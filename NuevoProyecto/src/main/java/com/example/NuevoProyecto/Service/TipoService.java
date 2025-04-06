package com.example.NuevoProyecto.Service;

import com.example.NuevoProyecto.Model.Tipo;
import com.example.NuevoProyecto.Repository.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoService {

    @Autowired
    private TipoRepository tipoRepository;

    public Tipo guardar(Tipo tipo) {
        return tipoRepository.save(tipo);
    }

    public List<Tipo> lista() {
        return tipoRepository.findAll();
    }
}
