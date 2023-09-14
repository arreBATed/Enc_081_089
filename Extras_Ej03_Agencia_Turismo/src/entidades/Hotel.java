package entidades;

public class Hotel extends Alojamiento  {
    
    protected int habitaciones;
    protected int camas;
    protected int pisos;
    protected double precioHabitaciones;

    public Hotel() {
    }

    public Hotel(int habitaciones, int camas, int pisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitaciones = 50;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getCamas() {
        return camas;
    }

    public void setCamas(int camas) {
        this.camas = camas;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public double getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(double precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;   
    }
    
    @Override
    public String toString()    {
        return (" HOTEL: "+super.toString()+" - Cantidad de habitaciones: "+this.habitaciones+" - Cantidad de camas: "+this.camas+" - Cantidad de pisos: "+this.pisos+" - Precio por habitacion: $"+this.precioHabitaciones);
    }
    
    
}
