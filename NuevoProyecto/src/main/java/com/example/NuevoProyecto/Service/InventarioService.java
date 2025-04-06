package com.example.NuevoProyecto.Service;

import com.example.NuevoProyecto.Model.Inventario;
import com.example.NuevoProyecto.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {

    @Autowired
    private InventarioRepository inventarioRepository;

    public Inventario guardar(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }

    public List<Inventario> lista() {
        return inventarioRepository.findAll();
    }
}
