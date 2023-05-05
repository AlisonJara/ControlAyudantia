package com.mycompany.mavenproject1;

public class Objeto extends Interactuables {

    private String tipoObjeto;


    public Objeto(String tipoObjeto, int idObjeto, String nombreObjeto) {
        super(idObjeto, nombreObjeto);
        this.tipoObjeto = tipoObjeto;
    }

    public Objeto() {
    }


    public String getTipoObjeto() {
        return tipoObjeto;
    }

    public void setTipoObjeto(String tipoObjeto) {
        this.tipoObjeto = tipoObjeto;
    }

}
