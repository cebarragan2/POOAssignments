/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author usuario
 */
public class Estudiante {
    private String nombre;
    private int cedula;
    private String edad;

    
    
    private final  Edad edad1= new Edad();
    private final  Materia materia1=new Materia();
    private final  Materia materia2=new Materia();
    private final  Materia materia3=new Materia();
    
    
    public String getMateria1Nombre() {
        return materia1.getNombre();
    }
    
    public float getMateria1Nota1() {
        return materia1.getNota1();
    }
     
    public float getPromedio1() {
        return materia1.promedio();
    }
    public String getEstado1() {
        return materia1.estado();
    }
    public String getEstado2() {
        return materia2.estado();
    }
    public String getEstado3() {
        return materia3.estado();
    }
    public float getPromedio2() {
        return materia2.promedio();
    }
    public float getPromedio3() {
        return materia3.promedio();
    }
    public float getMateria1Nota2() {
        return materia1.getNota2();
    }
    public float getMateria1Nota3() {
        return materia1.getNota3();
    }
     
    public void setMateria1(String nombreMate,float nota1,float nota2, float nota3)
    {
        this.materia1.setNombre(nombreMate);
        this.materia1.setNota1(nota1);
        this.materia1.setNota2(nota2);
        this.materia1.setNota3(nota3);
    }
    
    public String getMateria2Nombre() {
        return materia2.getNombre();
    }
    
    public float getMateria2Nota1() {
        return materia2.getNota1();
    }
    public float getMateria2Nota2() {
        return materia2.getNota2();
    }
    public float getMateria2Nota3() {
        return materia2.getNota3();
    }
    
    
    public int getEdadDias()
    {
        return edad1.getdias();
    }
    public int getEdadMeses()
    {
        return edad1.getdmeses();
    }
    public int getEdadAnios()
    {
        return edad1.getanios();
    }

     public void setEdad(String dia,String mes,String anio)
     {
         
         this.edad1.setAnio(anio);
         this.edad1.setMes(mes);
         this.edad1.setDia(dia);
         
     }
    public void setMateria2(String nombreMate,float nota1,float nota2, float nota3)
    {
        this.materia2.setNombre(nombreMate);
        this.materia2.setNota1(nota1);
        this.materia2.setNota2(nota2);
        this.materia2.setNota3(nota3);
    }
    
   
    
    public String getMateria3Nombre() {
        return materia3.getNombre();
    }
    
    public float getMateria3Nota1() {
        return materia3.getNota1();
    }
    public float getMateria3Nota2() {
        return materia3.getNota2();
    }
    public float getMateria3Nota3() {
        return materia3.getNota3();
    }
     
    public void setMateria3(String nombreMate,float nota1,float nota2, float nota3)
    {
        this.materia3.setNombre(nombreMate);
        this.materia3.setNota1(nota1);
        this.materia3.setNota2(nota2);
        this.materia3.setNota3(nota3);
    }
     
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

   

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

  public int getCedula (int cedula) {
        return cedula;
    }

}

    

    
    
    
    