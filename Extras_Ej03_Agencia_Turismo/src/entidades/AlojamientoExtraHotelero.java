
package entidades;

import enumeradores.TipoAlojamientoExtrahotelero;

public class AlojamientoExtraHotelero extends Alojamiento {
    
    protected TipoAlojamientoExtrahotelero tipoExtrahotelero;
    protected double metrosCuadrados;

    public AlojamientoExtraHotelero() {
    }

    public AlojamientoExtraHotelero(TipoAlojamientoExtrahotelero tipoExtrahotelero, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.tipoExtrahotelero = tipoExtrahotelero;
        this.metrosCuadrados = metrosCuadrados;
    }

    public TipoAlojamientoExtrahotelero getTipoExtrahotelero() {
        return tipoExtrahotelero;
    }

    public void setTipoExtrahotelero(TipoAlojamientoExtrahotelero tipoExtrahotelero) {
        this.tipoExtrahotelero = tipoExtrahotelero;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }
    
    @Override
    public String toString()    {
        if (this.tipoExtrahotelero == TipoAlojamientoExtrahotelero.PRIVADO) {
            return(super.toString()+" Tipo de alojamiento: PRIVADO - Metros cuadrados :"+this.metrosCuadrados);
        }
        else    {
            return(super.toString()+" Tipo de alojamiento: NO PRIVADO - Metros cuadrados :"+this.metrosCuadrados);
        }
    }
    
}
