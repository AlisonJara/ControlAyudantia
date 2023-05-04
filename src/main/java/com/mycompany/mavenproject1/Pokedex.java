package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Pokedex {

    private ArrayList<Pokemon> pokemonesElegibles;
    private int cantidadMaxPokemon;

    public Pokedex(ArrayList<Pokemon> pokemonesElegibles, int cantidadMaxPokemon) {
        this.pokemonesElegibles = pokemonesElegibles;
        this.cantidadMaxPokemon = cantidadMaxPokemon;
    }

    public Pokedex() {
    }

    public ArrayList<Pokemon> getPokemonesElegibles() {
        return pokemonesElegibles;
    }

    public int getCantidadMaxPokemon() {
        return cantidadMaxPokemon;
    }

    public void setPokemonesElegibles(ArrayList<Pokemon> pokemonesElegibles) {
        this.pokemonesElegibles = pokemonesElegibles;
    }

    public void setCantidadMaxPokemon(int cantidadMaxPokemon) {
        this.cantidadMaxPokemon = cantidadMaxPokemon;
    }

}
