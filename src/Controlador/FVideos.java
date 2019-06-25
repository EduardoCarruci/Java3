
package Controlador;

import Modelo.Asistencia;
import Modelo.Video;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import otros.Conexion;


public class FVideos {
    
     private Video video;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    public FVideos(int aula_id, int usuario_id, String ruta_video){
        video = new Video(aula_id, usuario_id, ruta_video);
    }
    
     public boolean insertar() {
        sSQL = "insert into videos (aula_id,usuario_id,ruta_video)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setInt(1,video.getAula_id());
            
             pst.setInt(2, video.getUsuario_id());
             pst.setString(3, video.getRuta_video());
            
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado del video");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
    
    
    
    
    
}
