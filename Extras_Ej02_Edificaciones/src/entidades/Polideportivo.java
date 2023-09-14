package entidades;

import enumeradores.TipoInstalacion;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private TipoInstalacion tipo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, TipoInstalacion tipo, double alto, double ancho, double largo) {
        super(alto, ancho, largo);
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoInstalacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoInstalacion tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString()    {
        return ("Polideportivo: "+this.nombre+". Tipo de edificio: "+this.tipo+" - "+super.toString());
    }
    
    @Override
    public double calcularSuperficie()  {
        return (super.getAncho() * super.getLargo());
    }
    
    @Override
    public double calcularVolumen() {
        return (super.getAncho() * super.getLargo() * super.getAlto());
    }
}
