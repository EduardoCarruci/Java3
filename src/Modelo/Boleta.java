
package Modelo;


public class Boleta {
    private String comentarios;
    private int niños;

    public Boleta(String comentarios, int niños) {
        this.comentarios = comentarios;
        this.niños = niños;
    }
    
    
    
    public Boleta(){
        
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public int getNiños() {
        return niños;
    }

    public void setNiños(int niños) {
        this.niños = niños;
    }
    
    
}
