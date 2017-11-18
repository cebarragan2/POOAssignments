/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.principal;

import ec.edu.espe.model.Profesor;
import java.util.Scanner;



public class TestingTeacher {
    
    public static void main(String[] args) {
        
       int numero;
        int i;
        String nombre;
        String apellido;
        String materia;
        int cedula;
        int edad;
        Scanner sc=new Scanner (System.in);
        System.out.println("INGRESE EL NUMERO DE PROFESORES A INGRESAR ");
        numero=sc.nextInt();
        Profesor  [] profesor   =new Profesor[numero];
        
       
        for (i=0;i<numero;i++)
        {
            System.err.println("PROFESOR " + (i+1));
            System.out.println("INDRESE EL NOMBRE DEL PROFESOR ");
            sc.nextLine();
            nombre=sc.nextLine();
            
            
            System.out.println("INDRESE EL APELLIDO DEL PROFESOR ");
            
            apellido=sc.nextLine();
            
            System.out.println("INDRESE EL MATERIA DEL PROFESOR ");
            
            materia=sc.nextLine();
            
            System.out.println("INDRESE LA CEDULA DEL PROFESOR ");
            cedula=sc.nextInt();
            
            System.out.println("INDRESE LA EDAD DEL PROFESOR ");
            edad=sc.nextInt();
            profesor [i]= new Profesor (nombre,apellido,materia,cedula,edad);
        }
        
         for ( Profesor profesores:profesor)
            {   
                
                System.out.println("El nombre del profesor de "+ profesores.getMateria()+  " es: "+ profesores.getNombre() +" "+ profesores.getApellido()+ " su numero de cedula es " + profesores.getCedula()+ " y su edad es "+profesores.getEdad());

            }
    }
    
   
}
