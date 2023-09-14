
package entidades;

import enumeradores.TipoGym;

public class Hotel4Estrellas extends Hotel {
    
    protected TipoGym tipoGym;
    protected String nombreRestaurant;
    protected int capacidadRestaurant;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(TipoGym tipoGym, String nombreRestaurant, int capacidadRestaurant) {
        this.tipoGym = tipoGym;
        this.nombreRestaurant = nombreRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
        this.precioHabitaciones = super.precioHabitaciones;
        if (this.tipoGym == TipoGym.A)  {
            this.precioHabitaciones = this.precioHabitaciones + 50;
        }
        else {
            this.precioHabitaciones = this.precioHabitaciones + 30;
        }
        if (this.capacidadRestaurant < 30)  {
            this.precioHabitaciones = this.precioHabitaciones + 10;
        }
        else if ((30 <= this.capacidadRestaurant) && (this.capacidadRestaurant < 50)) {
            this.precioHabitaciones = this.precioHabitaciones + 30;
        }
        else    {
            this.precioHabitaciones = this.precioHabitaciones + 50;
        }
    }

    public TipoGym getTipoGym() {
        return tipoGym;
    }

    public void setTipoGym(TipoGym tipoGym) {
        this.tipoGym = tipoGym;
    }

    public String getNombreRestaurant() {
        return nombreRestaurant;
    }

    public void setNombreRestaurant(String nombreRestaurant) {
        this.nombreRestaurant = nombreRestaurant;
    }

    public int getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(int capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    
    
    @Override
    public String toString()    {
        
        if (this.tipoGym == TipoGym.A)  {
            return (super.toString()+" - Gym: Posee - Nombre de restaurante: "+this.nombreRestaurant+" - Capacidad de restaurant: "+this.capacidadRestaurant);
        }
        else    {
            return (super.toString()+" - Gym: No posee - Nombre de restaurante: "+this.nombreRestaurant+" - Capacidad de restaurant: "+this.capacidadRestaurant);
        }
    }
    
}
