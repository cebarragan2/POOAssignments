/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tallaif;

import ec.edu.espe.enums.Talla;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TallaIf {

   
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE UNA TALLA: MINI, MEDIANO, GRANDE EXTRA_GRANDE ");
        String ingreso=sc.nextLine().toUpperCase();
        Talla opcion=Enum.valueOf(Talla.class, ingreso);
        
         if (ingreso.equals("MINI"))
         {
             System.out.println("LA TALLA ES: "+opcion+" y su codigo es: "+ opcion.getIngresoCodigo());
             System.out.println("La altura es : 163-168 cm ");
             System.out.println("El tamaño en pecho  es : 84-88 cm ");
             System.out.println("El tamaño en cintura es : 65-70 cm ");
             System.out.println("El tamaño en cadera es : 88-92 cm ");
             System.out.println("El tamaño en pierna es : 78 cm ");
         }
         if (ingreso.equals("MEDIANO"))
         {
             System.out.println("LA TALLA ES: "+opcion+" y su codigo es: "+ opcion.getIngresoCodigo());
             System.out.println("La altura es : 168-173 cm ");
             System.out.println("El tamaño en pecho  es : 88-92 cm ");
             System.out.println("El tamaño en cintura es : 70-75 cm ");
             System.out.println("El tamaño en cadera es : 92-96 cm ");
             System.out.println("El tamaño en pierna es : 79 cm ");
         }
         if (ingreso.equals("GRANDE"))
         {
             System.out.println("LA TALLA ES: "+opcion+" y su codigo es: "+ opcion.getIngresoCodigo());
             System.out.println("La altura es : 173-178 cm ");
             System.out.println("El tamaño en pecho  es : 92-96 cm ");
             System.out.println("El tamaño en cintura es : 75-80 cm ");
             System.out.println("El tamaño en cadera es : 96-100 cm ");
             System.out.println("El tamaño en pierna es : 80 cm ");
         }
         if (ingreso.equals("EXTRA_GRANDE"))
         {
             System.out.println("LA TALLA ES: "+opcion+" y su codigo es: "+ opcion.getIngresoCodigo());
             System.out.println("La altura es : 178-183 cm ");
             System.out.println("El tamaño en pecho  es : 96-100 cm ");
             System.out.println("El tamaño en cintura es : 80-85 cm ");
             System.out.println("El tamaño en cadera es : 100-104 cm ");
             System.out.println("El tamaño en pierna es : 81 cm ");
         }
        
    }
    
}
