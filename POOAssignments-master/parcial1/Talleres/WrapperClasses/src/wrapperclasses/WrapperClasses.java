/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasses;

import ec.edu.espe.enums.Level;

/**
 *
 * @author usuario
 */
public class WrapperClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int primitiveInt=6;
        Integer wrapperInt = 100;
        System.out.println(primitiveInt);
        
        System.out.println(wrapperInt);
        
        Integer a=5;
        Integer b=new Integer(5);
                
         System.out.println(a==b);   
         System.out.println("valor de a " +a);
         System.out.println("valor de b " +b);
         
         String s="58";
         a=Integer.parseInt(s);
         s=String.valueOf(a);
                        
        System.out.println(a);
        System.out.println(s);
        
        String s1="CRISTIAN";
        String s2="Cristian";
        
        System.out.println(s1==s2);
        System.out.println(s1.compareTo(s2));
        
         String s3=new String ("pepito");
         String s4=new String ("pepito");
        
        System.out.println(s3.equals(s4));
        System.out.println(s3.compareTo(s4));
        
       s3="maria";
       s4=new String("maria");
       System.out.println(s3.equals(s4));
       
       Level l= Level.HIGH;
       System.out.println(l);

        
        
        
               
    }
    
}
