
package Controlador;

import Modelo.Asistencia;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import otros.Conexion;


public class FAsistencia {
    private Asistencia asistencia;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public FAsistencia(String asistencia_S_N, File fotox, String comentario, String justificativo, int niños_id, int encuentro_clase_id) {
    asistencia = new Asistencia(asistencia_S_N, fotox, comentario, justificativo, niños_id, encuentro_clase_id);
    
    }
    public FAsistencia(String asistencia_S_N, int niños_id, int encuentro_clase_id) {
    asistencia = new Asistencia(asistencia_S_N, niños_id, encuentro_clase_id);
    
    }
      public boolean insertar() {
        sSQL = "insert into asistencia (asistencia_S_N,foto,comentario,justificativo,niños_id,encuentro_clase_id)"
                + "values (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setString(1,asistencia.getAsistencia_S_N());
            FileInputStream archivo;     
            archivo = new FileInputStream(asistencia.getFotox());
            pst.setBinaryStream(2, archivo);
            pst.setString(3,asistencia.getComentario());

             pst.setString(4, asistencia.getJustificativo());
             pst.setInt(5, asistencia.getNiños_id());
             pst.setInt(6, asistencia.getEncuentro_clase_id());
            
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado de la asistencia exitoso ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
      public boolean guardadoYES() {
        sSQL = "insert into asistencia (asistencia_S_N,niños_id,encuentro_clase_id)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
            pst.setString(1,asistencia.getAsistencia_S_N());
           
             pst.setInt(2, asistencia.getNiños_id());
             pst.setInt(3, asistencia.getEncuentro_clase_id());
            
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado de la asistencia exitoso para un YES");
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
