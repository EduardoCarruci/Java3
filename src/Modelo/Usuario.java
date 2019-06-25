
package Modelo;

import java.io.File;
import java.sql.Blob;


public class Usuario {
    private int id;
    private String usuario;
    private String password;
    private String correo;
    
    private Blob avatar;
    private File fotoAvatar;
    
    private int id_tipo;

    public Usuario(String usuario,String password,String correo, File fotoAvatar, int id_tipo) {
        
        this.usuario = usuario;
        this.password=password;
        this.correo = correo;
        this.fotoAvatar = fotoAvatar;
        this.id_tipo = id_tipo;
    }
    
    public Usuario(){
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public File getFotoAvatar() {
        return fotoAvatar;
    }

    public void setFotoAvatar(File fotoAvatar) {
        this.fotoAvatar = fotoAvatar;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
    
    
    
    
}
