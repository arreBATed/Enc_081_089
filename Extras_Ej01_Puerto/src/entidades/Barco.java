
package entidades;

public class Barco {
    
    protected String matricula;
    protected double eslora;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, double eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    @Override
    public String toString()    {
        return("Matricula: "+this.matricula+" - Eslora: "+this.eslora+" - Año de fabricacion: "+this.añoFabricacion);
    }
    
    public double valorModulo() {
        return (this.eslora * 10);
    }
}
