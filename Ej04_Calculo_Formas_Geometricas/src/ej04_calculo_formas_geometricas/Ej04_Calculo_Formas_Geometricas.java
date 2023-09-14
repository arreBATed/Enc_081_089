package ej04_calculo_formas_geometricas;

import entidades.Circulo;
import entidades.Rectangulo;
import java.util.Scanner;

public class Ej04_Calculo_Formas_Geometricas {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("... vamos a crear un ciruculo...");
        System.out.print("Ingrese el radio del circulo: ");
        double radio = leer.nextDouble();
        System.out.println();
        Circulo circulo = new Circulo(radio);
        System.out.println("El circulo con radio "+circulo.getRadio()+", el area resultante es "+circulo.area()+" y su perimetro es de "+circulo.perimetro());
        System.out.println("... ahora vamos a crear un rectangulo...");
        System.out.print("Ingrese la base del rectangulo: ");
        double base = leer.nextDouble();
        System.out.println();
        System.out.print("Ingrese la altura del rectangulo: ");
        double altura = leer.nextDouble();
        Rectangulo rectangulo = new Rectangulo(base,altura);
        System.out.println();
        System.out.println("El rectangulo con base "+rectangulo.getBase()+" y altura "+rectangulo.getAltura()+", el area resultante es "+rectangulo.area()+" y su perimetro es de "+rectangulo.perimetro());   
    }
    
}
