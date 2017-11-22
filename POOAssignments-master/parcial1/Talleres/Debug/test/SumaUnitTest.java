/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import OperacionesBasicas.Suma;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class SumaUnitTest {
    
    public SumaUnitTest() {
    }
    
    @Test
    
   
    
    public void NegativeTest()
    {
        int operando1;
        int operando2;
        operando1=(int)40000;
        operando2=(int)40000;
        Suma suma=new Suma();
        int expResult=(int)80000;
        int actualResult=(int)suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest2()
    {
        short operando1;
        short operando2;
        operando1=(short)-10000;
        operando2=(short)-30000;
        Suma suma=new Suma();
        short expResult=(short)-40000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest3()
    {
        short operando1;
        short operando2;
        operando1=(short)10;
        operando2=(short)20;
        Suma suma=new Suma();
        short expResult=(short)30;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest4()
    {
        short operando1;
        short operando2;
        operando1=(short)-60;
        operando2=(short)-70;
        Suma suma=new Suma();
        short expResult=(short)-130;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest5()
    {
        short operando1;
        short operando2;
        operando1=(short)12000;
        operando2=(short)10000;
        Suma suma=new Suma();
        short expResult=(short)22000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest6()
    {
        short operando1;
        short operando2;
        operando1=(short)15000;
        operando2=(short)-5000;
        Suma suma=new Suma();
        short expResult=(short)10000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest7()
    {
        short operando1;
        short operando2;
        operando1=(short)-13000;
        operando2=(short)2000;
        Suma suma=new Suma();
        short expResult=(short)-11000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest8()
    {
        short operando1;
        short operando2;
        operando1=(short)80000;
        operando2=(short)-3000;
        Suma suma=new Suma();
        short expResult=(short)77000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest9()
    {
        short operando1;
        short operando2;
        operando1=(short)-1;
        operando2=(short)-2;
        Suma suma=new Suma();
        short expResult=(short)-3;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest10()
    {
        short operando1;
        short operando2;
        operando1=(short)6000;
        operando2=(short)-80000;
        Suma suma=new Suma();
        short expResult=(short)-74000;
        short actualResult=suma.sumar(operando1,operando2);
        assertEquals(expResult,actualResult);
        
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
