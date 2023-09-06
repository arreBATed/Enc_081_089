package ej01_fauna_animal;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;
import java.util.ArrayList;

public class Ej01_Fauna_Animal {

    public static void main(String[] args) {
        
        //Declaracion del objeto Perro
        Animal perro1 = new Perro("Stinch", "Carnivoro", 15, "Doberman");
        perro1.alimentarse();
        
        //Declaracion de otro objeto Perro
        Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro2.alimentarse();
        
        //Declaracion del objeto Gato
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        
        //Delcaracion del objeto Caballo
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
    }
    
}
