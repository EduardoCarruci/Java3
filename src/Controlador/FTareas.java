
package Controlador;

import Modelo.Maestra;
import Modelo.Tareas;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import otros.Conexion;

public class FTareas {
     private Tareas tareas;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public FTareas(File foto, int id_maestr, int calificaciones_id){
        tareas = new Tareas(foto, id_maestr, calificaciones_id);
    }
    
    public FTareas(){
        
    }
    
     
    public boolean insertar() {
        sSQL = "insert into tareas (tareas,id_maestr,calificaciones_id)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           
          FileInputStream archivo;     
            archivo = new FileInputStream(tareas.getFoto());
            pst.setBinaryStream(1, archivo);
            
            //--------------
            pst.setInt(2,tareas.getId_maestr());
            pst.setInt(3,tareas.getCalificaciones_id());
 
           
            

   
            //-------------------
          
           
            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado de la maestra exitoso ");
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
