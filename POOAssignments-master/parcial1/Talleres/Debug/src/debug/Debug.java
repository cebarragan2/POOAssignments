/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package debug;

import OperacionesBasicas.Suma;

/**
 *
 * @author usuario
 */
public class Debug {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       short op1;
       short op2;
       short res;
       
       op1=(short)40000;
       op2=(short)40000;
       res=(short) (op1+op2);
       
        System.out.println("resultado" +res);
        
        
        op1=(short)15000;
       op2=(short)18000;
       res=(short) (op1+op2);
       
        System.out.println("resultado" +res);
        
        op1=(short)-10000;
       op2=(short)-30000;
       res=(short) (op1+op2);
       
        System.out.println("resultado" +res);
        
        Suma s=new Suma();
        op1=(short)10;
        op2=(short)20;
        System.out.println("la suma es"+s.sumar(op1,op2));
    }
    
}
