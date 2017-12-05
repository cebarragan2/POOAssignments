/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.testing;

import ec.edu.espe.model.Estudiante;
import java.util.Scanner;


/**
 *
 * @author usuario
 */
public class TestingEstudiante {
    public static void main(String[] args) {
        String materia1;
        
        float nota1;
        float nota2;
        float nota3;
        String anio;
        String  mes;
        String dia;
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("++++INGRESE EL NUMERO DE ESTUDIANTES++++");
        
        do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!sc.hasNextInt())
                    {
                        System.out.println("Data long negative integer");
                        sc.next();
                    }
                    num=sc.nextInt();
                    
                }while(num<=0);
        
        Estudiante []estudiante = new Estudiante[num];
        
        for (int i=0; i< estudiante.length;i++)
        {
            //ingreso de datos personales del estudiante
            sc.nextLine();
            estudiante[i]=new Estudiante();
            System.out.println("INGRESE EL NOMBRE DEL ESTUDIANTE");
            estudiante[i].setNombre(sc.nextLine());
            System.out.println("INGRESE LA CEDULA DEL ESTUDIANTE");    
            estudiante[i].setCedula(sc.nextInt());
            //INGRSE DE FECHA DE NACIMIENTO DE ESTUDIANTE
            System.out.println("***INGRESE LA FECHA DE NACIMIENTO***");
            System.out.println("INGRESE EL DIA ");
            sc.nextLine();
            dia=sc.nextLine();
            System.out.println("INGRESE EL MES ");
            //sc.nextLine();
            mes=sc.nextLine();
            System.out.println("INGRESE EL AÑO ");
            anio=sc.nextLine();
            estudiante[i].setEdad(dia,mes,anio);
            //ingreso de materias y notas
            System.out.println("INGRESE EL NOMBRE DE LA MATERIA 1");
            
            materia1=sc.nextLine();
            System.out.println("INGRESE LA NOTA 1");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota1=sc.nextFloat();
                    
                }while(nota1<0||nota1>20);
            
            System.out.println("INGRESE LA NOTA 2");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota2=sc.nextFloat();
                    
                }while(nota2<0||nota2>20);
            
            System.out.println("INGRESE LA NOTA 3");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota3=sc.nextFloat();
                    
                }while(nota3<0||nota3>20);
            
            estudiante[i].setMateria1(materia1, nota1, nota2,nota3);
            System.out.println("INGRESE EL NOMBRE DE LA MATERIA 2");
            sc.nextLine();
            materia1=sc.nextLine();
            System.out.println("INGRESE LA NOTA 1");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota1=sc.nextFloat();
                    
                }while(nota1<0||nota1>20);
            
            System.out.println("INGRESE LA NOTA 2");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota2=sc.nextFloat();
                    
                }while(nota2<0||nota2>20);
            System.out.println("INGRESE LA NOTA 3");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota3=sc.nextFloat();
                    
                }while(nota3<0||nota3>20);
            estudiante[i].setMateria2(materia1, nota1, nota2,nota3);
            
            System.out.println("INGRESE EL NOMBRE DE LA MATERIA 3");
            sc.nextLine();
            materia1=sc.nextLine();
            System.out.println("INGRESE LA NOTA 1");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota1=sc.nextFloat();
                    
                }while(nota1<0||nota1>20);
            System.out.println("INGRESE LA NOTA 2");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota2=sc.nextFloat();
                    
                }while(nota2<0||nota2>20);
            System.out.println("INGRESE LA NOTA 3");
            do
                {
                    System.out.println("Enter a positive float ...");
                    while(!sc.hasNextFloat())
                    {
                        System.out.println("Data long negative float");
                        sc.next();
                    }
                    nota3=sc.nextFloat();
                    
                }while(nota3<0||nota3>20);
            estudiante[i].setMateria3(materia1, nota1, nota2,nota3);
            
            
        }
        //IMPRESION DE LOS ESTUDINATES
        for (Estudiante estudiantes: estudiante)
        {
            System.out.println("El Estudiante "+estudiantes.getNombre()+ " de cedula " +estudiantes.getCedula());
            System.out.println("El estudiante tiene "+estudiantes.getEdadAnios()+" años "+ " "+estudiantes.getEdadMeses()+" meses y "+estudiantes.getEdadDias()+" dias");
            System.out.println("    Materia: "+ estudiantes.getMateria1Nombre());
            System.out.println("Nota1: "+estudiantes.getMateria1Nota1());
            System.out.println("Nota2: "+estudiantes.getMateria1Nota2());
            System.out.println("Nota3: "+estudiantes.getMateria1Nota3());
            System.out.println("Tiene el promedio de "+ estudiantes.getPromedio1());
            System.out.println(estudiantes.getEstado1());
            System.out.println("    Materia: "+ estudiantes.getMateria2Nombre());
            System.out.println("Nota1: "+estudiantes.getMateria2Nota1());
            System.out.println("Nota2: "+estudiantes.getMateria2Nota2());
            System.out.println("Nota3: "+estudiantes.getMateria2Nota3());
            System.out.println("Tiene el promedio de "+ estudiantes.getPromedio2());
            System.out.println(estudiantes.getEstado2());
            System.out.println("Materia: "+ estudiantes.getMateria3Nombre());
            System.out.println("Nota1: "+estudiantes.getMateria3Nota1());
            System.out.println("Nota2: "+estudiantes.getMateria3Nota2());
            System.out.println("Nota3: "+estudiantes.getMateria3Nota3());
            System.out.println("Tiene el promedio de "+ estudiantes.getPromedio3());
            System.out.println(estudiantes.getEstado3());
       
        
        }
        
        
    }
    
}
