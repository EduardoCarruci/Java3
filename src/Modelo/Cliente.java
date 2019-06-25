package Modelo;


import java.io.File;
import java.sql.Blob;


public class Cliente {
    
    private int idCliente;

    private Blob foto;
    private byte[] pdf;
    
    private File fotox;
    private File pdfx;

    public Cliente(int idCliente, Blob foto, byte[] pdf) {
        this.idCliente = idCliente;
        this.foto = foto;
        this.pdf = pdf;
    }

    public Cliente(int idCliente, File fotox, File pdfx) {
        this.idCliente = idCliente;
        this.fotox = fotox;
        this.pdfx = pdfx;
    }
     public Cliente(int idCliente){
         this.idCliente=idCliente;
     }

    public File getFotox() {
        return fotox;
    }

    public void setFotox(File fotox) {
        this.fotox = fotox;
    }

    public File getPdfx() {
        return pdfx;
    }

    public void setPdfx(File pdfx) {
        this.pdfx = pdfx;
    }

   

    public Cliente(){
        
    }
    
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

  
    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public byte[] getPdf() {
        return pdf;
    }

    public void setPdf(byte[] pdf) {
        this.pdf = pdf;
    }
    
    
    
}
