package extras_ej01_puerto;

import entidades.BarcoAMotor;
import entidades.Velero;
import entidades.Yate;
import java.util.Scanner;

public class Extras_Ej01_Puerto {
    
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        
        boolean continuar = true;
        System.out.println("--- Creando el Velero ----");
        System.out.print("Ingrese la matricula del velero: ");
        String matricula = leer.next();
        System.out.println();
        System.out.print("Ingrese el año de fabricacion del velero: ");
        int fabricacion = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese la medida de la eslora del velero: ");
        int eslora = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese la cantidad de mastiles que tiene el velero: ");
        int mastiles = leer.nextInt();
        System.out.println();
        Velero velero = new Velero(mastiles,matricula,eslora,fabricacion);
        System.out.println("--- Creando el Barco a Motor ----");
        System.out.print("Ingrese la matricula del barco a motor: ");
        matricula = leer.next();
        System.out.println();
        System.out.print("Ingrese la medida de la eslora del barco a motor: ");
        eslora = leer.nextInt();
        System.out.print("Ingrese el año de fabricacion del barco a motor: ");
        fabricacion = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese la potencia (en CV) del motor del barco: ");
        System.out.println();
        double potencia = leer.nextDouble();
        BarcoAMotor barcoMotor = new BarcoAMotor(potencia,matricula,eslora,fabricacion);
        System.out.println("--- Creando el Yate----");
        System.out.print("Ingrese la matricula del yate: ");
        matricula = leer.next();
        System.out.println();
        System.out.print("Ingrese la medida de la eslora del yate: ");
        eslora = leer.nextInt();
        System.out.print("Ingrese el año de fabricacion del yate: ");
        fabricacion = leer.nextInt();
        System.out.println();
        System.out.print("Ingrese la potencia (en CV) del yate: ");
        potencia = leer.nextDouble();
        System.out.println();
        System.out.print("Ingrese la cantidad de camarotes del yate: ");
        int camarotes = leer.nextInt();  
        System.out.println();
        Yate yate = new Yate(camarotes,potencia,matricula,eslora,fabricacion);
        int opcion;
        do {
            System.out.println("--- Alquiler de barco ---");
            System.out.println("1.- Velero.");
            System.out.println("2.- Barco a motor.");
            System.out.println("3.- Yate.");
            System.out.println("4.- Salir de la aplicacion.");
            System.out.print("Ingrese una opcion (1~4): ");
            opcion = leer.nextInt();
            switch  (opcion)    {
                case 1  :
                            AlquilarVelero(velero);
                            break;
                case 2  :   
                            AlquilarBarcoAMotor(barcoMotor);
                            break;
                case 3  :
                            AlquilarYate(yate);
                            break;
                case 4  :
                            System.out.println("Gracias por utilizar el programa.");
                            continuar = false;
                            break;
                default :
                            System.out.println("La opcion ingresada no es correcta. Ingrese una nuevamente...");
            }        
        } while (continuar);
    }
    
    public static void AlquilarVelero(Velero v) {
        
        System.out.println("---------- Alquiler de Velero ----------");
        System.out.print("Ingrese los dias que alquilara el velero: ");
        int dias = leer.nextInt();
        System.out.println("El costo del alquiler del velero por "+dias+" dias es de $"+v.valorModulo());
    }
    
    public static void AlquilarBarcoAMotor(BarcoAMotor b) {
        
        System.out.println("---------- Alquiler de Barco a Motor ----------");
        System.out.print("Ingrese los dias que alquilara del barco a motor: ");
        int dias = leer.nextInt();
        System.out.println("El costo del alquiler del barco a motor por "+dias+" dias es de $"+b.valorModulo());
    }
    
    public static void AlquilarYate(Yate y) {
        
        System.out.println("---------- Alquiler de Yate ----------");
        System.out.print("Ingrese los dias que alquilara del yate: ");
        int dias = leer.nextInt();
        System.out.println("El costo del alquiler del yate por "+dias+" dias es de $"+y.valorModulo());
    }
    
}
