
package Modelo;

import java.io.File;
import java.sql.Blob;


public class Aula {
    private String nombre;
    private Blob foto;
    private File fotox;
    private int capacidad;

    public Aula(String nombre, File fotox, int capacidad) {
        this.nombre = nombre;
        this.fotox = fotox;
        this.capacidad = capacidad;
    }
    
    public Aula(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public File getFotox() {
        return fotox;
    }

    public void setFotox(File fotox) {
        this.fotox = fotox;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
