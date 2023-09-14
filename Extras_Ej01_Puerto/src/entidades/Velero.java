package entidades;

public class Velero extends Barco {
    
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, String matricula, double eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    
    @Override
    public String toString()    {
        return ("Mastiles: "+this.mastiles+" - "+super.toString());
    }    
    
    @Override
    public double valorModulo()    {
        return (super.valorModulo() + this.mastiles);
    }
}
