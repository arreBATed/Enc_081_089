package extras_ej03_agencia_turismo;

import entidades.Alojamiento;
import enumeradores.FamiliaAlojamientos;
import java.util.ArrayList;
import java.util.Scanner;

public class Extras_Ej03_Agencia_Turismo {
    
    ArrayList<Alojamiento> listaAlojamientos = new ArrayList();
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
      
        int opcion;
        boolean continuar = true;
        do {
            System.out.println("------- Agregando Alojamientos -------");
            System.out.println("1.- Hotel de 4 Estrellas.");
            System.out.println("2.- Hotel de 5 Estrellas.");
            System.out.println("3.- Camping.");
            System.out.println("4.- Residencia.");
            System.out.println("5.- Salir del menu de carga de alojamientos");
            System.out.print("Ingrese una de las opciones (1 ~ 5): ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1  :
                            break;
                case 2  :
                            break;
                case 3  :
                            break;
                case 4  :
                            break;
                case 5  :   
                            System.out.println("... listo.. cargada la lista de alojamientos...");
                            continuar = false;
                            break;
                default :   
                            System.out.println("La opcion ingresada es incorrecta. Por favor vuelva a ingresar....");
            }            
        } while (continuar);
        
        
    }
    
    public static void CargarListaAlojamiento(FamiliaAlojamientos F) {
        
           System.out.print("Ingrese el nombre del estable");
    }
    
}
