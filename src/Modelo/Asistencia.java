
package Modelo;

import java.io.File;
import java.sql.Blob;


public class Asistencia {
    private String asistencia_S_N;
    private Blob foto;
    private File fotox;
    private String comentario;
    private String justificativo;
    private int niños_id;
    private int encuentro_clase_id;

    public Asistencia(String asistencia_S_N, File fotox, String comentario, String justificativo, int niños_id, int encuentro_clase_id) {
        this.asistencia_S_N = asistencia_S_N;
        this.fotox = fotox;
        this.comentario = comentario;
        this.justificativo = justificativo;
        this.niños_id = niños_id;
        this.encuentro_clase_id = encuentro_clase_id;
    }
     public Asistencia(String asistencia_S_N, int niños_id, int encuentro_clase_id) {
        this.asistencia_S_N = asistencia_S_N;
        
        this.niños_id = niños_id;
        this.encuentro_clase_id = encuentro_clase_id;
    }

    public String getAsistencia_S_N() {
        return asistencia_S_N;
    }

    public void setAsistencia_S_N(String asistencia_S_N) {
        this.asistencia_S_N = asistencia_S_N;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getJustificativo() {
        return justificativo;
    }

    public void setJustificativo(String justificativo) {
        this.justificativo = justificativo;
    }

    public int getNiños_id() {
        return niños_id;
    }

    public void setNiños_id(int niños_id) {
        this.niños_id = niños_id;
    }

    public int getEncuentro_clase_id() {
        return encuentro_clase_id;
    }

    public void setEncuentro_clase_id(int encuentro_clase_id) {
        this.encuentro_clase_id = encuentro_clase_id;
    }
    
    
    
}
