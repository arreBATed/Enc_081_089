package entidades;

public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected char energetico;
    protected Double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Double precio, String color, char energetico, Double peso) {
        this.precio = precio;
        this.color = comprobarColor(color.toLowerCase());
        this.energetico = comprobarConsumoEnergetico(energetico);
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getEnergetico() {
        return energetico;
    }

    public void setEnergetico(char energetico) {
        this.energetico = energetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    private char comprobarConsumoEnergetico(char letra)  {
        
        if ((letra >= 'A') && (letra <= 'F'))   {
                return letra;
        }
        return 'F';
    }
    
    private String comprobarColor(String color) {
        
        if ((color.equals("negro")) || (color.equals("rojo")) || (color.equals("azul")) || (color.equals("gris")))  {
            return color;
        }
        return "blanco";
    }
    
    @Override
    public String toString()    {
        return ("Precio: "+this.precio+"; Color: "+this.color+"; Tipo Consumo Energetico: "+this.energetico+"; Peso: "+this.peso);
    }
}
