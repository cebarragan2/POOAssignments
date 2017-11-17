/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.penatgono;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class pentagono {
    public static void main(String[] args) {
        float side;
                
        float perimeter;
        Scanner sc=new Scanner(System.in);
        System.out.println("CALCULO DEL PERIMETRO DE UN PENTAGONO");
        System.out.println("INGRESE EL VALOR DEL LADO DEL PENTAGONO");
        side=sc.nextFloat();
        perimeter=side*5;
        
        System.out.println("EL PERIMETRO DEL PENTAGONO ES: " +perimeter);
        
    }
}
