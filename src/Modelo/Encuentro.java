
package Modelo;

import java.sql.Date;


public class Encuentro {
    
    
    private Date fecha;
    private String contenido;
    private int maestra_id;

    public Encuentro(Date fecha, String contenido, int maestra_id) {
        this.fecha = fecha;
        this.contenido = contenido;
        this.maestra_id = maestra_id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getMaestra_id() {
        return maestra_id;
    }

    public void setMaestra_id(int maestra_id) {
        this.maestra_id = maestra_id;
    }
    
    
    
    
}
