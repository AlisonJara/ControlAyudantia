package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pokedex extends Inventario {
    public Pokedex(int Capacidad) {
        super(Capacidad);
    }

    public Pokedex() {
    }
    public void ElegirPokemon(){
    
        int id;
        boolean existe = false;
        Scanner e = new Scanner(System.in);
        System.out.println("Ingrese el ID de su Pokemon");
        id = e.nextInt();
        for(int i = 0; i<Interactuable.size(); i++){
            existe = Interactuable.get(i).ElegirPokemon(id);
            if(existe == true){
                System.out.println("Se ha seleccionado el pokemon");
            }
        }
        
        if(existe == false)
            System.out.println("Este pokemon aún no se encuentra adquirido");
        
    }


   

}
