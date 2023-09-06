
package entidades;


public class Televisor extends Electrodomestico {
    
    private Double resolucion;
    private boolean sintonizador_TDT;
    
    public Televisor()  {
        
    }

    public Televisor(Double resolucion, boolean sintonizador_TDT, Double precio, String color, char energetico, Double peso) {
        super(precio, color, energetico, peso);
        this.resolucion = resolucion;
        this.sintonizador_TDT = sintonizador_TDT;
    }

    public Double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizador_TDT() {
        return sintonizador_TDT;
    }

    @Override
    public String toString()    {
        
        if (this.sintonizador_TDT)  {
            return ("Precio: "+this.precio+"; Color: "+this.color+"; Tipo Consumo Energetico: "+this.energetico+"; Peso: "+this.peso+"; Resolucion (inch): "+this.resolucion+"; Sintonizador TDT: Posee");
        }
        else {
            return ("Precio: "+this.precio+"; Color: "+this.color+"; Tipo Consumo Energetico: "+this.energetico+"; Peso: "+this.peso+"; Resolucion (inch): "+this.resolucion+"; Sintonizador TDT: No posee");
        }
    }

}