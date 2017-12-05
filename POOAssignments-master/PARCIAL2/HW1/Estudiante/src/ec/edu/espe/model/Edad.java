/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Edad {
    
        private String dia;
        private String mes;
        private String anio;
        private int dias;
        private int meses;
        private int anios;
        private  String fecha;
       
    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }   
    
       
        
    public int getdias()
   {
       fecha=dia+mes+anio;
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy");
    LocalDate fechaNac = LocalDate.parse(fecha, fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);

       return dias=periodo.getDays();
   }   
        
   public int getdmeses()
   {
       fecha=dia+mes+anio;
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy");
    LocalDate fechaNac = LocalDate.parse(fecha, fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
       return meses=periodo.getMonths();
   }
   public int getanios()
   {
       fecha=dia+mes+anio;
       DateTimeFormatter fmt = DateTimeFormatter.ofPattern("ddMMyyyy");
    LocalDate fechaNac = LocalDate.parse(fecha, fmt);
    LocalDate ahora = LocalDate.now();

    Period periodo = Period.between(fechaNac, ahora);
       return anios=periodo.getYears();
   }
     
}
