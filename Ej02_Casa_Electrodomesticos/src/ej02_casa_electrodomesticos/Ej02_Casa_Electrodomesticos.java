
package ej02_casa_electrodomesticos;

import entidades.Lavadora;
import entidades.Televisor;
import servicios.LavadoraServicios;
import servicios.TelevisorServicios;

public class Ej02_Casa_Electrodomesticos {

    public static void main(String[] args) {
       
        LavadoraServicios lS = new LavadoraServicios();
        Lavadora l = lS.crearLavadora();
        lS.MostrarLavadora(l);
        l = lS.PrecioFinal(l);
        lS.MostrarLavadora(l);
        
        TelevisorServicios tS = new TelevisorServicios();
        Televisor t = tS.crearTelevisor();
        tS.crearTelevisor();
        tS.MostrarTelevisor(t);
        t = tS.PrecioFinal(t);
        tS.MostrarTelevisor(t);
    }    
}
