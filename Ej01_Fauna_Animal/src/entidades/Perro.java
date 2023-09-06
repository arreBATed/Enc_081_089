
package entidades;

public class Perro extends Animal {

    public Perro() {
    }

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getNombrePerro() {
        return nombre;
    }

    public void setNombrePerro(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentoPerro() {
        return alimento;
    }

    public void setAlimentoPerro(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdadPerro() {
        return edad;
    }

    public void setEdadPerro(Integer edad) {
        this.edad = edad;
    }

    public String getRazaPerro() {
        return raza;
    }

    public void setRazaPerro(String raza) {
        this.raza = raza;
    } 
    
    @Override
    public void alimentarse()   {
        
        System.out.println("Crunch.. crunch.. crunch");
    }
}
