package com.example.NuevoProyecto.Controller;

import com.example.NuevoProyecto.Model.Inventario;
import com.example.NuevoProyecto.Service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventario")
public class InventarioController {

    @Autowired
    private InventarioService inventarioService;

    @PostMapping("/guardar")
    public Inventario guardarObjeto(@RequestBody Inventario inventario) {
        return inventarioService.guardar(inventario);
    }

    @GetMapping("/listar")
    public List<Inventario> listarObjetos() {
        return inventarioService.lista();
    }
}
