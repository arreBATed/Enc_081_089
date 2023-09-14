package extras_ej02_edificaciones;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Polideportivo;
import enumeradores.TipoInstalacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Extras_Ej02_Edificaciones {
    
        static Scanner leer = new Scanner (System.in);

        public static void main(String[] args) {
        
            List<Edificio> listaEdificios = new ArrayList();
            
            double alto, ancho, largo;
            int opcion, oficinas, personas, pisos;
            String nombre; 
            TipoInstalacion tipo; 
            boolean correcto; 
            for (int i = 1; i <= 4; i++)    {
                System.out.println("Construyendo el #"+i+" edificio...");
                System.out.print("Ingrese la medida de alto del edificio: ");
                alto = leer.nextDouble();
                System.out.println();
                System.out.print("Ingrese la medida de ancho del edificio: ");
                ancho = leer.nextDouble();
                System.out.println();
                System.out.print("Ingrese la medida de largo del edificio: ");
                largo = leer.nextDouble();
                System.out.println();
                if (i % 2 == 0)     {
                    System.out.print("Ingrese el nombre del polideportivo: ");
                    nombre = leer.nextLine();
                    System.out.println();
                    correcto = true;
                    do {
                        System.out.println("Ingrese el tipo de polideportivo");
                        System.out.println("1.- Techado.");
                        System.out.println("2.- Al aire libre.");
                        System.out.print("Ingrese el numero de opcion: ");
                        opcion = leer.nextInt();
                        tipo = TipoInstalacion.TECHADO;
                        if (opcion > 2 )    {
                            System.out.println("No ingreso una opcion correcta. Vuelva a intentarlo..."); 
                        }
                        else  if (opcion == 2)  {
                                    tipo = TipoInstalacion.ABIERTO;
                                    correcto = false;        
                        }
                        else    {
                            correcto = false;
                        }
                    } while (correcto);
                    listaEdificios.add(new Polideportivo(nombre,tipo,alto,ancho,largo));                    
                }  
                else    {
                    System.out.print("Ingrese la cantidad de oficinas el edificio de oficinas: ");
                    oficinas = leer.nextInt();
                    System.out.println();
                    System.out.print("Ingrese la cantidad de personas por oficinas en el edificio de oficinas: ");
                    personas = leer.nextInt();
                    System.out.println();
                    System.out.print("Ingrese la cantidad de pisos del edificio de oficinas: ");
                    pisos= leer.nextInt();
                    System.out.println();
                    listaEdificios.add(new EdificioDeOficinas(oficinas,personas,pisos,alto,ancho,largo));
                }            
            }
            int cont = 1;
            for (Edificio eAux : listaEdificios)    {
                if (eAux instanceof Polideportivo)  {
                    Polideportivo object = (Polideportivo) eAux; 
                    System.out.println("La superficio del edificio #"+cont+" (polideportivo) es "+object.calcularSuperficie()+" y su vulumen es de "+object.calcularVolumen());
                }
                if (eAux instanceof EdificioDeOficinas) {
                    EdificioDeOficinas object = (EdificioDeOficinas) eAux; 
                    System.out.println("La superficio del edificio de oficinas #"+cont+" (edificio de oficinas) es "+object.calcularSuperficie()+" y su vulumen es de "+object.calcularVolumen());
                }  
                cont = cont + 1;
            }                
        }
            
}
