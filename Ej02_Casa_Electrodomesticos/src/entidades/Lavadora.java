
package entidades;

public class Lavadora extends Electrodomestico  {
    
    private Double carga;

    public Lavadora() {
    }

    public Lavadora(Double carga, Double precio, String color, char energetico, Double peso) {
        super(precio, color, energetico, peso);
        this.carga = carga;
    }
    
    public Double getCarga()    {
        return carga;
    }
    
    public void setCarga(Double carga)  {
        this.carga = carga;
    }
    
    @Override
    public String toString()    {
        return ("Precio: "+this.precio+"; Color: "+this.color+"; Tipo Consumo Energetico: "+this.energetico+"; Peso: "+this.peso+"; Carga (Kg): "+this.carga);
    }
}
