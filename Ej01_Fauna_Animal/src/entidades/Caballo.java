package entidades;

public class Caballo extends Animal {

    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getNombreCaballo() {
        return nombre;
    }

    public void setNombreCaballo(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentoCaballo() {
        return alimento;
    }

    public void setAlimentoCaballo(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdadCaballo() {
        return edad;
    }

    public void setEdadCaballo(Integer edad) {
        this.edad = edad;
    }

    public String getRazaCaballo() {
        return raza;
    }

    public void setRazaCaballo(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void alimentarse()   {
        
        System.out.println("Crunch.. crunch.. crunch");
    }
}
