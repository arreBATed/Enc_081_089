
package entidades;

public class BarcoAMotor extends Barco {
    
    protected double potencia;

    public BarcoAMotor() {
    }

    public BarcoAMotor(double potencia, String matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    @Override
    public String toString()    {
        return ("Potencia: "+this.potencia+" - "+super.toString());
    }
    
    @Override
    public double valorModulo() {
        return (this.potencia + super.valorModulo());
    }
    
}
