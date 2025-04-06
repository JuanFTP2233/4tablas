package com.example.NuevoProyecto.Controller;

import com.example.NuevoProyecto.Model.Tipo;
import com.example.NuevoProyecto.Service.TipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipos")
public class TipoController {

    @Autowired
    private TipoService tipoService;

    @PostMapping("/guardar")
    public Tipo guardarTipo(@RequestBody Tipo tipo) {
        return tipoService.guardar(tipo);
    }

    @GetMapping("/listar")
    public List<Tipo> listarTipos() {
        return tipoService.lista();
    }
}
