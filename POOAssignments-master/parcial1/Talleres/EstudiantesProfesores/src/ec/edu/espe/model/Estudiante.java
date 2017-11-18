

package ec.edu.espe.model;


public class Estudiante {

     private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private int cedula;
    
    public Estudiante(String nombre, String apellido, int edad, String nacionalidad, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getCedula() {
        return cedula;
    }
    
    
   
    
}
