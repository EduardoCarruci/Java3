
package Modelo;

import java.io.File;
import java.sql.Blob;

public class Tareas {
    private Blob tareas;
    private File foto;
    private int id_maestr;
    private int calificaciones_id;

    public Tareas(File foto, int id_maestr, int calificaciones_id) {
        this.foto = foto;
        this.id_maestr = id_maestr;
        this.calificaciones_id = calificaciones_id;
    }

    
    public Tareas(){
        
        
        
    }

    public Blob getTareas() {
        return tareas;
    }

    public void setTareas(Blob tareas) {
        this.tareas = tareas;
    }

    public File getFoto() {
        return foto;
    }

    public void setFoto(File foto) {
        this.foto = foto;
    }

    public int getId_maestr() {
        return id_maestr;
    }

    public void setId_maestr(int id_maestr) {
        this.id_maestr = id_maestr;
    }

    public int getCalificaciones_id() {
        return calificaciones_id;
    }

    public void setCalificaciones_id(int calificaciones_id) {
        this.calificaciones_id = calificaciones_id;
    }
        


    
}
