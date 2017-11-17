/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;

/**
 *
 * @author usuario
 * 
 * 
 */
public class Animal {
    
     private int id;
    private String eyes;
    private String name;

    public Animal(int id, String eyes, String name) {
        this.id = id;
        this.eyes = eyes;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void seteyes(String eyes) {
        this.eyes = eyes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getEyes() {
        return eyes;
    }

    public String getName() {
        return name;
    }
    
   
   
    
}
