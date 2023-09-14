    
package servicios;

import entidades.Electrodomestico;
import entidades.Televisor;


public class TelevisorServicios extends ElectrodomesticoServicios{
    
    public TelevisorServicios() {      
    }
    
    public Televisor crearTelevisor()   {
                
        System.out.println("--- Creando Televisor ----");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println();
        System.out.print("Ingrese las pulgadas del TV: ");
        Double pulgadas = leer.nextDouble();
        boolean correcto = true;
        boolean sintonizador;
        String opcion;
        sintonizador = false;
        do {
            System.out.print("El TV posee sintonizador TDT? (S/N)");
            opcion = leer.next();
            opcion = opcion.toLowerCase();
            if ((opcion.equals("s")) || (opcion.equals("n")))    {
                if (opcion.equals("s")) {
                    sintonizador = true;
                }
                correcto = false;
            }
            else 
                System.out.println("Ingrese una opcion incorrecta. Por favor, ingrese de nuevo...");
        } while (correcto);
        Televisor tAux = new Televisor(pulgadas,sintonizador,super.precioElectrodomestico(e),super.colorElectrodomestico(e),super.tipoConsumoEnergeticoElectrodomestico(e),super.pesoElectrodomestico(e));
        tAux = precioFinal(tAux);
        return (tAux);
    }
    
    public Televisor precioFinal(Televisor t) {
        
        Electrodomestico e = super.PrecioFinal(t);
        if (t.getResolucion() > 40)  {
            t.setPrecio(super.precioElectrodomestico(e) * 1.3);
        }
        else    {
            t.setPrecio(super.precioElectrodomestico(e));
        }
        if (t.isSintonizador_TDT()) {
            t.setPrecio(t.getPrecio() + 500);
        }
        return (t);
    }
    
    public void MostrarTelevisor(Televisor t) {
        
        System.out.print(t.toString());
    }
}
