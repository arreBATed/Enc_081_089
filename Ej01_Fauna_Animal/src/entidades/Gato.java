
package entidades;

public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    public String getNombreGato() {
        return nombre;
    }

    public void setNombreGato(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimentoGato() {
        return alimento;
    }

    public void setAlimentoGato(String alimento) {
        this.alimento = alimento;
    }

    public Integer getEdadGato() {
        return edad;
    }

    public void setEdadGato(Integer edad) {
        this.edad = edad;
    }

    public String getRazaGato() {
        return raza;
    }

    public void setRazaGato(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void alimentarse()   {
        
        System.out.println("Crack.. crack.. crack");
    }
    
    
}
