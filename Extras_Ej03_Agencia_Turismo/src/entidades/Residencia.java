package entidades;

import enumeradores.TipoAlojamientoExtrahotelero;

public class Residencia extends AlojamientoExtraHotelero {
    
    private int cantidadHabitaciones;
    private boolean descuentoGremios;
    private boolean poseeCamposDeportivo;

    public Residencia() {
    }

    public Residencia(int cantidadHabitaciones, boolean descuentoGremios, boolean poseeCamposDeportivo, TipoAlojamientoExtrahotelero tipoExtrahotelero, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(tipoExtrahotelero, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.poseeCamposDeportivo = poseeCamposDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public boolean isPoseeCamposDeportivo() {
        return poseeCamposDeportivo;
    }

    public void setPoseeCamposDeportivo(boolean poseeCamposDeportivo) {
        this.poseeCamposDeportivo = poseeCamposDeportivo;
    }
    
    @Override
    public String toString()    {
        
        if (this.descuentoGremios)  {
            if (this.poseeCamposDeportivo){
                    return (super.toString()+" - Cantidad de habitaciones: "+this.cantidadHabitaciones+" - Descuento a gremios: SE REALIZAN - Campo deportivo: POSEE");
            }
            else    {
                  return (super.toString()+" - Cantidad de habitaciones: "+this.cantidadHabitaciones+" - Descuento a gremios: SE REALIZAN - Campo deportivo: NO POSEE");        
            }
        }
        else    {
            if (this.poseeCamposDeportivo){
                    return (super.toString()+" - Cantidad de habitaciones: "+this.cantidadHabitaciones+" - Descuento a gremios: NO SE REALIZAN - Campo deportivo: POSEE");
            }
            else    {
                  return (super.toString()+" - Cantidad de habitaciones: "+this.cantidadHabitaciones+" - Descuento a gremios: NO SE REALIZAN - Campo deportivo: NO POSEE");        
            }
        }        
    }
    
}
