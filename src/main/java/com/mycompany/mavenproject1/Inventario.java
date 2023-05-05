package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {

    private int Capacidad;
    private ArrayList<Interactuables> Interactuable = new ArrayList<>();

    public Inventario(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public Inventario() {
    }

    public void CRUD() {
        int opcion;
        Scanner Entrada = new Scanner(System.in);

        do {
            //Prueba Github
            System.out.println("1.- Crear Objeto ");
            System.out.println("2.- Mostrar Objetos Creables ");
            System.out.println("3.- Modificar objeto");
            System.out.println("4.- Eliminar objeto");
            System.out.println("0.- Salir");
            System.out.println("Ingrese una opción");
            opcion = Entrada.nextInt();
            switch (opcion) {
                case 1 ->
                    Agregar();
                case 2 -> {
                    Mostrar();
                }
                case 3 -> {
                    Modificar();

                }
                case 4 -> {
                    Eliminar();

                }
                default ->
                    System.out.println("La opción ingresada no es valida");
            }
        } while (opcion != 0);
    }

    public Interactuables Crear() {

        Interactuables in = new Interactuables();
        int id;
        String nombre;
        Scanner e = new Scanner(System.in);

        System.out.println("Ingrese el ID del objeto");
        id = e.nextInt();
        in.setIdObjeto(id);
        System.out.println("Ingrese el Nombre del objeto");
        nombre = e.next();
        in.setNombreObjeto(nombre);
        return in;

    }

    public void Agregar() {

        int opcion;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Presione una 1 continuar agregando objetos o 2 para salir");
            opcion = entrada.nextInt();
            Interactuable.add(Crear());

        } while (opcion != 2);
    }

    public void Mostrar() {
        for (int i = 0; i < Interactuable.size(); i++) {
            System.out.println("Objeto " + i + 1);
            System.out.println("ID:" + Interactuable.get(i).getIdObjeto());
            System.out.println("Nombre" + Interactuable.get(i).getNombreObjeto());
            System.out.println();
        }
    }

    public int Buscar(int ID) {
        int posicion = 0;
        for (int i = 0; i < Interactuable.size(); i++) {
            if(Interactuable.get(i).getIdObjeto()== ID){
                 posicion = i;
                 return posicion;
        }
       
    }
    }

    public void Modificar() {
        int ID;
        int posicion;
        Scanner e = new Scanner(System.in);
        System.out.println("Indique el ID del objeto ");
        ID = e.nextInt();
        posicion = Buscar(ID);
        
    
    }

    public void Eliminar() {

    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        this.Capacidad = Capacidad;
    }

    public ArrayList<Interactuables> getInteractuable() {
        return Interactuable;
    }

    public void setInteractuable(ArrayList<Interactuables> Interactuable) {
        this.Interactuable = Interactuable;
    }

}
