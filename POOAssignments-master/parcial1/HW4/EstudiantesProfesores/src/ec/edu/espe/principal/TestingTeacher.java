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
        float sueldo;
        Scanner sc=new Scanner (System.in);
        System.out.println("INGRESE EL NUMERO DE PROFESORES A INGRESAR ");
        do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!sc.hasNextInt())
                    {
                        System.out.println("Data long negative integer");
                        sc.next();
                    }
                    numero=sc.nextInt();
                    
                }while(numero<=0);
                
        
        
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
            
            do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!sc.hasNextInt())
                    {
                        System.out.println("Data long negative integer");
                        sc.next();
                    }
                    cedula=sc.nextInt();
                    
                }while(cedula<=0);
            
            
            System.out.println("INDRESE LA EDAD DEL PROFESOR ");
            do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!sc.hasNextInt())
                    {
                        System.out.println("Data long negative integer");
                        sc.next();
                    }
                    edad=sc.nextInt();
                    
                }while(edad<=0);
            System.out.println("INFRESE EL SUELDO DEL PROFESOR");
            
            do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative integer");
                        sc.next();
                    }
                   sueldo=sc.nextFloat();
                    
                }while(sueldo<=350);
            
            
            profesor [i]= new Profesor (nombre,apellido,materia,cedula,edad,sueldo);
        }
        
         for ( Profesor profesores:profesor)
            {   
                
                System.out.println("El nombre del profesor de "+ profesores.getMateria()+  " es: "+ profesores.getNombre() +" "+ profesores.getApellido()+ " su número de cédula es " + profesores.getCedula()+ " , su edad es "+profesores.getEdad()+" y su salario es "+ profesores.getSueldo());

            }
    }
    
   
}
