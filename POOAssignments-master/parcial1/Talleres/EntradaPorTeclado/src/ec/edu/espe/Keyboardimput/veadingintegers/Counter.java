
package ec.edu.espe.Keyboardimput.veadingintegers;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Counter {
    public static final int IVA=12;
    public static void main(String[] args) throws java.io.IOException {
        int myInt;
        int c;
        int contador=1;
        try {
            myInt=System.in.read();
            System.out.println("The integer is : "+(char)myInt);
        } catch (IOException ex) {
            Logger.getLogger(Counter.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("POR FAVOR INGRESE UN DIGITO");
        }
        System.out.println("El PORCENTAJE DEL IVA ES "+IVA);
        System.out.print("ENTER A DIGIT --> ");
        
        while((c=System.in.read() )!='\n')
        {
            contador++;
            System.out.print((char)c);
            
        }
        
        
        System.out.println("  Numero " +contador);
        
        Scanner keyboard=new Scanner (System.in);
        int number;
                
                do
                {
                    System.out.println("Enter a positive integer ...");
                    while(!keyboard.hasNextInt())
                    {
                        System.out.println("Data long negative integer");
                        keyboard.next();
                    }
                    number=keyboard.nextInt();
                    
                }while(number<=0);
                
                System.out.println("The integer is: "+number);
                
                int sumando1;
                int sumando2;
                int sumaTotal;
                
                System.out.println("Enter to integers to add");
                
                Scanner sc=new Scanner(System.in);
                sumando1=sc.nextInt();
                sumando2=sc.nextInt();
                
                sumaTotal=sumando1+sumando2;
                
                System.out.println("The add is:  "+sumaTotal);
                
                
    }
    
}
