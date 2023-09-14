package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;
import java.util.Scanner;

public class LavadoraServicios extends ElectrodomesticoServicios    {
    
    Scanner leer = new Scanner(System.in);
   
    public LavadoraServicios()  {
    }
    
    public Lavadora crearLavadora() {
        
        System.out.println("--- Creando Lavadora ----");
        Electrodomestico e = super.crearElectrodomestico();
        System.out.println();
        System.out.print("Ingrese los kilos de carga de la lavadora: ");
        Double kilo = leer.nextDouble();
        Lavadora lAux = new Lavadora(kilo,super.precioElectrodomestico(e),super.colorElectrodomestico(e),super.tipoConsumoEnergeticoElectrodomestico(e),super.pesoElectrodomestico(e));
        lAux = PrecioFinal(lAux);
        return (lAux);
    }
    
    public Lavadora PrecioFinal(Lavadora l) {
        
        Electrodomestico e = super.PrecioFinal(l);
        if (l.getCarga() > 30)  {
            l.setPrecio(super.precioElectrodomestico(e)+500);
        }
        else    {
            l.setPrecio(super.precioElectrodomestico(e));
        }
        return (l);
    }
    
    public void MostrarLavadora(Lavadora l) {
        
        System.out.print(l.toString());
    }
    
}
