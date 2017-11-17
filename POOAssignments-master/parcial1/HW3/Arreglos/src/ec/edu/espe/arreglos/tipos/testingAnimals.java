/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;


/**
 *
 * @author usuario
 */
public class testingAnimals {
    
   
    
    public static void main(String[] args) {
        
         Animal  caballo[] = new Animal[10];
            
             
             for(int i=0 ;i<caballo.length;i++)
             {
                 
                 
                 if(i%2 == 0)
                 {
                     caballo [i]= new Animal(i+1,"Brown","Cornicon");
                 }
                 else
                 {
                     caballo[i]= new Animal(i+1,"Black","Cornicon");
                 }  
                 

             }
            for (Animal caballos : caballo) 
            {   
                System.out.println("Caballo"+caballos.getId()+" "+ caballos.getName() + " su id es:"+ caballos.getId() + " y sus Ojos son de color : " + caballos.getEyes());
                System.out.println();
                
            }
    
    }
    
}
