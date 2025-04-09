package com.example.NuevoProyecto.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Entrenador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String region;
    private int edad;
    private String especialidad;

    @OneToMany(mappedBy = "entrenador")
    private List<Pokemon> pokemones;

    @OneToMany(mappedBy = "entrenador")
    private List<Inventario> inventario;

    public Entrenador() {
    }

    public Entrenador(int id, String nombre, String region, int edad, String especialidad, List<Pokemon> pokemones, List<Inventario> inventario) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
        this.edad = edad;
        this.especialidad = especialidad;
        this.pokemones = pokemones;
        this.inventario = inventario;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void setPokemones(List<Pokemon> pokemones) {
        this.pokemones = pokemones;
    }

    public List<Inventario> getInventario() {
        return inventario;
    }

    public void setInventario(List<Inventario> inventario) {
        this.inventario = inventario;
    }
}

