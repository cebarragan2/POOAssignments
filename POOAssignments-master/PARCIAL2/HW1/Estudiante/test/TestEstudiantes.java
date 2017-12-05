/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ec.edu.espe.model.Estudiante;
import ec.edu.espe.model.Materia;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author usuario
 */
public class TestEstudiantes {
    
    public TestEstudiantes() {
        
    }
    
     @Test
     
     public void casosNotas1()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=0.0f;
         nota2=0.0f;
         nota3=0.0f;
        Materia materia=new Materia();
        float expResult=0.0f;
        float delta=0.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas2()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=14.0f;
         nota2=14.0f;
         nota3=14.0f;
         Materia materia=new Materia();
        float expResult=14.0f;
        float delta=14.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas3()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=12.0f;
         nota2=12.0f;
         nota3=12.0f;
         Materia materia=new Materia();
        float expResult=12.0f;
        float delta=12.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas4()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=13.8f;
         nota2=14.1f;
         nota3=14.1f;
         Materia materia=new Materia();
        float expResult=14.0f;
        float delta=14.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
    @Test
     public void casosNotas5()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=11.7f;
         nota2=11.2f;
         nota3=12.11f;
         Materia materia=new Materia();
        float expResult=12.0f;
        float delta=12.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas6()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=12.0f;
         nota2=11.9f;
         nota3=12.1f;
         Materia materia=new Materia();
        float expResult=12.0f;
        float delta=12.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas7()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=20.0f;
         nota2=20.0f;
         nota3=20.0f;
         Materia materia=new Materia();
        float expResult=20.0f;
        float delta=20.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas8()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=12.0f;
         nota2=13.0f;
         nota3=17.0f;
         Materia materia=new Materia();
        float expResult=14.0f;
        float delta=14.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas9()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=11.0f;
         nota2=12.2f;
         nota3=12.9f;
         Materia materia=new Materia();
        float expResult=12.03f;
        float delta=12.03f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas10()
     {
        float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=14.9f;
         nota2=14.9f;
         nota3=13.0f;
         Materia materia=new Materia();
        float expResult=14.2666f;
        float delta=14.26666667f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     
     @Test
     public void casosNotas11()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.9f;
         nota2=14.9f;
         nota3=13.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas12()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.0f;
         nota2=14.0f;
         nota3=14.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas13()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=15.9f;
         nota2=13.1f;
         nota3=13.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas14()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=15.9f;
         nota2=12.9f;
         nota3=13.2f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas15()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.9f;
         nota2=14.9f;
         nota3=12.2f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas16()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.9f;
         nota2=14.9f;
         nota3=12.3f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas17()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.9f;
         nota2=15.0f;
         nota3=13.1f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas18()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=20.0f;
         nota2=20.0f;
         nota3=20.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas19()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=19.9f;
         nota2=19.9f;
         nota3=20.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas20()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=15.0f;
         nota2=14.0f;
         nota3=13.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas21()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=2.0f;
         nota2=20.0f;
         nota3=20.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas22()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=4.0f;
         nota2=19.0f;
         nota3=19.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas23()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=18.1f;
         nota2=18.1f;
         nota3=5.8f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas24()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=16.0f;
         nota2=16.0f;
         nota3=10.0f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas25()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.2f;
         nota2=14.2f;
         nota3=13.6f;
         Materia materia=new Materia();
        String expResult="APROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas26()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.0f;
         nota2=14.0f;
         nota3=13.9999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas27()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.0f;
         nota2=14.1f;
         nota3=13.89999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas28()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.0f;
         nota2=12.0f;
         nota3=12.0f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas29()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.2f;
         nota2=12.2f;
         nota3=11.96f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas30()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=11.0f;
         nota2=11.0f;
         nota3=14.0f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas31()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=20.0f;
         nota2=20.0f;
         nota3=1.99999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas32()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=20.0f;
         nota2=20.0f;
         nota3=1.9980f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas33()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.0f;
         nota2=15.0f;
         nota3=12.999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas34()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.9999f;
         nota2=14.9999f;
         nota3=12.000199f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas35()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.9999f;
         nota2=12.9999f;
         nota3=16.0001f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     } @Test
     public void casosNotas36()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.99999f;
         nota2=12.99999f;
         nota3=16.0f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas37()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.01f;
         nota2=14.01f;
         nota3=13.97999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas38()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.09f;
         nota2=14.9f;
         nota3=13.00999f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas39()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.09f;
         nota2=12.9f;
         nota3=11.0199f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
      @Test
     public void casosNotas40()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.01f;
         nota2=12.01f;
         nota3=11.98f;
         Materia materia=new Materia();
        String expResult="SUPLETORIO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas41()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.01f;
         nota2=12.01f;
         nota3=11.97f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas42()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.01f;
         nota2=12.01f;
         nota3=11.97999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas43()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.00f;
         nota2=12.00f;
         nota3=11.999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas44()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.00f;
         nota2=12.00f;
         nota3=11.9998f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas45()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.00f;
         nota2=13.00f;
         nota3=10.999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas46()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.00f;
         nota2=14.00f;
         nota3=9.9899f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas47()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=0.00f;
         nota2=0.00f;
         nota3=11.98f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas48()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=0.0f;
         nota2=0.0f;
         nota3=0.0f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas49()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=0.01f;
         nota2=0.01f;
         nota3=0.98f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas50()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=20.00f;
         nota2=15.00f;
         nota3=0.989f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas51()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=20.00f;
         nota2=15.01f;
         nota3=0.98f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas52()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=14.01f;
         nota2=14.01f;
         nota3=7.97999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas53()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.999f;
         nota2=12.999f;
         nota3=10.0019999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas54()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.999f;
         nota2=12.999f;
         nota3=10.0019666f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas55()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=1.01f;
         nota2=1.01f;
         nota3=1.98f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas56()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=10.00f;
         nota2=10.00f;
         nota3=15.99999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     
     @Test
     public void casosNotas57()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=10.00f;
         nota2=11.00f;
         nota3=14.9899f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }@Test
     public void casosNotas58()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.01999f;
         nota2=12.01999f;
         nota3=11.959f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }@Test
     public void casosNotas59()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=12.00f;
         nota2=12.00f;
         nota3=11.9999f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }@Test
     public void casosNotas60()
     {
        float nota1;
         float nota2;
         float nota3;
         nota1=8.01f;
         nota2=9.01f;
         nota3=18.9799f;
         Materia materia=new Materia();
        String expResult="REPROBADO";
        String actualResult=materia.estado(nota1,nota2,nota3);
        assertEquals(expResult,actualResult);
         
     }
     
     @Test
     public void casosNotas61()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=1726869991;
        int expResult=1726869991;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas62()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=1999999999;
        int expResult=1999999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas63()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2099999999;
        int expResult=2099999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas64()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=1103033344;
        int expResult=1103033344;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas65()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2119911111;
        int expResult=2119911111;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas66()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2129999999;
        int expResult=2129999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }@Test
     public void casosNotas67()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2139999999;
        int expResult=2139999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas68()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2141999999;
        int expResult=2141999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas69()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2142999999;
        int expResult=2142999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas70()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2143999999;
        int expResult=2143999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas71()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2144999999;
        int expResult=2144999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas72()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2145999999;
        int expResult=2145999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas73()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2146999999;
        int expResult=2146999999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }@Test
     public void casosNotas74()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147199999;
        int expResult=2147199999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas75()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147299999;
        int expResult=2147299999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas76()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147399999;
        int expResult=2147399999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas77()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147419999;
        int expResult=2147419999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas78()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147429999;
        int expResult=2147429999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas79()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147439999;
        int expResult=2147439999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas80()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147449999;
        int expResult=2147449999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas81()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147459999;
        int expResult=2147459999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas82()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147469999;
        int expResult=2147469999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas83()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147479999;
        int expResult=2147479999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas84()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147481999;
        int expResult=2147481999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas85()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147482999;
        int expResult=2147482999;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas86()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147482199;
        int expResult=2147483199;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas87()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147482299;
        int expResult=2147483299;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas88()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147483399;
        int expResult=2147483399;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas89()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147483499;
        int expResult=2147483499;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     @Test
     public void casosNotas90()
     {
        int cedula;
        Estudiante estudiante=new Estudiante();
        cedula=2147483599;
        int expResult=2147483599;
        int actualResult=estudiante.getCedula(cedula);
        assertEquals(expResult,actualResult);
         
     }
     
     @Test
     
     public void casosNotas91()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=0.1f;
         nota2=0.2f;
         nota3=0.3f;
        Materia materia=new Materia();
        float expResult=0.2f;
        float delta=0.2f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas92()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=14.0f;
         nota2=14.5f;
         nota3=14.9f;
         Materia materia=new Materia();
        float expResult=14.466f;
        float delta=14.4666f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas93()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=12.5f;
         nota2=12.5f;
         nota3=12.5f;
         Materia materia=new Materia();
        float expResult=12.5f;
        float delta=12.5f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
      @Test
     public void casosNotas94()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=13.8f;
         nota2=14.1f;
         nota3=14.1f;
         Materia materia=new Materia();
        float expResult=14.0f;
        float delta=14.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
    @Test
     public void casosNotas95()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=11.7f;
         nota2=11.9f;
         nota3=12.11f;
         Materia materia=new Materia();
        float expResult=11.9f;
        float delta=11.9f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas96()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=16.0f;
         nota2=16.0f;
         nota3=16.0f;
         Materia materia=new Materia();
        float expResult=16.0f;
        float delta=16.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas97()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=19.0f;
         nota2=19.0f;
         nota3=19.0f;
         Materia materia=new Materia();
        float expResult=19.0f;
        float delta=19.0f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas98()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=12.5f;
         nota2=13.5f;
         nota3=17.5f;
         Materia materia=new Materia();
        float expResult=14.5f;
        float delta=14.5f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas99()
     {
         float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=11.9f;
         nota2=12.2f;
         nota3=12.9f;
         Materia materia=new Materia();
        float expResult=12.3333f;
        float delta=12.33333f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     @Test
     public void casosNotas100()
     {
        float nota1;
         float nota2;
         float nota3;
         float promedio;
         nota1=14.8f;
         nota2=14.8f;
         nota3=13.8f;
         Materia materia=new Materia();
        float expResult=14.4666f;
        float delta=14.46666667f;
        float actualResult=materia.promedio(nota1,nota2,nota3);
        assertEquals(expResult,actualResult,delta);
         
     }
     
}
