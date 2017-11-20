/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ice;

/**
 *
 * @author usuario
 */
public class ICE {
    public static float compute (float gradoAlcohol, float volumen, float precioR)
    {
        float iceActual;
        
        iceActual=precioR*(gradoAlcohol/100.0f)*(volumen/1000.0f)*0.4f;
                
       return iceActual;
    }
    
}
