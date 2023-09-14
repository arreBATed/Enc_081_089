package ej03_casa_electrodomesticos_2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.ElectrodomesticoServicios;
import servicios.LavadoraServicios;
import servicios.TelevisorServicios;

public class Ej03_Casa_Electrodomesticos_2 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();
        
        System.out.println("Creada la lista de electrodomesticos, vamos a cargar 4 electrodomesticos ya sean lavadoras o TVs...");
        boolean correcto;
        int opcion;
        for (int i = 1; i <= 4; i++)    {
            System.out.println("Electrodomestico #"+i);
            correcto = true;
            do {
                System.out.println("que desea agregar...");
                System.out.println("1.- Lavadora");
                System.out.println("2.- Televisor");
                System.out.print("Ingrese una opcion (1 o 2): ");
                opcion = leer.nextInt();
                switch  (opcion)    {
                    case 1  :   
                                listaElectrodomesticos.add(cargarLavadora());
                                correcto = false;
                                break;
                    case 2  :   
                                listaElectrodomesticos.add(cargarTelevisor());
                                correcto = false;
                                break;
                    default :
                                System.out.println("La opcion ingresada no es correcta. Intente nuevamente...");
                }           
            } while (correcto);  
        }
        System.out.println("... listo.. cargado los 4 electrodomesticos. Ahora vamos a mostrar el precio final de los electrodomesticos cargados");
        MostrarPreciosListaElectrodomesticos(listaElectrodomesticos);
        
    }
        
        public static Lavadora cargarLavadora()    {
            
            LavadoraServicios lS = new LavadoraServicios();
            Lavadora l = lS.crearLavadora();
            return (l);
        }
        
        public static Televisor cargarTelevisor()    {
            
            TelevisorServicios tS = new TelevisorServicios();
            Televisor t = tS.crearTelevisor();
            return (t);
        }
        
        public static void MostrarPreciosListaElectrodomesticos(ArrayList<Electrodomestico> l)   {
            
            ElectrodomesticoServicios eS = new ElectrodomesticoServicios();
            int cont = 0;
            double sumaTotal = 0;
            System.out.println("--- Valor de cada electodomestico de la lista ---");
            for (Electrodomestico eAux : l)    {
                System.out.println("Electrodomestico #"+cont+": $"+eS.precioElectrodomestico(eAux));
                sumaTotal = sumaTotal + eS.precioElectrodomestico(eAux);
                cont = cont + 1;               
            }
            System.out.println();
            System.out.println("El valor total de todos los electrodomesticos de la lista es $"+sumaTotal);            
        }
  
}
