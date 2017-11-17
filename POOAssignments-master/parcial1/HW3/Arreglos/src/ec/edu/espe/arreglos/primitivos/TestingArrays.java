/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.primitivos;

/**
 *
 * @author usuario
 */
public class TestingArrays {

    public static void main(String[] args) {
        int[] enteros = new int[10];
        float[] flotantes = new float[5];
        int [] otrosEnteros={8,11,2017};
        int i;
        float decimal;
        float dec=0.1f;
        for (i = 0; i < 10; i++) {

            enteros[i] = i + 1;
        }

        for (i = 0; i<flotantes.length; i++) {
             decimal=(float)i;
            flotantes[i] = 1 +(decimal/10);
            
        }
        
        
        for (int entero:enteros){
            
            System.out.println(entero);
        }
        
        for ( float flotante:flotantes){
            
            System.out.println (flotante);
        }
        
        
       
}
}


