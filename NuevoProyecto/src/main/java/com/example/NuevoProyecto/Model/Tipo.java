package com.example.NuevoProyecto.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String descripcion;

    @OneToMany(mappedBy = "tipo")
    private List<Pokemon> pokemones;

    public Tipo() {
    }

    public Tipo(int id, String nombre, String descripcion, List<Pokemon> pokemones) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.pokemones = pokemones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }
}


