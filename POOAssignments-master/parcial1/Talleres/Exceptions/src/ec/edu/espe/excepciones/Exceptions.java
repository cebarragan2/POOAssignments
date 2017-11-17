/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.excepciones;

import ec.edu.espe.excepciones.model.Animal;

/**
 *
 * @author usuario
 */
public class Exceptions {
    public static void main(String[] args) {
        
        
        Animal animal=null;
        
        try 
        {
            animal.ojos="cafe";
        }
        catch (Exception ex)
                {
                  System.out.println("ERROR AL USAR UN OBJETO NULO  "+ ex.getMessage());
                  
                   ex.printStackTrace();
                }
        
        float x=10;
        float y=0;
        float d=x/y;
        
        System.out.println("La division es: "+d);
    }
    
}
