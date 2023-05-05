package com.mycompany.mavenproject1;

import java.util.ArrayList;

public class Interactuables {

    private int idObjeto;
    private String nombreObjeto;
    protected ArrayList<Pokemon> pokemones;
    private Entrenador entrenador = new Entrenador();
    public Interactuables(int idObjeto, String nombreObjeto) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
    }

    public Interactuables() {
    }

    public boolean ElegirPokemon(int ID) {
        for (int i = 0; i < pokemones.size(); i++) {
            if (pokemones.get(i).getIdPokemon() == ID) {
                return true;
            }
        }
        return false;
    }

    public int getIdObjeto() {
        return idObjeto;
    }

    public void setIdObjeto(int idObjeto) {
        this.idObjeto = idObjeto;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

}
