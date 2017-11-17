/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arreglos.modelo;

/**
 *
 * @author usuario
 */
public class Libro {

    public Libro(String nombre, int paginas, String tipo) {
        this.nombre = nombre;
        this.paginas = paginas;
        this.tipo = tipo;
    }
    private String nombre;
    private int paginas;
    private String tipo;

    public String getNombre() {
        return nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
