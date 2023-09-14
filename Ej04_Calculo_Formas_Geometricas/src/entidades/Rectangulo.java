package entidades;

import interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString()    {
        return ("La base del rectangulo se "+this.base+" y la altura es "+this.altura);
    }
    
    @Override
    public double area()    {
        return (this.base * this.altura);
    }
    
    @Override
    public double perimetro()   {
        return ((this.base + this.altura) * 2);
    } 
    
}
