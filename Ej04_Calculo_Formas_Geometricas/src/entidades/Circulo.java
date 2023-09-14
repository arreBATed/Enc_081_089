package entidades;

import interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    
    private double radio;

    public Circulo()    {
    }
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double diametro()    {
        return (2 + this.radio);
    }
    
    @Override
    public String toString()    {
        return ("El radio del circulo es "+this.radio+".");
    }
    
    @Override
    public double area()    {
        return (PI * (Math.pow(this.radio,2)));
    }
    
    @Override
    public double perimetro()   {
        return (PI * diametro());
    } 
    
}
