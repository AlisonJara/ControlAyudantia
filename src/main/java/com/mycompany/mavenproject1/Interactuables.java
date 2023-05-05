package com.mycompany.mavenproject1;

public class Interactuables {

    private int idObjeto;
    private String nombreObjeto;

    public Interactuables(int idObjeto, String nombreObjeto) {
        this.idObjeto = idObjeto;
        this.nombreObjeto = nombreObjeto;
    }

    public Interactuables() {
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
