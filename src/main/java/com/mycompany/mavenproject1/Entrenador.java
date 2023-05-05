package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Entrenador {

    private int idEntrenador;
    private String nombreEntrenador;
    private ArrayList<Pokemon> pokemonesBatalla;
    private Mochila mochila;

    public Entrenador() {
    }

    public Entrenador(int idEntrenador, String nombreEntrenador, ArrayList<Pokemon> pokemonesBatalla, Mochila mochila) {
        this.idEntrenador = idEntrenador;
        this.nombreEntrenador = nombreEntrenador;
        this.pokemonesBatalla = pokemonesBatalla;
        this.mochila = mochila;
    }
    


    public int getIdEntrenador() {
        return idEntrenador;
    }

    public void setIdEntrenador(int idEntrenador) {
        this.idEntrenador = idEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public ArrayList<Pokemon> getPokemonesBatalla() {
        return pokemonesBatalla;
    }

    public void setPokemonesBatalla(ArrayList<Pokemon> pokemonesBatalla) {
        this.pokemonesBatalla = pokemonesBatalla;
    }

    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }
    

}
