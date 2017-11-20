/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import iVerde.IVerde;
import ice.ICE;
import iva.Iva;
import java.util.Scanner;



/**
 *
 * @author usuario
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float numero;
        float gradoAlcohol;
        float volumen;
        float precioR;
        int cilindraje;
        int año;
        System.out.println("*****CACULO DE IVA*****");
        System.out.println("INGRESE EL VALOR A CALCULAR EL IVA");
        
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              numero=sc.nextFloat();
                    
            }while(numero<=0.0f);
        
        System.out.println("El valor del impuesto IVA es " + Iva.compute(numero)+ "y su total es "+(numero+Iva.compute(numero)) );
        
        System.out.println("*****CALCULO DE ICE DE BEBIDAS ALCOHLICAS NACIONALES*****");
        System.out.println("Ingrse los grados de alcohol de la bebida");
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              gradoAlcohol=sc.nextFloat();
                    
            }while(gradoAlcohol<=0.0f);
        
        System.out.println("Ingrese el Volumen de alcohol");
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              volumen=sc.nextFloat();
                    
            }while(volumen<=0.0f);
        System.out.println("Ingrese el precio de la botella");
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              precioR=sc.nextFloat();
                    
            }while(precioR<=0.0f);
        
        System.out.println("El impuesto ICE de la botella de alcohl es de: "+ICE.compute(gradoAlcohol, volumen, precioR)+" y su precio final es: "+(precioR+ICE.compute(gradoAlcohol, volumen, precioR)));
        
        
        System.out.println("******CALCULO DEL IMPUESTO VERDE*******");
        
        System.out.println("Ingrese el cilindraje del auto o motociceta");
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              cilindraje=sc.nextInt();
                    
            }while(cilindraje<=0);
        
        System.out.println("Ingrese el año del vehiculo");
        
        do
           {
                 System.out.println("Enter a positive integer ...");
                 while(!sc.hasNextFloat())
                {
                  System.out.println("Data long negative integer");
                  sc.next();
                }
              año=sc.nextInt();
                    
            }while(año<=1960&&año>2018);
        
        System.out.println("El impuesto verde a pagar es de: "+IVerde.compute(cilindraje, año));
        
    }
             
}
