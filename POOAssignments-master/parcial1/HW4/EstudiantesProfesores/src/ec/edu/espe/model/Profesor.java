/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;


public class Profesor {
    
    private String nombre;
    private String apellido;
    private String materia;
    private int cedula;
    private int edad;
    private float sueldo;

    public Profesor(String nombre, String apellido, String materia, int cedula, int edad,float sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.materia = materia;
        this.cedula = cedula;
        this.edad = edad;
        this.sueldo=sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public Profesor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMateria() {
        return materia;
    }

    public int getCedula() {
        return cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
