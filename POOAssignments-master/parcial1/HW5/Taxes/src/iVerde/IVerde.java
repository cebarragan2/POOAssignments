/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iVerde;

/**
 *
 * @author usuario
 */
public class IVerde {
    public static float compute (int cilindraje, int año)
    {
       float IACV;
       float t = 0;
       float fa = 0;
       float x;
       
       if (cilindraje<1500) t=0.0f;
       if (cilindraje>1500&&cilindraje<=2000) t=0.08f;
       if (cilindraje>2000&&cilindraje<=2500) t=0.09f;
       if (cilindraje>2500&&cilindraje<=3000) t=0.11f;
       if (cilindraje>3000&&cilindraje<=3500) t=0.12f;
       if (cilindraje>3500&&cilindraje<=4000) t=0.24f;
       if (cilindraje>4000) t=0.35f;
       
       if ((2017-año)<5) fa=0.0f;
       if ((2017-año)>=5&&(2017-año)<=10) fa=0.05f;
       if ((2017-año)>=11&&(2017-año)<=15) fa=0.10f;
       if ((2017-año)>=16&&(2017-año)<=20) fa=0.15f;
       if ((2017-año)>20) fa=0.20f;
       x=(float)cilindraje-1500.0f;
       IACV=(x*t)*(1.0f+fa);
      return IACV;
    }
}
