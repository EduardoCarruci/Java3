
package Controlador;

import Modelo.TipoUsuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import otros.Conexion;

public class FTipoUsuario {
     private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    private TipoUsuario tipo;
    
    public FTipoUsuario( ){
        tipo = new TipoUsuario();
    }
    
    public ArrayList consultaTipoUser( ) {
       
       
       ArrayList<Object> registro = new ArrayList<Object>();

        sSQL = "select tipo_user.nombre from tipo_user;";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro.add(rs.getObject("tipo_user.nombre"));

            }
           
            
           return registro;
        } catch (Exception e) {
            
            System.out.println("consultado tipos de usuarios con error");
            return null;
          
        }
    }
    
    
}
