package entidades;

import enumeradores.TipoAlojamientoExtrahotelero;

public class Camping extends AlojamientoExtraHotelero {
    
    private int capacidadCarpa;
    private int cantidadBanios;
    private boolean poseeRestaurant;

    public Camping() {
    }

    public Camping(int capacidadCarpa, int cantidadBanios, boolean poseeRestaurant, TipoAlojamientoExtrahotelero tipoExtrahotelero, double metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(tipoExtrahotelero, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadCarpa = capacidadCarpa;
        this.cantidadBanios = cantidadBanios;
        this.poseeRestaurant = poseeRestaurant;
    }

    public int getCapacidadCarpa() {
        return capacidadCarpa;
    }

    public void setCapacidadCarpa(int capacidadCarpa) {
        this.capacidadCarpa = capacidadCarpa;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isPoseeRestaurant() {
        return poseeRestaurant;
    }

    public void setPoseeRestaurant(boolean poseeRestaurant) {
        this.poseeRestaurant = poseeRestaurant;
    }
    
    @Override
    public String toString()    {
        if (this.poseeRestaurant)   {
            return(super.toString()+" - Capacidad de carpas: "+this.capacidadCarpa+" - Cantidad de baños: "+this.cantidadBanios+" - Baños: POSEE");
        }
        else    {
            return(super.toString()+" - Capacidad de carpas: "+this.capacidadCarpa+" - Cantidad de baños: "+this.cantidadBanios+" - Baños: NO POSEE");
        }
    }
    
}
