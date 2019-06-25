
package Modelo;


public class Video {
    private int aula_id;
    private int usuario_id;
    private String ruta_video;
    
    public Video(){
        
    }

    public Video(int aula_id, int usuario_id, String ruta_video) {
        this.aula_id = aula_id;
        this.usuario_id = usuario_id;
        this.ruta_video = ruta_video;
    }

    public int getAula_id() {
        return aula_id;
    }

    public void setAula_id(int aula_id) {
        this.aula_id = aula_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getRuta_video() {
        return ruta_video;
    }

    public void setRuta_video(String ruta_video) {
        this.ruta_video = ruta_video;
    }
    
    
    
}
