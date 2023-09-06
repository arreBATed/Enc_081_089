
package servicios;

import entidades.Electrodomestico;
import java.util.Scanner;

public class ElectrodomesticoServicios {
   
    
    Scanner leer = new Scanner(System.in);
    
    public ElectrodomesticoServicios()  {
        
    }
    
    public Electrodomestico crearElectrodomestico()    {
        
        
        System.out.print("Ingrese el color del electrodomestico: ");
        String color = leer.next();
        System.out.println();
        boolean correcto = true;
        char opcion;
        do {
            System.out.print("Ingrese el tipo de consumo energetico (desde A hasta F): ");
            opcion = leer.next().charAt(0);
            if ((opcion >= 'A') && (opcion <= 'Z')) {
                correcto = false;
                System.out.println();
            }
            else    {
                 System.out.println("La opcion de consumo no es correcte. Por favor, coloque correctamente para continuar....");
            }                    
        } while (correcto);
        System.out.print("Ingrese el peso del elecrrodomestico: ");
        Double peso = leer.nextDouble();
        return (new Electrodomestico(1000d,color,opcion,peso));
    }
    
    public Electrodomestico PrecioFinal(Electrodomestico e) {
        
        switch  (e.getEnergetico()) {
            case 'A'    :
                            e.setPrecio(1000d);
                            break;
            case 'B'    :
                            e.setPrecio(800d);
                            break;
            case 'C'    :
                            e.setPrecio(600d);
                            break;
            case 'D'    :
                            e.setPrecio(500d);
                            break;
            case 'E'    :
                            e.setPrecio(300d);
                            break;
            case 'F'    :
                            e.setPrecio(100d);
                            break;
            default     :
                            System.out.println("Error!");
        }
        if ((e.getPeso() >= 1) && (e.getPeso() <= 19))   {
            e.setPrecio(e.getPrecio() + 100);
        } else if ((e.getPeso() >= 20) && (e.getPeso() <= 49))  {
            e.setPrecio(e.getPrecio() + 500);
        } else if ((e.getPeso() >= 50) && (e.getPeso() <= 79))  {
            e.setPrecio(e.getPrecio() + 800);
        } else {
            e.setPrecio(e.getPrecio() + 1000);
        }    
        return (e);
    }
    
    public Double precioElectrodomestico(Electrodomestico e)    {
        
        return (e.getPrecio());
    }
     
    public String colorElectrodomestico(Electrodomestico e) {
        
        return (e.getColor());
    }
    
    public char tipoConsumoEnergeticoElectrodomestico(Electrodomestico e) {
        
        return (e.getEnergetico());
    }
    
    public Double pesoElectrodomestico(Electrodomestico e)  {
        
        return (e.getPeso());
    }
    
    public void MostrarElectrodomestico(Electrodomestico e) {
        
        System.out.println(e.toString());
    }
    
}

