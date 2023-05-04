package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Entrenador {

    private int idEntrenador;
    private String nombreEntrenador;
    private ArrayList<Pokemon> pokemonesBatalla;

    public Entrenador(int idEntrenador, String nombreEntrenador, ArrayList<Pokemon> pokemonesBatalla) {
        this.idEntrenador = idEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.pokemonesBatalla = pokemonesBatalla;
    }

    public Entrenador() {
    }

    public int getIdEntrenador() {
        return idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public ArrayList<Pokemon> getPokemonesBatalla() {
        return pokemonesBatalla;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public void setPokemonesBatalla(ArrayList<Pokemon> pokemonesBatalla) {
        this.pokemonesBatalla = pokemonesBatalla;
    }

}
