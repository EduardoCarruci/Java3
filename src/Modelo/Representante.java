
package Modelo;

import java.io.File;
import java.sql.Blob;


public class Representante {
    private String nombre;
     private String apellido;
     private Blob foto;
     private File fotox;
     private String identificador_MA_PA;
     private int usuario_id;

    public Representante(String nombre, String apellido, File fotox, String identificador_MA_PA, int usuario_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fotox = fotox;
        this.identificador_MA_PA = identificador_MA_PA;
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getIdentificador_MA_PA() {
        return identificador_MA_PA;
    }

    public void setIdentificador_MA_PA(String identificador_MA_PA) {
        this.identificador_MA_PA = identificador_MA_PA;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
     
    
}
