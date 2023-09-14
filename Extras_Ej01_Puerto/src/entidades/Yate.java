package entidades;

public class Yate extends BarcoAMotor {
    
    private int camarotes;

    public Yate() {
    }

    public Yate(int camarotes, double potencia, String matricula, double eslora, int añoFabricacion) {
        super(potencia, matricula, eslora, añoFabricacion);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
    
    @Override
    public String toString()    {
        return("Camarotes: "+this.camarotes+" - "+super.toString());
    }
    
    @Override
    public double valorModulo() {
        return (this.camarotes + super.valorModulo());        
    }

}