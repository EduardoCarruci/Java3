
package Controlador;

import Modelo.Encuentro;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import otros.Conexion;

public class FEncuentro {
    
    private Encuentro encuentro;
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    public FEncuentro(Date fecha, String contenido, int maestra_id) {
        encuentro = new Encuentro(fecha, contenido, maestra_id);
    }
    public FEncuentro(){
        
    }
    public boolean insertar() {
        sSQL = "insert into encuentro_clase (fecha,contenido,maestra_id)"
                + "values (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
           // pst.setInt(1, niños.getId());
           
            pst.setDate(1,encuentro.getFecha());
            pst.setString(2,encuentro.getContenido());
            pst.setInt(3,encuentro.getMaestra_id());

            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado del encuentro  ");
                return true;
                
                
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(""+e);
            return false;
        }

    }
    
    
    
    
     public ArrayList consultaEncuentro() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id,fecha,contenido from encuentro_clase ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("Consulta de encuentro");
            return null;
          
        }
    }
     
     
     public ArrayList sumarEncuentro(){
          ArrayList<Object> registro = new ArrayList<Object>();
         sSQL = "select count(id) from encuentro_clase;";
         
         try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("suma encuentro");
            return null;
          
        }
     }
    
    
    
}
