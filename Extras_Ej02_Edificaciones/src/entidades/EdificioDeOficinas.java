
package entidades;

public class EdificioDeOficinas extends Edificio    {
    
    private int oficinas;
    private int personas;
    private int pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int oficinas, int personas, int pisos, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }

    public int getOficinas() {
        return oficinas;
    }

    public void setOficinas(int oficinas) {
        this.oficinas = oficinas;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }
    
    @Override
    public String toString()    {
        return ("Edificio de oficinas. Cantidad de oficinas: "+this.oficinas+" - Cantidad de personas por oficina: "+this.oficinas+" - Numero de pisos: "+this.pisos+" - "+super.toString());
    }
    
    @Override
    public double calcularSuperficie()  {
        return (super.getAncho() * super.getLargo());
    }
    
    @Override
    public double calcularVolumen() {
        return (super.getAncho() * super.getLargo() * super.getAlto());
    }
    
    public void cantPersonas()  {    
        System.out.println("La cantidad de personas por oficinas es "+this.personas);
        System.out.println("La cantidad de personas en todo el edificio por oficinas es "+(this.personas * this.pisos)); 
    }
}
