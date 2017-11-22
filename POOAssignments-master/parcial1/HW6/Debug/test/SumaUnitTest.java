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
        int  operando1;
        int operando2;
        operando1=(int)-10000;
        operando2=(int)-30000;
        Suma suma=new Suma();
        int expResult=(int)-40000;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest3()
    {
        int operando1;
        int operando2;
        operando1=(int)10;
        operando2=(int)20;
        Suma suma=new Suma();
        int expResult=(int)30;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest4()
    {
        int operando1;
        int operando2;
        operando1=(int)-60;
        operando2=(int)-70000;
        Suma suma=new Suma();
        int expResult=(int)-130;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest5()
    {
        int operando1;
        int operando2;
        operando1=(int)12000;
        operando2=(int)10000;
        Suma suma=new Suma();
        int expResult=(int)22000;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest6()
    {
        int operando1;
        int operando2;
        operando1=(int)15000;
        operando2=(int)-5000;
        Suma suma=new Suma();
        int expResult=(int)10000;
        int actualResult=suma.sumar((short)operando1,(short) operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest7()
    {
        int operando1;
        int operando2;
        operando1=(int)-13000;
        operando2=(int)2000;
        Suma suma=new Suma();
        int expResult=(int)-11000;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest8()
    {
        int operando1;
        int operando2;
        operando1=(int)80000;
        operando2=(int)-3000;
        Suma suma=new Suma();
        int expResult=(int)77000;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest9()
    {
        int operando1;
        int operando2;
        operando1=(int)-1;
        operando2=(int)-2;
        Suma suma=new Suma();
        int expResult=(int)-3;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
      @Test
    public void NegativeTest10()
    {
        int operando1;
        int operando2;
        operando1=(int)6000;
        operando2=(int)-80000;
        Suma suma=new Suma();
        int expResult=(int)-74000;
        int actualResult=suma.sumar((short)operando1,(short)operando2);
        assertEquals(expResult,actualResult);
        
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
