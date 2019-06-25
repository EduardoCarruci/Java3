
package Modelo;

public class Calificaciones {
    private int nota;
    private int id_boleta;
    
    public Calificaciones (){
        
    }

    public Calificaciones(int nota, int id_boleta) {
        this.nota = nota;
        this.id_boleta = id_boleta;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }
    
}
