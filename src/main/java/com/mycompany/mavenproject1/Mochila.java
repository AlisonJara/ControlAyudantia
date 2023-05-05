package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

public class Mochila extends Inventario {

    public Mochila(int Capacidad) {
        super(Capacidad);
    }

    public Mochila() {
    }
    
    @Override
    public void usarObjeto(){
         int ID;
        boolean existe = false;
        Scanner e = new Scanner(System.in);
                
        System.out.println("Ingrese el ID del objeto a utilizar");
        
        ID = e.nextInt();
        for(int i = 0; i<Interactuable.size();i++){
            if(Interactuable.get(i).getIdObjeto()== ID){
                existe = true;
                 Interactuable.remove(i);
                System.out.println("El objeto ha sido utilizado con exito");
            }  
        }
        if (existe == false){
            System.out.println("Este objeto no se encuentra en su inventario");
            
        }
    }

}
