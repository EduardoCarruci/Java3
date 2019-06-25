
package Controlador;

import Modelo.Aula;
import Modelo.Calificaciones;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import otros.Conexion;


public class FCalificaciones {
    private Calificaciones calificaciones;
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    
    
    
    public FCalificaciones(int nota, int id_boleta){
        calificaciones = new Calificaciones(nota, id_boleta);
    }
    
    public FCalificaciones(){
        
    }
    
    public boolean guardar() {
        sSQL = "insert into calificaciones (nota,id_boleta)"
                + "values (?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            pst.setInt(1, calificaciones.getNota());

            pst.setInt(2, calificaciones.getId_boleta());
            

            Integer n = pst.executeUpdate();
            if (n != 0) {
                System.out.println("Guardado exitoso en Calificacion ");
                return true;
      
            } else {
                return false;
            }

        } catch (Exception e) {
            
             System.out.println(" "+e);
            return false;
        }

    }
    
    
     public ArrayList consulta_Calificaciones() {
          ArrayList<Object> registro = new ArrayList<Object>();
        sSQL = "select id from calificaciones ";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
          

            while (rs.next()) {
                
              
              registro.add(rs.getObject("id"));
              
              
            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("mori buscando tu registro en consulta_Calificaciones ");
            return null;
          
        }
    }
}
