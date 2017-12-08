/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import ec.edu.espe.enums.EstadoAcademico;
import static ec.edu.espe.enums.EstadoAcademico.APROBADO;
import static ec.edu.espe.enums.EstadoAcademico.REPROBADO;
import static ec.edu.espe.enums.EstadoAcademico.SUPLETORIO;



/**
 *
 * @author usuario
 */
public class Materia {
    private String nombre;
    private  float nota1; 
    private  float nota2;
    private  float nota3;
     private  float promedio;
     private String estado;
     private EstadoAcademico estad;

    public EstadoAcademico getEstad() {
        return estad;
    }
     

    public String getEstado() {
        return estado;
    }
             

    
     
     public float promedio (float not1, float not2, float not3)
    {
        return promedio=((nota1+nota2+nota3)/3);
    }
    
    public float promedio ()
    {
        return promedio=((nota1+nota2+nota3)/3);
    }
    
    public EstadoAcademico estado()
    {
        if (((nota1+nota2+nota3)/3)>=14)
        {
            estad=APROBADO;
        }
        if(((nota1+nota2+nota3)/3)<14&&((nota1+nota2+nota3)/3)>=12)
        {
            estad=SUPLETORIO;
        }
        if (((nota1+nota2+nota3)/3)<12)
        {
            estad=REPROBADO;
        }
        return estad;
    }
    
    public EstadoAcademico estado(float nota1,float nota2, float nota3)
    {
        if (((nota1+nota2+nota3)/3)>=14)
        {
            estad=APROBADO;
        }
        if(((nota1+nota2+nota3)/3)<14&&((nota1+nota2+nota3)/3)>=12)
        {
            estad=SUPLETORIO;
        }
        if (((nota1+nota2+nota3)/3)<12)
        {
            estad=REPROBADO;
        }
        return estad;
    }

    public String getNombre() {
        return nombre;
    }

    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    
    
    
}
