/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author usuario
 */
public class Analyst {

    public Analyst(String name, String inicials, History history) {
        this.name = name;
        this.inicials = inicials;
        this.history = history;
    }
    
    
     private String name;
     private String inicials;
     private History history;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the inicials
     */
    public String getInicials() {
        return inicials;
    }

    /**
     * @param inicials the inicials to set
     */
    public void setInicials(String inicials) {
        this.inicials = inicials;
    }

    /**
     * @return the history
     */
    public History getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(History history) {
        this.history = history;
    }
    
}
