
package entidades;

public class Hotel5Estrellas extends Hotel4Estrellas {
    
    private int cantidadSalonesConferencia;
    private int cantidadSuites;
    private int cantidadLimousines;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(int cantidadSalonesConferencia, int cantidadSuites, int cantidadLimousines) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimousines = cantidadLimousines;
        this.precioHabitaciones = super.precioHabitaciones + (15 * this.cantidadLimousines);
    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimousines() {
        return cantidadLimousines;
    }

    public void setCantidadLimousines(int cantidadLimousines) {
        this.cantidadLimousines = cantidadLimousines;
    }
    
    @Override
    public String toString()    {
        return(super.toString()+" Cantidad de salones de conferencia: "+this.cantidadSalonesConferencia+" - Cantidad de suites: "+this.cantidadSuites+" Cantidad de limousines: "+this.cantidadLimousines);
    }
    
    
    
    
}
