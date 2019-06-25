
package Modelo;

import java.io.File;
import java.sql.Blob;


public class Maestra {
    private int id;
    private String nombre;
    private String apellido;
    private String direccion;
    
    private Blob foto;
    private File fotoxpersonal;
    
    private Blob cedula;
    private File cedulax;
    
    private Blob titulo;
    private File titulox;
    
    private int usuario_id;

    public Maestra( String nombre, String apellido, String direccion, File fotoxpersonal, File cedulax, File titulox, int usuario_id) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fotoxpersonal = fotoxpersonal;
        this.cedulax = cedulax;
        this.titulox = titulox;
        this.usuario_id = usuario_id;
    }
    
    
    public Maestra(){
        
    }        
      

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public File getFotoxpersonal() {
        return fotoxpersonal;
    }

    public void setFotox(File fotoxpersonal) {
        this.fotoxpersonal = fotoxpersonal;
    }

    public Blob getCedula() {
        return cedula;
    }

    public void setCedula(Blob cedula) {
        this.cedula = cedula;
    }

    public File getCedulax() {
        return cedulax;
    }

    public void setCedulax(File cedulax) {
        this.cedulax = cedulax;
    }

    public Blob getTitulo() {
        return titulo;
    }

    public void setTitulo(Blob titulo) {
        this.titulo = titulo;
    }

    public File getTitulox() {
        return titulox;
    }

    public void setTitulox(File titulox) {
        this.titulox = titulox;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }
}
