
package Modelo;

import java.io.File;
import java.sql.Blob;
import java.sql.Date;



public class Niños {
 private int id;
 private String nombre;
 private String apellido;
 private int edad;
 private Date fecha_nacimiento;
 private String direccion;
 
 private Blob fotoniño;
 private File fotoNiño;
 
 private Blob foto_familiar;
 private File Foto_Familiar;
 
 private byte[] partida_nacimiento;
 private File Partida_Nacimiento;
 
  private byte[] servicio;
 private File ServicioFile;
 
  private byte[] vacunas;
 private File Vacunasfile;
 
  private byte[] InformeMedico;
 private File Informe_Medico;
 
 private int nivel_aprendizaje;

    public Niños(
    String nombre,
    String apellido,
    int edad,
    Date fecha_nacimiento,
    String direccion,
    File fotoNiño,
    File Foto_Familiar,
    File Partida_Nacimiento,
    File ServicioFile,
    File Vacunasfile,
    File Informe_Medico,
    int nivel_aprendizaje){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.fecha_nacimiento=fecha_nacimiento;
        this.direccion=direccion;
        this.fotoNiño=fotoNiño;
        this.Foto_Familiar=Foto_Familiar;
        this.Partida_Nacimiento=Partida_Nacimiento;
        this.ServicioFile=ServicioFile;
        this.Vacunasfile=Vacunasfile;
        this.Informe_Medico=Informe_Medico;
        this.nivel_aprendizaje=nivel_aprendizaje;
        
    }
    public Niños(
    String nombre,
    String apellido,
    int edad,
    Date fecha_nacimiento,
    String direccion,
    File fotoNiño,
    File Foto_Familiar,
    File Partida_Nacimiento,
    File ServicioFile,
    File Vacunasfile,
    int nivel_aprendizaje){
        
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.fecha_nacimiento=fecha_nacimiento;
        this.direccion=direccion;
        this.fotoNiño=fotoNiño;
        this.Foto_Familiar=Foto_Familiar;
        this.Partida_Nacimiento=Partida_Nacimiento;
        this.ServicioFile=ServicioFile;
        this.Vacunasfile=Vacunasfile;
        this.nivel_aprendizaje=nivel_aprendizaje;
        
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Blob getFotoniño() {
        return fotoniño;
    }

    public void setFotoniño(Blob fotoniño) {
        this.fotoniño = fotoniño;
    }

    public File getFotoNiño() {
        return fotoNiño;
    }

    public void setFotoNiño(File fotoNiño) {
        this.fotoNiño = fotoNiño;
    }

    public Blob getFoto_familiar() {
        return foto_familiar;
    }

    public void setFoto_familiar(Blob foto_familiar) {
        this.foto_familiar = foto_familiar;
    }

    public File getFoto_Familiar() {
        return Foto_Familiar;
    }

    public void setFoto_Familiar(File Foto_Familiar) {
        this.Foto_Familiar = Foto_Familiar;
    }

    public byte[] getPartida_nacimiento() {
        return partida_nacimiento;
    }

    public void setPartida_nacimiento(byte[] partida_nacimiento) {
        this.partida_nacimiento = partida_nacimiento;
    }

    public File getPartida_Nacimiento() {
        return Partida_Nacimiento;
    }

    public void setPartida_Nacimiento(File Partida_Nacimiento) {
        this.Partida_Nacimiento = Partida_Nacimiento;
    }

    public byte[] getServicio() {
        return servicio;
    }

    public void setServicio(byte[] servicio) {
        this.servicio = servicio;
    }

    public File getServicioFile() {
        return ServicioFile;
    }

    public void setServcio(File ServicioFile) {
        this.ServicioFile = ServicioFile;
    }

    public byte[] getVacunas() {
        return vacunas;
    }

    public void setVacunas(byte[] vacunas) {
        this.vacunas = vacunas;
    }

    public File getVacunasfile() {
        return Vacunasfile;
    }

    public void setVacunasfile(File Vacunasfile) {
        this.Vacunasfile = Vacunasfile;
    }

    public byte[] getInformeMedico() {
        return InformeMedico;
    }

    public void setInformeMedico(byte[] InformeMedico) {
        this.InformeMedico = InformeMedico;
    }

    public File getInforme_Medico() {
        return Informe_Medico;
    }

    public void setInforme_Medico(File Informe_Medico) {
        this.Informe_Medico = Informe_Medico;
    }

    public int getNivel_aprendizaje() {
        return nivel_aprendizaje;
    }

    public void setNivel_aprendizaje(int nivel_aprendizaje) {
        this.nivel_aprendizaje = nivel_aprendizaje;
    }

    

 
    
}
