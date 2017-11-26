/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.enums;

/**
 *
 * @author usuario
 */
public enum Talla {
           
     MINI("S"),
     MEDIANO("M"),
     GRANDE("L"),
     EXTRA_GRANDE("XL"); 
     
         private  String codigo;
       private Talla (String codigo)
       {
           this.codigo=codigo;
       }
       
       public String getIngresoCodigo()
       {
           return this.codigo;
       }
       
     

}
